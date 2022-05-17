package freak.core.control;

import edu.cornell.lassp.houle.RngPack.RandomElement;
import freak.core.event.*;
import freak.core.fitness.FitnessFunction;
import freak.core.mapper.Mapper;
import freak.core.searchspace.SearchSpace;

import java.io.Serializable;
import java.util.Collection;

public interface ScheduleInterface extends GenerationEventSource,
        RunEventSource,
        BatchEventSource, ScheduleEventSource, Serializable {

    TimeController timeController = new TimeController();
    int getCurrentGeneration();

    RandomElement getRandomElement();

    SearchSpace getPhenotypeSearchSpace();

    FitnessFunction getFitnessFunction();

    EventController getEventController();

    void triggerStopCriterion();

    Mapper getMapper();

    SearchSpace getGenotypeSearchSpace();

    GenerationIndex getNextStepTimeIndex();

    GenerationIndex getCurrentTimeIndex();

    void step();

    BatchList getBatchList();

    boolean isLastRunInBatch();

    boolean isLastBatch();

    void skip();

    boolean isCurrentRunFinished();
}
