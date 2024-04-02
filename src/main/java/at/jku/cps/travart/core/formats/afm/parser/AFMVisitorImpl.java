package at.jku.cps.travart.core.formats.afm.parser;



import java.util.LinkedHashSet;
import java.util.Set;

import com.google.errorprone.annotations.OverridingMethodsMustInvokeSuper;

import at.jku.cps.travart.core.formats.afm.parser.AFMParser.AndExpContext;
import at.jku.cps.travart.core.formats.afm.parser.AFMParser.ArithmeticExpContext;
import at.jku.cps.travart.core.formats.afm.parser.AFMParser.AtomContext;
import at.jku.cps.travart.core.formats.afm.parser.AFMParser.LogicalExpContext;
import at.jku.cps.travart.core.formats.afm.parser.AFMParser.NotExpContext;
import at.jku.cps.travart.core.formats.afm.parser.AFMParser.OrExpContext;
import at.jku.cps.travart.core.formats.afm.parser.AFMParser.ParenthesisExpContext;
import at.jku.cps.travart.core.formats.afm.parser.AFMParser.RelationalExpContext;
import at.jku.cps.travart.core.formats.afm.parser.AFMParser.Relationship_specContext;
import at.jku.cps.travart.core.formats.afm.parser.AFMParser.Simple_specContext;
import de.vill.model.Feature;
import de.vill.model.FeatureModel;
import de.vill.model.Group;
import de.vill.model.Group.GroupType;
import de.vill.model.constraint.AndConstraint;
import de.vill.model.constraint.Constraint;
import de.vill.model.constraint.EquivalenceConstraint;
import de.vill.model.constraint.ImplicationConstraint;
import de.vill.model.constraint.LiteralConstraint;
import de.vill.model.constraint.NotConstraint;
import de.vill.model.constraint.OrConstraint;
import de.vill.model.constraint.ParenthesisConstraint;

public class AFMVisitorImpl extends AFMBaseVisitor<Constraint> {

    private FeatureModel featureModel;
    private Feature root;
    private boolean rootInitialized;
    private boolean hasSynthesizedRoot;

    public AFMVisitorImpl() {
        featureModel = new FeatureModel();
        rootInitialized = false;
        hasSynthesizedRoot = false;
    }

    public FeatureModel getModel() {
        return featureModel;
    }

    private void addFeatureToGroup(String name, Group parentGroup) {
        Feature feature = new Feature(name);
        featureModel.getFeatureMap().put(name, feature);
        parentGroup.getFeatures().add(feature);
    }

    private Feature addRootFeature(String name) {
        Feature feature = new Feature(name);
        featureModel.getFeatureMap().put(name, feature);
        featureModel.setRootFeature(feature);
        rootInitialized = true;
        root = feature;
        return feature;
    }

    private void addSynthesizedRoot() {
        Feature feature = new Feature("Synthesized__Root");
        Group rootGroup = new Group(GroupType.MANDATORY);
        featureModel.getFeatureMap().put(feature.getFeatureName(), feature);
        featureModel.setRootFeature(feature);
        rootGroup.setParentFeature(feature);
        rootGroup.getFeatures().add(root);
        root = feature;
        feature.addChildren(rootGroup);
        hasSynthesizedRoot = true;
    }

    @Override
    public Constraint visitRelationship_spec(Relationship_specContext ctx) {
        String parentFeatureName = ctx.init_spec().WORD().getText();
        Feature parentFeature;
        if (featureModel.getFeatureMap().containsKey(parentFeatureName)) {
            parentFeature = featureModel.getFeatureMap().get(parentFeatureName);
        } else { // Should only happen if root feature
            if (!rootInitialized) {
                parentFeature = addRootFeature(ctx.init_spec().WORD().getText());
            } else if (!hasSynthesizedRoot) {
                addSynthesizedRoot();
            }
            parentFeature = root;
        }
        Group optionalChildren = new Group(GroupType.OPTIONAL);
        Group mandatoryChildren = new Group(GroupType.MANDATORY);
        for (var child : ctx.non_cardinal_spec()) {
            if (child.obligatory_spec() != null && !child.obligatory_spec().isEmpty()) {
                String childName = child.obligatory_spec().WORD().getText();
                addFeatureToGroup(childName, mandatoryChildren);
            } else if (child.optional_spec() != null && !child.optional_spec().isEmpty()) {
                String childName = child.optional_spec().WORD().getText();
                addFeatureToGroup(childName, optionalChildren);
            }
        }
        if (!optionalChildren.getFeatures().isEmpty()) {
            parentFeature.addChildren(optionalChildren);
        }

        if (!mandatoryChildren.getFeatures().isEmpty()) {
            parentFeature.addChildren(mandatoryChildren);
        }

        for (var child : ctx.cardinal_spec()) {
            String lowerBound = child.cardinality().INT(0).getText();
            String upperBound = child.cardinality().INT(1).getText();
            Group cardGroup;
            if (Integer.valueOf(lowerBound) == 1 && Integer.valueOf(upperBound) == 1) {
                cardGroup = new Group(GroupType.ALTERNATIVE);
            } else if (Integer.valueOf(lowerBound) == 1 && child.obligatory_spec().size() == Integer.valueOf(upperBound)) {
                cardGroup = new Group(GroupType.OR);
            }
            else {
                cardGroup = new Group(GroupType.GROUP_CARDINALITY);
                cardGroup.setLowerBound(lowerBound);
                cardGroup.setUpperBound(upperBound);
            }
            for (var feature : child.obligatory_spec()) {
                addFeatureToGroup(feature.WORD().getText(), cardGroup);
            }
            parentFeature.addChildren(cardGroup);
        }
        return null;
    }

