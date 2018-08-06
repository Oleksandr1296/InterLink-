package institution.interlink.selectionсommittee;

import lombok.Data;
import person.AbstractStudent;

@Data
public abstract class AbstractSelectionCommittee {
    private String name;
    private double averageRating;

    public AbstractSelectionCommittee(String name, double averageRating) {
        this.name = name;
        this.averageRating = averageRating;
    }

    public abstract boolean hasStudentPass(AbstractStudent student);
}
