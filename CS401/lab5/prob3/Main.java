package prob3;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(3.44);
        System.out.println("Circle area : " + c.computeArea());
        Rectangle r = new Rectangle(6, 6.23);
        System.out.println("Rectangle area : " + r.computeArea());
        Triangle t = new Triangle(12, 6.23);
        System.out.println("Triangle area : " + t.computeArea());
    }
}
