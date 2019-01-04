package Exception2;

import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) throws CustomException {
        Scanner s = new Scanner(System.in);
        while(true) {
            int x = Integer.parseInt(s.nextLine());

            if(x != 0) {
                throw new CustomException("User entered non zero!");
            }
        }
    }
}
