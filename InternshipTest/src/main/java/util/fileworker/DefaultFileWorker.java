package util.fileworker;

import person.AbstractStudent;

import java.io.*;
import java.util.Collection;
import java.util.Collections;

public class DefaultFileWorker implements FileWorker {
    @Override
    public void writeInFile(String path, Collection<AbstractStudent> students) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(path)))) {
            objectOutputStream.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Can't write in file! " + e);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public Collection<AbstractStudent> readFromFile(String path) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(path)))) {
            return (Collection<AbstractStudent>) objectInputStream.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            System.err.println("Can't read from file! " + e);
            return Collections.emptyList();
        }
    }
}
