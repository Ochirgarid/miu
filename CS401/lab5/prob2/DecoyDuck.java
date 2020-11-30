package prob2;

public class DecoyDuck extends Duck {

    DecoyDuck() {
        super(new CannotFly(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("    displaying");
    }

}
