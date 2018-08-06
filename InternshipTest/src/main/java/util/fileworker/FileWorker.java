package util.fileworker;

import person.AbstractStudent;

import java.util.Collection;

public interface FileWorker {

    void writeInFile(String path, Collection<AbstractStudent> students);

    Collection<AbstractStudent> readFromFile(String path);
}
