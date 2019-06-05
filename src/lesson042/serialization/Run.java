package lesson042.serialization;

import java.io.*;
import java.util.Objects;

public class Run {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Pupil", "Pupil", 100);

        FileOutputStream fileOutputStream = new FileOutputStream("tempFile.log");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("tempFile.log");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Person newPerson = (Person) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(newPerson);
        System.out.println(newPerson.getIq());


    }
}
