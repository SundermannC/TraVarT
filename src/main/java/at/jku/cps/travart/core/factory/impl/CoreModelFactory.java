package at.jku.cps.travart.core.factory.impl;

import at.jku.cps.travart.core.factory.ICoreModelFactory;
import de.vill.model.Feature;
import de.vill.model.FeatureModel;
import de.vill.model.constraint.AndConstraint;
import de.vill.model.constraint.Constraint;
import de.vill.model.constraint.EquivalenceConstraint;
import de.vill.model.constraint.ImplicationConstraint;
import de.vill.model.constraint.LiteralConstraint;
import de.vill.model.constraint.NotConstraint;
import de.vill.model.constraint.OrConstraint;
import de.vill.model.constraint.ParenthesisConstraint;
import java.util.Objects;

public final class CoreModelFactory implements ICoreModelFactory {

    public static final String ID = "at.jku.cps.travart.core.factory.impl.CoreModelFactory";

    private static CoreModelFactory factory;

    private CoreModelFactory() {

    }

    public static CoreModelFactory getInstance() {
        if (factory == null) {
            factory = new CoreModelFactory();
        }
        return factory;
    }

    @Override
    public String getId() {
        return ID;
    }

    @Override
    public FeatureModel create() {
        return new FeatureModel();
    }

    @Override
    public Feature createFeature(final String id) {
        return new Feature(Objects.requireNonNull(id));
    }

    @Override
    public ImplicationConstraint createImplicationConstraint(final Constraint left, final Constraint right) {
        return new ImplicationConstraint(Objects.requireNonNull(left), Objects.requireNonNull(right));
    }

    @Override
    public EquivalenceConstraint createEquivalenceConstraint(final Constraint left, final Constraint right) {
        return new EquivalenceConstraint(Objects.requireNonNull(left), Objects.requireNonNull(right));
    }

    @Override
    public AndConstraint createAndConstraint(final Constraint left, final Constraint right) {
        return new AndConstraint(Objects.requireNonNull(left), Objects.requireNonNull(right));
    }

    @Override
    public OrConstraint createOrConstraint(final Constraint left, final Constraint right) {
        return new OrConstraint(Objects.requireNonNull(left), Objects.requireNonNull(right));
    }

    @Override
    public NotConstraint createNotConstraint(final Constraint constraint) {
        return new NotConstraint(Objects.requireNonNull(constraint));
    }

    @Override
    public ParenthesisConstraint createParenthesisConstraint(final Constraint constraint) {
        return new ParenthesisConstraint(Objects.requireNonNull(constraint));
    }

    @Override
    public LiteralConstraint createLiteralConstraint(final String id) {
        return new LiteralConstraint(Objects.requireNonNull(id));
    }
}
