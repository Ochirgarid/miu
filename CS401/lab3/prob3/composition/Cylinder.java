package prob3.composition;

public class Cylinder {
	private double height;
	private Circle circle;
	
	public Cylinder(double r, double h) {
		this.height = h;
		this.circle = new Circle(r);
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double computeVolume() {
		return this.height * circle.computeArea();
	}
}
