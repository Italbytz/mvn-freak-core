/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.event;

/**
 * @see BatchEvent
 * 
 * @author Dirk
 */
public interface BatchEventSource extends EventSource {
	
    void addBatchEventListener(BatchEventListener l);
    
    void removeBatchEventListener(BatchEventListener l);
}
