package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception4 {

    /*public static void main(String[] args) throws FileNotFoundException {
       readFile();
    }*/

    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Exception in main()!");
            //e.printStackTrace();
        }
    }

    public static void readFile() throws FileNotFoundException {
        /*File file = new File("test3.txt");*/
        File file = new File("qwe");
        Scanner s = new Scanner(file);
    }
}
