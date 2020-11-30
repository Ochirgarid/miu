package edu.mum.cs.cs401.examples.lesson05.intfaces2;

public class Circle implements ClosedCurve {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double computePerimeter() {
		return 2 * Math.PI * radius;
	}
}
