package lesson9.labs.prob4;

import java.util.function.Function;
import java.util.stream.Stream;

public class PrimeStream {
    // because of printFirstNPrimes(long n) signature changed all Integer into Long
    final Stream<Long> primes = Stream.iterate(2L, n -> nextPrime(n));
    final Function<Long, Stream<Long>> primesStream = firstN -> Stream.iterate(2L, n -> nextPrime(n)).limit(firstN);

    public static long nextPrime(long n) {
        n++;
        while (!isPrime(n)) {
            n++;
        }
        return n;
    }

    public static boolean isPrime(long n) {
        long k = (long) Math.sqrt(n);
        for (long i = 2; i <= k; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


    public void printFirstNPrimes(long n) {
        primesStream.apply(n).forEach(System.out::println);
    }

    public static void main(String[] args) {
        PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }
}
