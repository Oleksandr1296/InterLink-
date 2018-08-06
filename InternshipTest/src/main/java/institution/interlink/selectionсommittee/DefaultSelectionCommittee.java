package institution.interlink.selectionсommittee;

import person.AbstractStudent;

public class DefaultSelectionCommittee extends AbstractSelectionCommittee {

    public DefaultSelectionCommittee(String name) {
        super(name);
    }

    @Override
    public boolean hasStudentPass(AbstractStudent student) {
        return false;
    }
}
