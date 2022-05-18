/*
 * This file is part of FrEAK. For licensing and copyright information
 * please see the file COPYING in the root directory of this
 * distribution or contact <freak@ls2.cs.uni-dortmund.de>.
 */

package freak.core.modulesupport;

import freak.core.control.ScheduleInterface;
import freak.core.event.BatchEvent;
import freak.core.event.GenerationEvent;
import freak.core.event.IndividualListEvent;
import freak.core.event.RunEvent;
import freak.core.event.ScheduleEvent;

/**
 * The most basic superclass for all modules. Provides standard implementations
 * for common methods of most modules.
 * 
 * @author Stefan
 */
public abstract class AbstractBasicModule implements Module {

	public Configuration getConfiguration() {
		return Configuration.getConfigurationFor(this);
	}
	
	public void setConfiguration(Configuration configuration) {
		Configuration.setConfigurationFor(this, configuration);
	}
	
	public void testProperties() throws InvalidPropertyException {
	}
	
	
	public void createEvents() {
	}
	

	public void initialize() {
	}

	public void testSchedule(ScheduleInterface schedule) throws UnsupportedEnvironmentException {
	}
	
	public void runAborted(RunEvent evt) {
	}
	public void runCompleted(RunEvent evt) {
	}
	public void runFinalize(RunEvent evt) {
	}
	public void runStarted(RunEvent evt) {
	}
	public void batchStarted(BatchEvent evt) {
	}
	public void batchFinished(BatchEvent evt) {
	}
	public void generation(GenerationEvent evt) {
	}
	public void scheduleStarted(ScheduleEvent evt) {
	}
	public void scheduleEdited(ScheduleEvent evt) {
	}
	public void individualList(IndividualListEvent evt) {
	}
	
	public String toString() {
		return getName();
	}

}
