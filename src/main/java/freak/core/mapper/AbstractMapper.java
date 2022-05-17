/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.mapper;

import freak.core.control.*;
import freak.core.modulesupport.*;
import freak.core.population.*;

/**
 * An abstract superclass for all search space mappers.
 * 
 * @author Michael, Stefan
 */
public abstract class AbstractMapper extends AbstractModule implements Mapper {

	public AbstractMapper(ScheduleInterface schedule) {
		super(schedule);
	}

	public Genotype phenotypeToGenotype(Genotype phenotype) throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
}
