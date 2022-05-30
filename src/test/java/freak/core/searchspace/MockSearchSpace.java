package freak.core.searchspace;

import freak.core.control.ScheduleInterface;
import freak.core.population.Genotype;

public class MockSearchSpace extends AbstractSearchSpace {

    public MockSearchSpace(ScheduleInterface schedule) {
        super(schedule);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public Genotype getRandomGenotype() {
        return null;
    }

    @Override
    public double getSize() {
        return 0;
    }
}
