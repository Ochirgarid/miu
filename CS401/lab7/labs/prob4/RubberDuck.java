package labs.prob4;

public class RubberDuck extends Duck implements Squeak, CannotFly {
	@Override
	public void display() {
		System.out.println("  displaying");

	}
}
