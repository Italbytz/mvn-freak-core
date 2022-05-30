package freak.core.graph;

import freak.core.control.*;
import freak.core.modulesupport.UnsupportedEnvironmentException;
import freak.core.population.Genotype;
import freak.core.searchspace.AbstractSearchSpace;
import freak.module.operator.mutation.common.MockMutation;
import org.junit.jupiter.api.Test;

public class MutationTests {

    @Test
    public void testTestSchedule() throws UnsupportedEnvironmentException {
        ScheduleInterface mockSchedule = new MockSchedule();
        Mutation mutation = new MockMutation(new OperatorGraph(mockSchedule));
        mutation.testSchedule(mockSchedule);
    }

}
