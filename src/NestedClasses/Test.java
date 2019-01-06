package NestedClasses;

public class Test {
    public static void main(String[] args) {
        ElectroCar ec = new ElectroCar(1);
        ec.start();

        ElectroCar.Baterry b = new ElectroCar.Baterry();
        b.charge();
    }
}
