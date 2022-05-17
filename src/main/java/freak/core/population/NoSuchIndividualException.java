/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.population;

/**
 * Thrown when a requested individual can not be found.
 * 
 * @author Dirk
 */
public class NoSuchIndividualException extends RuntimeException {

	/**
	 * Constructs a <code>NoSuchIndividualException</code> without a detail message.
	 */
	public NoSuchIndividualException() {
		super();
	}

	/**
	 * Constructs a <code>NoSuchIndividualException</code> with a detail message.
	 * 
	 * @param message the detail message.
	 */
	public NoSuchIndividualException(String message) {
		super(message);
	}

}
