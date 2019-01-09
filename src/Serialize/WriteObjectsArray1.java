package Serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectsArray1 {
    public static void main(String[] args) {

        Person[] people = {
                new Person(1, "Carl"),
                new Person(2, "Ben"),
                new Person(3, "Moe"),
        };

        try {
            FileOutputStream fos = new FileOutputStream("people1.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(people.length);
            for(Person person : people) {
                oos.writeObject(person);
            }

            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
