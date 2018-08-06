package institution.interlink;

import institution.interlink.selectionсommittee.AbstractSelectionCommittee;
import person.AbstractStudent;

import java.util.Collection;
import java.util.stream.Collectors;

public class DefaultInternship extends AbstractInternship {

    public DefaultInternship(String name, Collection<AbstractStudent> potentialInterns, AbstractSelectionCommittee committee) {
        super(name, potentialInterns, committee);
        addStudents(potentialInterns);
    }

    @Override
    public void addStudents(Collection<AbstractStudent> potentialInterns) {
        this.getStudents().addAll(potentialInterns
                .stream()
                .filter(e -> this.getCommittee().hasStudentPass(e))
                .collect(Collectors.toList()));
    }

}
