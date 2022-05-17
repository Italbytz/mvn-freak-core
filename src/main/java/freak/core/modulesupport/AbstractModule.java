/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.modulesupport;

import freak.core.control.*;

/**
 * An abstract superclass for all modules except operators and parameter
 * controllers, which are direct subclasses of AbstractBasicModule. Provides
 * standard implementations for common methods of most modules.
 *
 * @author Stefan
 */
public abstract class AbstractModule extends AbstractBasicModule {
	protected ScheduleInterface schedule;
	
	/**
	 * Establishes an uplink to the Schedule containing this module.
	 */
	public AbstractModule(ScheduleInterface schedule) {
		this.schedule = schedule;
	}
	
	/**
	 * Returns the Schedule containing this module.
	 */
	public ScheduleInterface getSchedule() {
		return schedule;
	}
}
