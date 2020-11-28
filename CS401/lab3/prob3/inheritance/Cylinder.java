package prob3.inheritance;

public class Cylinder {
	private double height;
	private double radius;
	
	public Cylinder(double r, double h) {
		this.height = h;
		this.radius = r;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double computeVolume() {
		return Math.PI * this.radius * this.radius * this.height;
	}
}
