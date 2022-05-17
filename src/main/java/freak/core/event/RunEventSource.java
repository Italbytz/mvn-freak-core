/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.event;

/**
 * @see RunEvent
 * @author Stefan
 */
public interface RunEventSource extends EventSource {
    void addRunEventListener(RunEventListener l);
    void removeRunEventListener(RunEventListener l);
}
