package institution.interlink;

import institution.interlink.selectionсommittee.AbstractSelectionCommittee;
import lombok.Data;
import person.AbstractStudent;

import java.util.ArrayList;
import java.util.Collection;

@Data
public abstract class AbstractInternship {
    private String name;
    private Collection<AbstractStudent> students;
    private AbstractSelectionCommittee committee;
    private double averageRating;

    public AbstractInternship(String name, Collection<AbstractStudent> students, AbstractSelectionCommittee committee, double averageRating) {
        this.name = name;
        this.students = students;
        this.committee = committee;
        this.averageRating = averageRating;
    }

    public AbstractInternship(String name, AbstractSelectionCommittee committee, double averageRating) {
        this.name = name;
        this.students = new ArrayList<>();
        this.committee = committee;
        this.averageRating = averageRating;
    }

    public abstract void addStudents(Collection<AbstractStudent> potentialInterns);

    public abstract void addStudent(AbstractStudent potentialIntern);
}
