package labs.prob4;

abstract public class Duck implements FlyBehavior, QuackBehavior {
	abstract public void display();

	public void swim() {
		System.out.println("  swimming");
	}
	
}
