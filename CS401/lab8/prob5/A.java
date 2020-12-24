package prob5;

import java.util.Arrays;
import java.util.List;

public class A {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
                "Away", "On Vacation", "Everywhere you want to be");

        list.forEach(str -> System.out.println(str.toUpperCase()));
    }
}
