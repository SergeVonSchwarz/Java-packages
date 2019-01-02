package Abstract;

public class Abstract1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Animal animalAbs = new Animal() {
            public void eat() {
                System.out.println("Abstract animal eat");
            }
        };
        animalAbs.eat();
    }
}

class Animal {
    public void eat() {
        System.out.println("Animal eat");
    }
}
