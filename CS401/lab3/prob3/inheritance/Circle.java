package prob3.inheritance;

public class Circle extends Cylinder{
	private double radius;

	public Circle(double r) {
		super(r, (double)0.0);
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double computeArea() {
		return Math.PI * this.radius * this.radius;
	}
}