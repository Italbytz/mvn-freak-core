/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.modulesupport;

/**
 * Is thrown if a module is incompatible to another module inside the current 
 * schedule.
 * 
 * @author Dirk
 */

public class IncompatibleModuleException extends UnsupportedEnvironmentException {

	private Module module;

	/**
	 * Constructs a new <code>IncompatibleModuleException</code> without a 
	 * detail message.
	 */
	public IncompatibleModuleException(Module module) {
		super();
		this.module = module;
	}

	/**
	 * Constructs a new <code>IncompatibleModuleException</code> with the 
	 * specified detail message.
	 * 
	 * @param message the detail message.
	 */
	public IncompatibleModuleException(Module module, String message) {
		super(message);
		this.module = module;
	}

	/**
	 * @return the module that is found to be incompatible with the module that threw the exception. 
	 */
	public Module getModule() {
		return module;
	}

}
