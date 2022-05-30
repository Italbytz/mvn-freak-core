package freak.core.control;

import org.junit.jupiter.api.Test;

public class RunControlTests {
    @Test
    public void testSetNewSchedule() {
        RunControl runControl = new RunControl(new MockStateListener());
        runControl.setNewSchedule(new MockSchedule());
    }

    private class MockStateListener implements StateListener {

        @Override
        public void asynchroneousFeedback(ScheduleInterface schedule,
                                          Replay replay) {

        }

        @Override
        public void synchroneousFeedback(ScheduleInterface activeSchedule,
                                         Replay replay) {

        }

        @Override
        public void simulationCompleted(Actions.Action lastProcessed) {

        }

        @Override
        public void simulationException(Exception exc) {

        }

        @Override
        public void terminated(Actions.Action lastProcessedBeforeTermination) {

        }
    }
}
