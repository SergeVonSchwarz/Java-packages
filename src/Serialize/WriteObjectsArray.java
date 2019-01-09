package Serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectsArray {
    public static void main(String[] args) {

        Person[] people = {
                new Person(1, "Jhon"),
                new Person(2, "Peter"),
                new Person(3, "Den"),
        };

        try {
            FileOutputStream fos = new FileOutputStream("people2.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(people);

            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
