package labs.prob1.partE;

public interface D extends C, B {

	@Override
	default void method() {
		// TODO Auto-generated method stub
		B.super.method();
	}
	
}
