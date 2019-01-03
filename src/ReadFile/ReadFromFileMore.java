package ReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFromFileMore {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\User\\IdeaProjects\\Packages\\src\\ReadFile\\test2.txt";
        File file = new File(path);

        Scanner s = new Scanner(file);
        String line = s.nextLine();
        String[] numbersString = line.split(" ");

        int[] numbers = new int[3];
        int counter = 0;
        for(String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));

        s.close();
    }
}
