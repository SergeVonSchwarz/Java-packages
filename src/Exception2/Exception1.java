package Exception2;

import java.io.IOException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        while(true) {
            int x = Integer.parseInt(s.nextLine());

            if(x != 0) {
                throw new IOException();
            }
        }
    }
}
