package prob6;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Exercises {
    Function<String, String> toUpper1 = (String x) -> x.toUpperCase();
    Function<String, String> toUpper2 = String::toUpperCase;

    Function<Employee, String> f1 = (Employee e) -> e.getName();
    Function<Employee, String> f2 = Employee::getName;

    BiConsumer<Employee, String> bic1 = (Employee e, String s) -> e.setName(s);
    BiConsumer<Employee, String> bic2 = Employee::setName;

    Comparator<String> cmp1 = (String s1, String s2) -> s1.compareTo(s2);
    Comparator<String> cmp2 = String::compareTo;

    BiFunction<Integer, Integer, Double> bif3 = (Integer x, Integer y) -> Math.pow(x, y);
    BiFunction<Integer, Integer, Double> bif4 = Math::pow;

    Function<Apple, Double> f3 = (Apple a) -> a.getWeight();
    Function<Apple, Double> f4 = Apple::getWeight;

    Function<String, Integer> f5 = (String x) -> Integer.parseInt(x);
    Function<String, Integer> f6 = Integer::parseInt;

    EmployeeNameComparator comp = new EmployeeNameComparator();

    Comparator<Employee> cmp3 = (Employee e1, Employee e2) -> comp.compare(e1,e2);
    Comparator<Employee> cmp4 = comp::compare;

    public static void main(String[] args) {
        Exercises exercises = new Exercises();
        exercises.evaluator();
    }

    public void evaluator() {
        System.out.println(toUpper1.apply("hello"));
        System.out.println(toUpper2.apply("hello"));

        Employee e1 = new Employee("Kevin", 150000);
        System.out.println(f1.apply(e1));

        bic1.accept(e1, "David");
        System.out.println(f2.apply(e1));

        System.out.println("Anna vs George: " + cmp1.compare("Anna", "George"));
        System.out.println("Anna vs George: " + cmp2.compare("Anna", "George"));

        System.out.println("3 power 4: " + bif3.apply(3, 4));
        System.out.println("3 power 4: " + bif4.apply(3, 4));

        Apple a1 = new Apple(0.2);
        System.out.println("Apple weight: " + f3.apply(a1));
        System.out.println("Apple weight: " + f4.apply(a1));

        System.out.println(f5.apply("2300"));
        System.out.println(f6.apply("400"));

        Employee e2 = new Employee("Kevin", 170000);
        System.out.println("David vs Kevin: " + cmp3.compare(e1, e2));
        System.out.println("David vs Kevin: " + cmp4.compare(e1, e2));
    }
}
