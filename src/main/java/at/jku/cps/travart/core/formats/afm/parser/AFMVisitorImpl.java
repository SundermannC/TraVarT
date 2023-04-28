package at.jku.cps.travart.core.formats.afm.parser;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

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

    public AFMVisitorImpl() {
        featureModel = new FeatureModel();
    }

    public FeatureModel getModel() {
        return featureModel;
    }

    private void addFeatureToGroup(String name, Group parentGroup) {
        Feature feature = new Feature(name);
        featureModel.getFeatureMap().put(name, feature);
        parentGroup.getFeatures().add(feature);
    }

    // private Constraint visitSpecificExpression(ExpressionContext ctx) {
    // if (ctx.getRuleContext().getClass() == ArithmeticExpContext.class) {
    // return visitArithmeticExp((ArithmeticExpContext) ctx);
    // } else if (ctx.getClass() == AndExpContext.class) {

    // } else if (ctx.getClass() == ParenthesisExpContext.class) {
    // return visitArithmeticExp(null);

    // } else if (ctx.getClass() == OrExpContext.class) {
    // return visitArithmeticExp(null);

    // } else if (ctx.getClass() == LogicalExpContext.class) {
    // return visitArithmeticExp(null);

    // } else if (ctx.getClass() == AtomContext.class) {
    // return visitArithmeticExp(null);

    // } else if (ctx.getClass() == NotExpContext.class) {
    // return visitArithmeticExp(null);

    // }
    // return null;
    // }

    @Override
    public Constraint visitRelationship_spec(Relationship_specContext ctx) {
        String parentFeatureName = ctx.init_spec().WORD().getText();
        Feature parentFeature;
        if (featureModel.getFeatureMap().containsKey(parentFeatureName)) {
            parentFeature = featureModel.getFeatureMap().get(parentFeatureName);
        } else { // Should only happen if root feature
            parentFeature = new Feature(ctx.init_spec().WORD().getText());
            featureModel.setRootFeature(parentFeature);
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
            } else {
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

    // @Override
    // public Object visitAttribute_spec(Attribute_specContext ctx) {
    // // TODO Auto-generated method stub
    // return null;
    // }

    // @Override
    // public Object visitAttribute_name(Attribute_nameContext ctx) {
    // // TODO Auto-generated method stub
    // return null;
    // }

    // @Override
    // public Object visitAttribute_domain(Attribute_domainContext ctx) {
    // // TODO Auto-generated method stub
    // return null;
    // }

    // @Override
    // public Object visitDiscrete_domain_spec(Discrete_domain_specContext ctx) {
    // // TODO Auto-generated method stub
    // return null;
    // }

    // @Override
    // public Object visitRange_domain_spec(Range_domain_specContext ctx) {
    // // TODO Auto-generated method stub
    // return null;
    // }

    // @Override
    // public Object visitDomain_range(Domain_rangeContext ctx) {
    // // TODO Auto-generated method stub
    // return null;
    // }

    // @Override
    // public Object visitAttribute_default_value(Attribute_default_valueContext
    // ctx) {
    // // TODO Auto-generated method stub
    // return null;
    // }

    // @Override
    // public Object visitAttribute_null_value(Attribute_null_valueContext ctx) {
    // // TODO Auto-generated method stub
    // return null;
    // }

    // @Override
    // public Object visitValue_spec(Value_specContext ctx) {
    // // TODO Auto-generated method stub
    // return null;
    // }

    // @Override
    // public Object visitConstraints_block(Constraints_blockContext ctx) {
    // // TODO Auto-generated method stub
    // return null;
    // }

    // @Override
    // public Constraint visitConstraint_spec(Constraint_specContext ctx) {
    // if (ctx.brackets_spec() != null && !ctx.brackets_spec().isEmpty()) {
    // // TODO Handling
    // }
    // if (ctx.simple_spec() != null && !ctx.brackets_spec().isEmpty()) {
    // visitChildren(ctx);
    // }

    // return null;
    // }

    // @Override
    // public Object visitBrackets_spec(Brackets_specContext ctx) {
    // // TODO Auto-generated method stub
    // return null;
    // }

    @Override
    public Constraint visitSimple_spec(Simple_specContext ctx) {
        Constraint constraint = ctx.expression().accept(this);
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
        return new AndConstraint(ctx.expression(0).accept(this), ctx.expression(1).accept(this));
    }

    @Override
    public Constraint visitParenthesisExp(ParenthesisExpContext ctx) {
        return new ParenthesisConstraint(ctx.expression().accept(this));
    }

    @Override
    public Constraint visitRelationalExp(RelationalExpContext ctx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Constraint visitOrExp(OrExpContext ctx) {
        return new OrConstraint(ctx.expression(0).accept(this), ctx.expression(1).accept(this));
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
        return new NotConstraint(ctx.expression().accept(this));
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
