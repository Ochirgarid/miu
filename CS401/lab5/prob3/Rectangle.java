package prob3;

public final class Rectangle {
    private final double width;
    private final double length;

    Rectangle(double w, double l) {
        this.width = w;
        this.length = l;
    }

    public double computeArea() {
        return this.width * this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }
}
