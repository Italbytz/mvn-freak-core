/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.modulesupport;

/**
 * Is thrown if a module is incompatible to the property of another module 
 * inside the current schedule.
 * 
 * @author Dirk
 */

public class IncompatibleModulePropertyException extends IncompatibleModuleException {

	private String property;
	
	/**
	 * Constructs a new <code>IncompatibleModuleException</code> without a 
	 * detail message.
	 */
	public IncompatibleModulePropertyException(Module module, String property) {
		super(module);
		this.property = property;
	}

	/**
	 * Constructs a new <code>IncompatibleModuleException</code> with the 
	 * specified detail message.
	 * 
	 * @param message the detail message.
	 */
	public IncompatibleModulePropertyException(Module module, String property, String message) {
		super(module, message);
		this.property = property;
	}

	/**
	 * @return the property inside the module that caused the exception.
	 */
	public String getProperty() {
		return property;
	}

}
