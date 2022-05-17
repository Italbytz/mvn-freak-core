/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.stoppingcriterion;

import freak.core.control.*;
import freak.core.modulesupport.*;

/**
 * This class represents an abstract stopping criterion. Some default
 * implementations of methods in the interface <code>Module</code> are given.
 * 
 * @author Heiko, Stefan
 */
public abstract class AbstractStoppingCriterion extends AbstractModule implements StoppingCriterion {

	public AbstractStoppingCriterion(ScheduleInterface schedule) {
		super(schedule);
	}

	/**
	 * This method can be called by subclasses in order to stop the run.
	 */
	protected void stopRun() {
		schedule.triggerStopCriterion();
	}
}
