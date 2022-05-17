/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.modulesupport;

/**
 * An object of this class contains information about a module which can be
 * used by the GUI for displaying a list of available modules etc.  
 *
 * @author Heiko
 */
public class ModuleInfo implements Comparable {

	private String name;
	private String description;
	private String className;

	public ModuleInfo(String name, String description, String className) {
		this.name = name;
		this.description = description;
		this.className = className;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getClassName() {
		return className;
	}

	public String toString() {
		return name;
	}

	public String toStringExt() {
		String s = "(" + className + "," + name + "," + description + ")";
		return s;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int compareTo(Object o) {
		return name.compareTo(((ModuleInfo)o).name);
	}

}
