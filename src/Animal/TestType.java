package Animal;

public class TestType {
    public static void main(String[] args) {

        // Upcasting - Восходящее преобразование
        Animal animal = new Dog();

        //Downcasting - Нисходящее преобразование
        Dog dog = (Dog)animal;
        dog.bark();

    }
}
