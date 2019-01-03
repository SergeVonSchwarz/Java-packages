package ReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFileSimplePath {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test3.txt"); // at the root of the project

        Scanner s = new Scanner(file);
        while(s.hasNextLine()) {
            System.out.println(s.nextLine());
        }

        s.close();
    }
}
