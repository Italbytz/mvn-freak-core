/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.fitness;

import freak.core.control.ScheduleInterface;
import freak.core.modulesupport.AbstractModule;
import freak.core.population.Genotype;

/**
 * An abstract superclass for all fitness functions with a link back
 * to the current schedule. Concrete fitness functions should extend the either
 * the class <code>AbstractSingleObjectiveFitnessFunction</code> or the class
 * <code>AbstractSingleObjectiveFitnessFunction</code>, which both extend this
 * class.
 *
 * @author Dirk, Heiko, Michael, Stefan
 */
public abstract class AbstractFitnessFunction extends AbstractModule implements FitnessFunction {
	
	public AbstractFitnessFunction(ScheduleInterface schedule) {
		super(schedule);
	}
	
	public Genotype getPhenotypeOptimum() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
	
	public Genotype getGenotypeOptimum() throws UnsupportedOperationException {
		if (getSchedule().getMapper() != null) {
			return schedule.getMapper().phenotypeToGenotype(getPhenotypeOptimum());
		} else {
			// no mapper
			return getPhenotypeOptimum();
		}
	}

}