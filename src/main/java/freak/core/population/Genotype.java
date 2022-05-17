/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.population;

import java.io.*;

/**
 * Contains the gene data of individuals.
 * 
 * @author Dirk
 */
abstract public class Genotype implements Serializable, Cloneable {

	public abstract boolean equals(Object o);

	/**
	 * Must be implemented by all subclasses.
	 * 
	 * @see Object#hashCode()
	 */
	public abstract int hashCode();

	/**
	 * Must be implemented by all subclasses.
	 * 
	 * @see Object#toString()
	 */
	public abstract String toString();
}
