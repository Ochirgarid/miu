import java.util.Optional;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        Stream strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
        System.out.println(strings.reduce((x, y) -> x + "-" + y).get());
    }
}
