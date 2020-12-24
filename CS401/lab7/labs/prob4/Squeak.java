package labs.prob4;

public interface Squeak extends QuackBehavior {
	default void quack() {
		System.out.println("  squeaking");
	}
}
