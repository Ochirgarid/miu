package labs.prob4;

public class DecoyDuck extends Duck implements MuteQuack, CannotFly {
	@Override
	public void display() {
		System.out.println("  displaying");
		
	}
}
