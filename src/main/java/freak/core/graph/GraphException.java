/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.graph;

import freak.core.control.*;

/**
 * A superclass for all exceptions within operator graphs.
 * 
 * @author Dirk
 *
 */
public class GraphException extends SimulationException {
	/**
	 * Constructs a <code>GraphException</code> without a detail message.
	 */
	public GraphException() {
		super();
	}

	/**
	 * Constructs a <code>GraphException</code> with a detail message.
	 * @param message the detail message.
	 */
	public GraphException(String message) {
		super(message);
	}
}
