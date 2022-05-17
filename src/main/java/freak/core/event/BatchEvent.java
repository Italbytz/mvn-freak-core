/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.event;

/**
 * A BatchEvent is sent by the Schedule every time a batch is started.
 * 
 * @author Dirk, Stefan
 */
public class BatchEvent extends Event {
	private BatchEventSource source;
	private int batchIndex;

	public BatchEvent(BatchEventSource source, int batchIndex) {
		this.source = source;
		this.batchIndex = batchIndex;
	}

	public BatchEventSource getSource() {
		return source;
	}

	public int getBatchIndex() {
		return batchIndex;
	}
}
