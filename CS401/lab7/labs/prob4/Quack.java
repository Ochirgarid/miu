package labs.prob4;

public interface Quack extends QuackBehavior {
	default void quack() {
		System.out.println("  quacking");
	}
}
