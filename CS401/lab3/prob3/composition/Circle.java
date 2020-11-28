package prob3.composition;

public class Circle{
	private double radius;

	public Circle(double r) {
		this.radius = r;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double computeArea() {
		return Math.PI * this.radius * this.radius;
	}
}