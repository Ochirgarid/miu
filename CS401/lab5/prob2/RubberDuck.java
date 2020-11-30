package prob2;

public class RubberDuck extends Duck{

    RubberDuck() {
        super(new CannotFly(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("    displaying");
    }
}
