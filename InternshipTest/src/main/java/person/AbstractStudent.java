package person;

import lombok.Data;
import lombok.EqualsAndHashCode;
import person.consciousness.AbstractKnowledge;

@Data
@EqualsAndHashCode(exclude = "knowledge")
public abstract class AbstractStudent {
    private long id;
    private String fullName;
    private AbstractKnowledge knowledge;

    public AbstractStudent(long id, String fullName, AbstractKnowledge knowledge) {
        this.id = id;
        this.fullName = fullName;
        this.knowledge = knowledge;
    }
}
