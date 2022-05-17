/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.event;

/**
 * @see GenerationEvent
 * 
 * @author Stefan
 */
public interface GenerationEventSource extends EventSource {
	void addGenerationEventListener(GenerationEventListener l);
	void removeGenerationEventListener(GenerationEventListener l);
}
