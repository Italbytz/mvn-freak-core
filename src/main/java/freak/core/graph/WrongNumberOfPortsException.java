/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.graph;

/**
 * Is thrown when a operator has an unsupported number of ports (inport or outports). 
 * 
 * @author Matthias
 */
public class WrongNumberOfPortsException extends GraphSyntaxException {
	/**
	 * Constructs a <code>WrongNumberOfPorts</code> without a detail message.
	 */
	public WrongNumberOfPortsException() {
		super();
	}

	/**
	 * Constructs a <code>WrongNumberOfPorts</code> with a detail message.
	 * 
	 * @param message the detail message.
	 */
	public WrongNumberOfPortsException(String message) {
		super(message);
	}

}