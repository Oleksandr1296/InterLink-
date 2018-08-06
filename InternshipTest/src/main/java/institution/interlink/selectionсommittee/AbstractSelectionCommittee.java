package institution.interlink.selectionсommittee;

import lombok.Data;
import person.AbstractStudent;

@Data
public abstract class AbstractSelectionCommittee {
    private String name;

    public AbstractSelectionCommittee(String name) {
        this.name = name;
    }

    public abstract boolean hasStudentPass(AbstractStudent student);
}
