/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.random;

import cern.jet.random.engine.*;
import edu.cornell.lassp.houle.RngPack.*;

/**
 * @author Stefan
 */
public class SimpleRandomElementFactory implements RandomElementFactory {
	private RandomElement seedGenerator;

	public SimpleRandomElementFactory() {
		this((int) (System.currentTimeMillis() % 1000));
	}

	public SimpleRandomElementFactory(int masterSeed) {
		seedGenerator = new MersenneRandomElement(masterSeed);
	}

	public RandomElement getRandomElement() {
		return new MersenneRandomElement(seedGenerator.choose(Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	private class MersenneRandomElement extends RandomElement {

		RandomEngine engine;

		public MersenneRandomElement(int masterSeed) {
			engine = new MersenneTwister(masterSeed);
		}

		@Override
		public double raw() {
			return engine.raw();
		}
	}

}
