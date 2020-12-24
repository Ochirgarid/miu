package lesson9.labs.prob12;

import java.util.Optional;

public class MySingleton {
    public int created = 0;
    private static MySingleton instance = null;

    private MySingleton() {created++;}

    public static MySingleton getInstance() {
        return Optional.ofNullable(instance)
            .orElseGet(() -> instance = new MySingleton());
    }

    public static void main(String[] args) {
        MySingleton a1 = MySingleton.getInstance();
        MySingleton a2 = MySingleton.getInstance();
        MySingleton a3 = MySingleton.getInstance();

        System.out.println("MySingleton is created " + a1.created + " time(s)");
        System.out.println("MySingleton is created " + a2.created + " time(s)");
        System.out.println("MySingleton is created " + a3.created + " time(s)");
    }
}
