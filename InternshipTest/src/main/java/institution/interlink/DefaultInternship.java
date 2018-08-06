package institution.interlink;

import institution.interlink.selectionсommittee.AbstractSelectionCommittee;
import person.AbstractStudent;

import java.util.Collection;

public class DefaultInternship extends AbstractInternship {

    public DefaultInternship(String name, Collection<AbstractStudent> students, AbstractSelectionCommittee committee, double averageRating) {
        super(name, students, committee, averageRating);
    }

    public DefaultInternship(String name, AbstractSelectionCommittee committee, double averageRating) {
        super(name, committee, averageRating);
    }

    @Override
    public void addStudents(Collection<AbstractStudent> potentialInterns) {

    }

    @Override
    public void addStudent(AbstractStudent potentialIntern) {

    }
}
