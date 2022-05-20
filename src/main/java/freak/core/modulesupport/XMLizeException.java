/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.modulesupport;

/**
 * Is thrown whenever an error during Object to XML or XML to Object transformation occurs.
 *  
 * @author Matthias
 */
public class XMLizeException extends Exception {

	/**
	 * Constructs a <code>XMLizeException</code> without a detail message.
	 */
	public XMLizeException() {
		super();
	}

	/**
	 * Constructs a <code>XMLizeExcpetion</code> with a detail message.
	 * @param message the detail message.
	 */
	public XMLizeException(String message) {
		super(message);
	}

	/**
	 * Constructs a new <code>XMLizeException</code> with the specified detail message and cause.
	 * 
	 * @param message the detail message.
	 * @param cause the cause.
	 */
	public XMLizeException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructs a new <code>XMLizeException</code> with the specified cause.
	 *  
	 * @param cause the cause.
	 */
	public XMLizeException(Throwable cause) {
		super(cause);
	}

}
