package app;

import institution.AbstractUniversity;
import institution.DefaultUniversity;
import institution.interlink.AbstractInternship;
import institution.interlink.DefaultInternship;
import institution.interlink.deanery.DefaultDeanery;
import institution.interlink.selectionсommittee.DefaultSelectionCommittee;
import person.DefaultStudent;
import person.consciousness.DefaultKnowledge;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.runApplication();
    }

    private void runApplication() {
        AbstractUniversity university = new DefaultUniversity(1, "CH.U.I.", new DefaultDeanery("Deanery"));
        university.addStudent(new DefaultStudent(1, "Andrew Kostenko", new DefaultKnowledge(99.6)));
        university.addStudent(new DefaultStudent(2, "Julia Veselkina", new DefaultKnowledge(78.5)));
        university.addStudent(new DefaultStudent(3, "Maria Perechrest", new DefaultKnowledge(50.3)));

        AbstractInternship internship = new DefaultInternship("InternShip", university.getStudents(),
                new DefaultSelectionCommittee("Committee", university.getAverageRating()));

        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
