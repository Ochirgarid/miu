package edu.mum.cs.cs401.examples.lesson04.staticinherit.second;

//Shows that, although static methods are inherited,
//they cannot be used polymorphically
public class Sub extends Super {
	public static void main(String[] args) {  
		Super s = new Sub();
		s.print();
	}
	public static void print() {
		System.out.println("bye");
	}
}
