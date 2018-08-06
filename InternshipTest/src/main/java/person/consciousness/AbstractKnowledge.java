package person.consciousness;

import lombok.Data;

@Data
public class AbstractKnowledge {
    private double rank;

    public AbstractKnowledge(double rank) {
        this.rank = rank;
    }
}
