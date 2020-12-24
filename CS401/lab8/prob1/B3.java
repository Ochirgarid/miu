package prob1;

import java.util.function.Supplier;

public class B3 {
    public static void main(String[] args) {
        B3 b3 = new B3();
        Supplier<Double> inner = b3.new Inner();

        System.out.println(inner.get());
    }

    public class Inner implements Supplier<Double> {
        @Override
        public Double get() {
            return Math.random();
        }
    }
}
