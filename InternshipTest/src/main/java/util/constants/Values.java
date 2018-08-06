package util.constants;

import person.AbstractStudent;
import person.DefaultStudent;
import person.consciousness.DefaultKnowledge;

import java.util.Arrays;
import java.util.Collection;

public class Values {
    public static String DEFAULT_FILE_PATHNAME = "studentList.txt";

    public static Collection<AbstractStudent> STUDENTS_LIST = Arrays.asList(
            new DefaultStudent(1, "Andrew Kostenko", new DefaultKnowledge(99.6)),
            new DefaultStudent(2, "Julia Veselkina", new DefaultKnowledge(78.5)),
            new DefaultStudent(3, "Maria Perechrest", new DefaultKnowledge(50.3)));
}
