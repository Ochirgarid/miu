package prob3;

public final class Circle {
    private final double radius;

    Circle(double r) {
        this.radius = r;
    }

    public double computeArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getRadius() {
        return this.radius;
    }
}