    @Override
    public Constraint visitSimple_spec(Simple_specContext ctx) {
        Constraint constraint = ctx.expression().accept(this);
        if (constraint == null) return null;
        for (String containedFeature : getContainedFeatures(constraint)) {
            if (!featureModel.getFeatureMap().containsKey(containedFeature)) {
                System.out.println("Skipped Constraint: " + constraint.toString());
                return null;
            }
        }
        featureModel.getOwnConstraints().add(constraint);
        return null;
    }

    private Set<String> getContainedFeatures(Constraint constraint) {
        Set<String> names = new LinkedHashSet<>();
        if (constraint instanceof LiteralConstraint) {
            LiteralConstraint literal = (LiteralConstraint) constraint;
            names.add(literal.getLiteral());
        } else {
            for (Constraint subConstraint : constraint.getConstraintSubParts()) {
                names.addAll(getContainedFeatures(subConstraint));
            }
        }
        return names;
    }

    @Override
    public Constraint visitArithmeticExp(ArithmeticExpContext ctx) {
        return null;
    }

    @Override
    public Constraint visitAndExp(AndExpContext ctx) {
        Constraint left = ctx.expression(0).accept(this);
        Constraint right = ctx.expression(1).accept(this);
        if (left == null || right == null) {
            return null;
        } 
        return new AndConstraint(left, right);
    }

    @Override
    public Constraint visitParenthesisExp(ParenthesisExpContext ctx) {
        Constraint constraint = ctx.expression().accept(this);
        if (constraint == null) return null;
        return new ParenthesisConstraint(constraint);
    }

    @Override
    public Constraint visitRelationalExp(RelationalExpContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Constraint visitOrExp(OrExpContext ctx) {
        Constraint left = ctx.expression(0).accept(this);
        Constraint right = ctx.expression(1).accept(this);
        if (left == null || right == null) {
            return null;
        } 
        return new OrConstraint(left, right);
    }

    @Override
    public Constraint visitAtom(AtomContext ctx) {
        if (ctx.variable() != null) {
            if (ctx.variable().getText().contains(".")) {
                return null;
            } else {
                return new LiteralConstraint(ctx.variable().WORD(0).getText());
            }
        } else {
            return null;
        }
    }

    @Override
    public Constraint visitLogicalExp(LogicalExpContext ctx) {
        Constraint left = ctx.expression(0).accept(this);
        Constraint right = ctx.expression(1).accept(this);
        if (left == null || right == null) return null;
        if (ctx.logical_operator().EXCLUDES() != null) {
            return new ImplicationConstraint(left, new NotConstraint(right));
        } else if (ctx.logical_operator().IFF() != null) {
            return new EquivalenceConstraint(left, right);
        } else if (ctx.logical_operator().IMPLIES() != null) {
            return new ImplicationConstraint(left, right);
        } else if (ctx.logical_operator().REQUIRES() != null) {
            return new ImplicationConstraint(left, right);
        }

        return null;
    }

    @Override
    public Constraint visitNotExp(NotExpContext ctx) {
        Constraint constraint = ctx.expression().accept(this);
        if (constraint == null) {
            return null;
        }
        return new NotConstraint(constraint);
    }

    @Override
    public Constraint visitERROR(AFMParser.ERRORContext ctx) {
        return null;
    }

    // @Override
    // public Object visitLogical_operator(Logical_operatorContext ctx) {
    // // TODO Auto-generated method stub
    // return null;
    // }

    // @Override
    // public Object visitArithmetic_operator(Arithmetic_operatorContext ctx) {
    // // TODO Auto-generated method stub
    // return null;
    // }

    // @Override
    // public Object visitRelational_operator(Relational_operatorContext ctx) {
    // // TODO Auto-generated method stub
    // return null;
    // }

    // @Override
    // public Object visitNumber(NumberContext ctx) {
    // // TODO Auto-generated method stub
    // return null;
    // }

    // @Override
    // public Object visitVariable(VariableContext ctx) {
    // // TODO Auto-generated method stub
    // return null;
    // }

}
