/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.fitness;

import freak.core.control.ScheduleInterface;
import freak.core.population.IndividualList;

/**
 * An abstract superclass for all multi objective fitness functions with a link
 * back to the current schedule.
 * 
 * @author Heiko
 */
public abstract class AbstractMultiObjectiveFitnessFunction extends AbstractFitnessFunction implements MultiObjectiveFitnessFunction {

	/**
	* Constructs a new <code>AbstractMultiObjectiveFitnessFunction</code> with
	* a link back to the current schedule.
	* 
	* @param schedule a link back to the current schedule.
	*/
	public AbstractMultiObjectiveFitnessFunction(ScheduleInterface schedule) {
		super(schedule);
	}

	public double[] getOptimalFitnessValue() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
	
	public double[] getLowerBounds() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
	
	public double[] getUpperBounds() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}

	public boolean containsParetoFront(IndividualList list) throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}

	public final static int UNCOMPARABLE = -2;

	/**
	 * Checks whether the vector a is dominated by the vector b or vice versa.
	 * 
	 * @param a the first fitness vector.
	 * @param b the second fitness vector.
	 * @return +1 if a dominates b, 0 if a=b, -1 if b dominates a, UNCOMPARABLE in all other cases.
	 */
	public static int compare(double[] a, double[] b) {
		boolean aGreater = false;
		boolean bGreater = false; 
		int bound = a.length;		
		for (int i = 0; i < bound; i++) {
			if (a[i] < b[i]) {
				bGreater = true;
			} else {
				if (a[i] > b[i]) {
					aGreater = true;
				}
			}
		}
		if (aGreater && bGreater) {
			return UNCOMPARABLE;
		}
		if (aGreater) {
			return +1;
		}
		if (bGreater) {
			return -1;
		}
		return 0;
	}

}
