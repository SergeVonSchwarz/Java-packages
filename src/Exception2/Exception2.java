package Exception2;

import java.io.IOException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true) {
            int x = Integer.parseInt(s.nextLine());

            if(x != 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    //e.printStackTrace();
                    System.out.println("User entered non zero");
                }
            }
        }
    }
}
