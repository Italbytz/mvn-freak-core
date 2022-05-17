/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.control;

/**
 * Is thrown when a static event source is replaced by <code>null</code>.
 * 
 * @author Dirk
 */
public class StaticEventSourceRemovedException extends NullPointerException {

	public StaticEventSourceRemovedException() {
		super();
	}

	public StaticEventSourceRemovedException(String message) {
		super(message);
	}
}
