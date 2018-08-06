package institution.interlink.selectionсommittee;

import person.AbstractStudent;

public class DefaultSelectionCommittee extends AbstractSelectionCommittee {

    public DefaultSelectionCommittee(String name, double averageRating) {
        super(name, averageRating);
    }

    @Override
    public boolean hasStudentPass(AbstractStudent student) {
        return Double.compare(student.getKnowledge().getRank(), getAverageRating()) >= 0;
    }
}
