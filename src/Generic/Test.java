package Generic;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        /////////// Java 5 ///////////////
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        Animal ourAnimal = new Animal(0);
        animals.add(ourAnimal);

        String animal = (String) animals.get(1);
        System.out.println(animal);

        System.out.println(animals);

        System.out.println("------------");

        ////////// Generic ///////////////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");

        String animal2 = animals2.get(1);
        System.out.println(animal2);

        /////////// Java 7 ///////////////
        List<String> animals3 = new ArrayList<>();
    }
}

class Animal {
    private int id;

    public Animal() {

    }

    public Animal(int id) {
        this.id = id;
    }

    public String toString() {
        //return id + "";
        return String.valueOf(id);
    }

    public void eat() {
        System.out.println("Animal eat");
    }
}