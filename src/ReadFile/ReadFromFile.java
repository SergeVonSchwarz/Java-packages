package ReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\User\\IdeaProjects\\Packages\\src\\ReadFile\\test.txt";
        File file = new File(path);

        Scanner s = new Scanner(file);
        while(s.hasNextLine()) {
            System.out.println(s.nextLine());
        }

        s.close();
    }
}
