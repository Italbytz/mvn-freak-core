/*
 * This file is part of RFrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <robin.nunkesser@udo.edu>.
 */

package freak.core.postprocessor;

import freak.core.control.ScheduleInterface;
import freak.core.modulesupport.AbstractModule;
import freak.core.population.IndividualList;
import freak.core.population.Population;


/**
 */

public abstract class AbstractPostprocessor extends AbstractModule implements Postprocessor {

	private IndividualList individuals;

	public AbstractPostprocessor(ScheduleInterface schedule) {
		super(schedule);
	}

	public void addAllIndividuals(ScheduleInterface schedule,IndividualList list) {
		if (individuals==null) {
			individuals=new Population(schedule,list);
		} else {
			individuals.addAllIndividuals(list);
		}
	}
	public abstract void analyse();

	public void reset(){
		individuals=null;
	}

	public IndividualList getIndividuals() {
		return individuals;
	}

}
