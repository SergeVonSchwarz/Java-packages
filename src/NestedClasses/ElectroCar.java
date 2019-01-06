package NestedClasses;

public class ElectroCar {
    private int id;

    // нестатический вложенный класс
    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id + " is starting ...");
        }
    }

    // ствтический вложенный класс
    public static class Baterry {
        public void charge() {
            System.out.println("Battery is charging ...");
        }
    }

    public ElectroCar(int id) {
        this.id = id;
    }

    public void start() {
        Motor m = new Motor();
        m.startMotor();

        // вложенные классы в
        final int x = 1;

        class SomeClass {
            public void someMethod() {
                System.out.println("Field id:" + id + " , field x:" + x);
            }
        }

        SomeClass so = new SomeClass();
        so.someMethod();

        System.out.println("Electrocar " + id + " is starting ...");
    }


}
