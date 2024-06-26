package at.jku.cps.travart.core.common;

import java.util.logging.Logger;

/**
 * This base interface defines methods to derive statistics of a given
 * variability model of type <T>.
 *
 * @param <T> The type of the variability model.
 * @author Prankur Agarwal
 * @author Kevin Feichtinger
 */
public interface IStatistics<T> {
    /**
     * Returns the number of variability unit elements, e.g., features, decisions in
     * the given variability model.
     *
     * @param model the model from which the unit of elements should be counted.
     * @return the number of variability elements.
     */
    long getVariabilityElementsCount(T model);

    /**
     * Returns the number of constraints in the given variability model.
     *
     * @param model the model from which the constraints should be counted.
     * @return the number of constraints.
     */
    long getConstraintsCount(T model);

    /**
     * Returns the number of constraints in the given variability model.
     *
     * @param logger the logger for the class
     * @param model  the model from which the constraints should be counted.
     */
    void logModelStatistics(final Logger logger, final T model);

}