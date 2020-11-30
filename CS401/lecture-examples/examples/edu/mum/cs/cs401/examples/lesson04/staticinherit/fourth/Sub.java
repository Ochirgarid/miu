package edu.mum.cs.cs401.examples.lesson04.staticinherit.fourth;

//Shows a static method can override a static method
public class Sub extends Super {
	public static void main(String[] args) {
		//super.tryit() //compiler error
		tryit();
	}
	public static void tryit() {
		System.out.println("trying it too");
	}
}
