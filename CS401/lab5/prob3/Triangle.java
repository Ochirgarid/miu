package prob3;

public final class Triangle {
    private final double base;
    private final double height;

    Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }

    public double computeArea() {
        return this.base * this.height * 0.5;
    }

    public double getBase() {
        return this.base;
    }

    public double getHeight() {
        return this.height;
    }
}
