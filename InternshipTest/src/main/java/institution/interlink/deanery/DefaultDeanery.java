package institution.interlink.deanery;

import person.AbstractStudent;

import java.util.Collection;

public class DefaultDeanery extends AbstractDeanery {

    public DefaultDeanery(String name) {
        super(name);
    }

    @Override
    public void calculateAverageRank(Collection<AbstractStudent> students) {

    }
}
