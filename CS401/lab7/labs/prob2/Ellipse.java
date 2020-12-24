package labs.prob2;

final public class Ellipse implements ClosedCurve{
	final private double a;
    final private double E;

    public Ellipse(double a, double E) {
        this.a = a;
        this.E = E;
    }

    public double getA() {
        return a;
    }

    public double getE() {
        return E;
    }

    @Override
    public double computePerimeter() {
        return 4.0 * a * E;
    }

}
