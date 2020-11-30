package prob2;

public abstract class Duck {
    private FlyBehavior flyBehave;
    private QuackBehavior quackBehave;

    Duck(FlyBehavior fl, QuackBehavior qb) {
        this.flyBehave = fl;
        this.quackBehave = qb;
    }

    public abstract void display();
    public void fly() {
        this.flyBehave.fly();
    }
    public void quack() {
        this.quackBehave.quack();
    }
    public void swim() {
        System.out.println("    swimming");
    }
}
