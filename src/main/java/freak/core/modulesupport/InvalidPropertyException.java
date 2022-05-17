/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.modulesupport;

/**
 * Is thrown if a module contains invalid property settings that must be 
 * corrected by the user before doing something else.
 * 
 * @author Dirk
 */

public class InvalidPropertyException extends Exception {

	/**
	 * Constructs a new <code>InvalidPropertyException</code> without a 
	 * detail message.
	 */
	public InvalidPropertyException() {
		super();
	}

	/**
	 * Constructs a new <code>InvalidPropertyException</code> with the 
	 * specified detail message.
	 * 
	 * @param message the detail message.
	 */
	public InvalidPropertyException(String message) {
		super(message);
	}

}
