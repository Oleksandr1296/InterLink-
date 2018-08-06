package institution;

import institution.interlink.deanery.AbstractDeanery;
import person.AbstractStudent;

public class DefaultUniversity extends AbstractUniversity {

    public DefaultUniversity(long id, String name, AbstractDeanery deanery) {
        super(id, name, deanery);
    }

    @Override
    public void addStudent(AbstractStudent student) {
        this.getStudents().add(student);
    }

    @Override
    public double getAverageRating() {
        return this.getDeanery().calculateAverageRank(this.getStudents());
    }

}
