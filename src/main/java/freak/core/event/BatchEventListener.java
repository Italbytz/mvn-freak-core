/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.event;

/**
 * @see BatchEvent
 * 
 * @author Dirk, Stefan
 */
public interface BatchEventListener extends EventListener {

	/**
	 * The first run in a new Batch is currently started, all configurations of
	 * all modules are already set accordingly, a random element is ready, the
	 * first generation is not created yet. 
	 */
	public void batchStarted(BatchEvent evt);

	/**
	 * The last run within this batch is finished.
	 */
	public void batchFinished(BatchEvent evt);
}
