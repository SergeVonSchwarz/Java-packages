package Enum;

public class Test {
    public static void main(String[] args) {
        Animal a1 = Animal.Cat;
        System.out.println(a1.getTranslation());

        switch (a1) {
            case Cat:
                System.out.println("Cat");
                break;
            case Dog:
                System.out.println("Dog");
                break;
            case Frog:
                System.out.println("Frog");
                break;
        }
    }
}
