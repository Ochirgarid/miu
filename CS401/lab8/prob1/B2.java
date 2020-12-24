package prob1;

import java.util.function.Supplier;

public class B2 {
    public static void main(String[] args) {
//        Class::staticMethod
        Supplier<Double> rand = Math::random;

        System.out.println(rand.get());
    }
}
