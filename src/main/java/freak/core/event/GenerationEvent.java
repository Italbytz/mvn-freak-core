/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.event;

/**
 * A GenerationEvent is sent by the Schedule after processing of the operator
 * graph. Observers, that investigate the population on each generation should
 * register on GenerationEvents.
 * 
 * @author Stefan
 */
public class GenerationEvent extends Event {
	private int number;
	private GenerationEventSource source;

	public GenerationEvent(GenerationEventSource source, int number) {
		this.source = source;
		this.number = number;
	}

	public GenerationEventSource getSource() {
		return source;
	}

	/**
	 * Returns the number of the generation, that was created.
	 */
	public int getNumber() {
		return number;
	}
}
