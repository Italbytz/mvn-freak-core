package freak.module.operator.mutation.common;

import freak.core.graph.Mutation;
import freak.core.graph.OperatorGraph;
import freak.core.population.Individual;

public class MockMutation extends Mutation {

    /**
     * Creates a new <code>Mutation</code> operator.
     *
     * @param graph a link back to the operator graph.
     */
    public MockMutation(OperatorGraph graph) {
        super(graph);
    }

    @Override
    protected Individual doMutation(Individual ind) {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
