package Abstract;

interface AbleToEat {
    public void eat();
}

public class Abstract2 {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Abstract eat");
            }
        };
        ableToEat.eat();
    }
}
