package institution.interlink;

import institution.interlink.selectionсommittee.AbstractSelectionCommittee;
import lombok.Data;
import person.AbstractStudent;

import java.util.ArrayList;
import java.util.Collection;

@Data
public abstract class AbstractInternship {
    private String name;
    private Collection<AbstractStudent> potentialInterns;
    private Collection<AbstractStudent> students;
    private AbstractSelectionCommittee committee;

    public AbstractInternship(String name, Collection<AbstractStudent> potentialInterns, AbstractSelectionCommittee committee) {
        this.name = name;
        this.potentialInterns = potentialInterns;
        this.students = new ArrayList<>();
        this.committee = committee;
    }

    public abstract void addStudents(Collection<AbstractStudent> potentialInterns);

}
