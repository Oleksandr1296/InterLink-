package institution.interlink.deanery;

import person.AbstractStudent;

import java.util.Collection;
import java.util.OptionalDouble;

public class DefaultDeanery extends AbstractDeanery {

    public DefaultDeanery(String name) {
        super(name);
    }

    @Override
    public double calculateAverageRank(Collection<AbstractStudent> students) {
        OptionalDouble optionalDouble = students
                .stream()
                .mapToDouble(e -> e.getKnowledge().getRank())
                .average();
        return optionalDouble.orElseThrow(() -> new IllegalStateException("Wrong average rating!!!"));
    }
}
