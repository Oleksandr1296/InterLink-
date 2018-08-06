package person;

import person.consciousness.AbstractKnowledge;

public class DefaultStudent extends AbstractStudent {
    public DefaultStudent(long id, String fullName, AbstractKnowledge knowledge) {
        super(id, fullName, knowledge);
    }
}
