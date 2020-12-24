package lesson9.labs.prob10c;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyIntStreamCode {
    static public void main(String[] args) {
        Stream <Integer> myIntStream = Stream.of(1, 2, 33, 4, -5, 6, 7, 8, 9, 10);

        IntSummaryStatistics streamStats = myIntStream.collect(Collectors.summarizingInt(i -> i));
        
        System.out.println("Max value: " + streamStats.getMax());
        System.out.println("Min value: " + streamStats.getMin());
    }
}
