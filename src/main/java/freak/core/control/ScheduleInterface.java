package freak.core.control;

import edu.cornell.lassp.houle.RngPack.RandomElement;
import freak.core.event.*;
import freak.core.fitness.FitnessFunction;
import freak.core.graph.FreakGraphModelInterface;
import freak.core.graph.Initialization;
import freak.core.graph.OperatorGraph;
import freak.core.mapper.Mapper;
import freak.core.observer.ObserverManagerInterface;
import freak.core.populationmanager.PopulationManager;
import freak.core.searchspace.SearchSpace;
import freak.core.stoppingcriterion.StoppingCriterion;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

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

    ObserverManagerInterface getObserverManager();

    int getCurrentBatch();

    int getCurrentRun();

    void callInitialize();

    PopulationManager getPopulationManager();

    FitnessFunction getRealFitnessFunction();

    void modulesEdited();

    double getRunTime();

    Batch getDefaultBatch();

    Initialization getInitialization();

    OperatorGraph getOperatorGraph();

    StoppingCriterion[] getStoppingCriteria();

    Batch createBatchFromCurrentConfigurations();

    void setDefaultBatch(Batch batch);

    void setGraphModel(FreakGraphModelInterface graphModel);

    void setFitnessFunction(FitnessFunction function);

    void setMapper(Mapper mapper);

    void setPhenotypeSearchSpace(SearchSpace space);

    void setPopulationManager(PopulationManager manager);

    void setStoppingCriteria(StoppingCriterion[] criteria);

    void setInitialization(Initialization initialization);

    Set getAllModules();

    FreakGraphModelInterface getGraphModel();

    Object[] getPossibleEventSources();

    FreakGraphModelInterface getFreakGraphModel();
}
