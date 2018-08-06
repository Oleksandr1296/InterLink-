package institution.interlink.deanery;

import lombok.Data;
import person.AbstractStudent;

import java.util.Collection;

@Data
public abstract class AbstractDeanery {
    private String name;
    private double averageRank;

    public AbstractDeanery(String name) {
        this.name = name;
    }

    public abstract double calculateAverageRank(Collection<AbstractStudent> students);
}
