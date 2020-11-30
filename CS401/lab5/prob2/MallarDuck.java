package prob2;

public class MallarDuck extends Duck {

    MallarDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("    displaying");
    }

}
