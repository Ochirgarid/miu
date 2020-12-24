package labs.prob4;

public interface FlyBehavior {
	default void fly() {
		System.out.println("  flying");
	}
}
