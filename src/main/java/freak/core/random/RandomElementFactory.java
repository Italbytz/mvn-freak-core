/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.random;

import java.io.*;

import edu.cornell.lassp.houle.RngPack.*;

/**
 * Produces the RandomElements for each run.
 * 
 * @author Stefan 
 */
public interface RandomElementFactory extends Serializable {
	/**
	 * Returns the RandomElement for the next run.
	 */
	RandomElement getRandomElement();
}
