package labs.prob4;

public interface MuteQuack extends QuackBehavior {
	default void quack() {
		System.out.println("  cannot quack");
	}
}
