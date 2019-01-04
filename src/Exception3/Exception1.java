package Exception3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {

        // Checked Exception - compilation
        File file = new File("test3.txt");
        try {
            Scanner s = new Scanner(file);
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("Some error!");
        }
    }
}
