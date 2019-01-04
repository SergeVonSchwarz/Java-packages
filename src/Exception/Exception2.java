package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception2 {

    public static void main(String[] args) {
        File file = new File("fake");

        try {
            Scanner s = new Scanner(file);
            System.out.println("No error!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            //e.printStackTrace();
        }

        System.out.println("After Try Catch!");
    }
}
