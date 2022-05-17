/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.graph;

/**
 * Is thrown when the GUI tries to connect a Port which is already connected. 
 * 
 * @author Matthias
 */
public class AlreadyConnectedException extends PortConnectException {
	/**
	 * Constructs a <code>AlreadyConnectedException</code> without a detail message.
	 */
	public AlreadyConnectedException() {
		super();
	}

	/**
	 * Constructs a <code>AlreadyConnectedException</code> with a detail message.
	 * @param message the detail message.
	 */
	public AlreadyConnectedException(String message) {
		super(message);
	}
}
