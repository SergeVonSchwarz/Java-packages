package Equals;

public class Test2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("------");

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(s3 == s4);  // false
        System.out.println(s3.equals(s4));

        System.out.println("------");

        String s5 = "Hello";
        String s6 = "Hello123".substring(0, 5);

        System.out.println(s5 == s6);  // false
        System.out.println(s5.equals(s6));
    }
}
