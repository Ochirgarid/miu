package prob1;

import java.util.function.Supplier;

public class B1 {
    public static void main(String[] args) {
        Supplier<Double> rand = () -> Math.random();

        System.out.println(rand.get());
    }
}
