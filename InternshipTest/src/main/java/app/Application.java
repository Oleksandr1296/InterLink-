package app;

import institution.AbstractUniversity;
import institution.DefaultUniversity;
import institution.interlink.AbstractInternship;
import institution.interlink.DefaultInternship;
import institution.interlink.deanery.DefaultDeanery;
import institution.interlink.selectionсommittee.DefaultSelectionCommittee;
import person.AbstractStudent;
import util.constants.Values;
import util.fileworker.DefaultFileWorker;
import util.fileworker.FileWorker;

import java.io.File;
import java.util.Collection;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.runApplication(initData(Values.DEFAULT_FILE_PATHNAME));
    }

    private void runApplication(Collection<AbstractStudent> students) {
        AbstractUniversity university = new DefaultUniversity(1, "CH.U.I.", new DefaultDeanery("Deanery"));
        university.addStudents(students);
        AbstractInternship internship = new DefaultInternship("InternShip", university.getStudents(),
                new DefaultSelectionCommittee("Committee", university.getAverageRating()));

        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }

    private static Collection<AbstractStudent> initData(String filePath) {
        FileWorker fileWorker = new DefaultFileWorker();
        if (!new File(filePath).exists()) {
            fileWorker.writeInFile(filePath, Values.STUDENTS_LIST);
        }
        return fileWorker.readFromFile(filePath);
    }
}
