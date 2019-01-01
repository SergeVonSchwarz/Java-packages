package Generic;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        test(listOfAnimal);

        System.out.println("-------------");

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfDogs);
    }

    /*private static void test(List<Animal> list) {
        for(Animal animal : list) {
            System.out.println(animal);
        }
    }*/

    //private static void test(List<? super Animal> list) {
    private static void test(List<? extends Animal> list) {
        for(Animal animal : list) {
            System.out.println(animal);
        }
    }
}

class Dog extends Animal{

}