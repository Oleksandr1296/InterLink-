package person.consciousness;

import lombok.Data;

import java.io.Serializable;

@Data
public abstract class AbstractKnowledge implements Serializable{
    private double rank;

    public AbstractKnowledge(double rank) {
        this.rank = rank;
    }
}
