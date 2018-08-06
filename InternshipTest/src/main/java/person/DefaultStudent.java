package person;

import person.consciousness.AbstractKnowledge;

public class DefaultStudent extends AbstractStudent {
    public DefaultStudent(long id, String fullName, AbstractKnowledge knowledge) {
        super(id, fullName, knowledge);
    }

    @Override
    public String toString() {
        return "id= " + this.getId() + ", full name= " + this.getFullName() +
                ", rank= " + this.getKnowledge().getRank();
    }
}
