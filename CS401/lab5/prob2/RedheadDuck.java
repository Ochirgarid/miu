package prob2;

public class RedheadDuck extends Duck {

    RedheadDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("    displaying");
    }

}
