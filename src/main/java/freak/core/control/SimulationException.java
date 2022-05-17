/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.control;

/**
 * Superclass of all Exceptions, that may occur during the simulation. A
 * SimulationException is probably caused by an incorrectly setup Schedule. As
 * Schedules are too complex to check completely during their creation, an
 * error made by the user during setup may be discovered during the simulation.
 * 
 * @author Stefan
 */
public class SimulationException extends RuntimeException {

	public SimulationException(Exception initCause) {
		super(initCause);
	}

	public SimulationException() {
		super();
	}

	public SimulationException(String message) {
		super(message);
	}
}
