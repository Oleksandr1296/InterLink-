package institution;

import institution.interlink.deanery.AbstractDeanery;
import person.AbstractStudent;

import java.util.Collection;

public class DefaultUniversity extends AbstractUniversity {

    public DefaultUniversity(long id, String name, Collection<AbstractStudent> students, AbstractDeanery deanery) {
        super(id, name, students, deanery);
    }

    public DefaultUniversity(long id, String name, AbstractDeanery deanery) {
        super(id, name, deanery);
    }

    @Override
    public void addStudent(AbstractStudent student) {
        this.getStudents().add(student);
    }

    @Override
    public void addStudents(Collection<AbstractStudent> students) {
        this.getStudents().addAll(students);
    }

    @Override
    public double getAverageRating() {
        return 0;
    }

}
