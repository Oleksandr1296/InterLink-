package institution;

import institution.interlink.deanery.AbstractDeanery;
import lombok.Data;
import lombok.EqualsAndHashCode;
import person.AbstractStudent;

import java.util.ArrayList;
import java.util.Collection;

@Data
@EqualsAndHashCode(exclude = {"students", "deanery"})
public abstract class AbstractUniversity {
    private long id;
    private String name;
    private Collection<AbstractStudent> students;
    private AbstractDeanery deanery;

    public AbstractUniversity(long id, String name, Collection<AbstractStudent> students, AbstractDeanery deanery) {
        this.id = id;
        this.name = name;
        this.students = students;
        this.deanery = deanery;
    }

    public AbstractUniversity(long id, String name, AbstractDeanery deanery) {
        this.id = id;
        this.name = name;
        this.students = new ArrayList<>();
        this.deanery = deanery;
    }

    public abstract void addStudent(AbstractStudent student);

    public abstract void addStudents(Collection<AbstractStudent> students);

    public abstract double getAverageRating();

}
