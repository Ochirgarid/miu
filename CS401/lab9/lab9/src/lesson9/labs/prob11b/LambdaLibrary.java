package lesson9.labs.prob11b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final TriFunction<List<Employee>, Integer, Character, String> SEARCH_EMPLOYEES =
            (list, minSalary, firstLetter) -> list.stream()
            .filter(e -> e.getSalary() > minSalary && firstLetter <= e.getLastName().charAt(0))
            .map(e -> e.getFirstName() + " " + e.getLastName())
            .sorted()
            .collect(Collectors.joining(", "));
}
