/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.searchspace;

import freak.core.control.*;
import freak.core.modulesupport.*;

/**
 * An abstract superclass for all search spaces.
 * 
 * @author Stefan
 */
public abstract class AbstractSearchSpace extends AbstractModule implements SearchSpace {
	public AbstractSearchSpace(ScheduleInterface schedule) {
		super(schedule);
	}
}
