package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("fake");
        Scanner s = new Scanner(file);
    }
}
