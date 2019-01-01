package Animal;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog d1 = new Dog();

        a1.eat();

        System.out.println("-----------");

        d1.eat();
        d1.bark();

        System.out.println("-----------");

        Animal a2 = new Dog();
        a2.eat();

        System.out.println("-----------");

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        meth(animal);
        meth(dog);
        meth(cat);
    }

    public static void meth(Animal animal) {
        animal.eat();
    }
}
