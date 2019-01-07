package Serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Bob");
        Person p2 = new Person(2, "Mike");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(p1);
            oos.writeObject(p2);
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
