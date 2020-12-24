package lesson9.labs.prob9;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SquarePrint {
    public static void main(String[] args) {
        printSquares(4);
        printSquares(6);
    }

    public static void printSquares(int num) {
        IntStream squareStream = IntStream.iterate(1, n -> nextSquare(n)).limit(num);
        
        System.out.println(Arrays.toString(squareStream.toArray()));
    }

    public static int nextSquare(int n) {
        n = (int) Math.floor(Math.sqrt(n)) + 1;
        return n * n;
    }
}
