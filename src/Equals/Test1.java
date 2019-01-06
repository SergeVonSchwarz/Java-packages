package Equals;

public class Test1 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        System.out.println(x == y);

        System.out.println("-----");

        Animal a1 = new Animal(1);
        Animal a2 = new Animal(1);

        // compare links, not objects
        System.out.println(a1 == a2);

        System.out.println("-----");

        // equals
        System.out.println(a1.equals(a2));

    }
}


