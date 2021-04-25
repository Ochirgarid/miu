import java.util.Arrays;
import java.util.HashMap;

public class App {
    static int[] ReverseList(int[] arr) {
        return ReverseList(arr, 0);
    }

    static int[] ReverseList(int[] arr, int idx) {
        int right_idx = arr.length - idx - 1;
        if(right_idx <= idx) {
            return arr;
        }
        int temp = arr[idx];
        arr[idx] = arr[right_idx];
        arr[right_idx] = temp;
        
        return ReverseList(arr, idx + 1);
    }

    static int FindFibIterate(int n){
        if(n < 2) return n;
        int prev = 0;
        int current = 1;
        for(int i = 2; i <= n; i++) {
            int temp = prev + current;
            prev = current;
            current = temp;
        }
        return current;
    }

    static int FindFibRecursive(int n, HashMap<Integer, Integer> fib) {
        if(fib.containsKey(n)) return fib.get(n);
        if(n < 2) {
            fib.put(n, n);
            return n;
        }
        int f1 = FindFibRecursive(n - 1, fib);
        int f2 = FindFibRecursive(n - 2, fib);
        fib.put(n, f1 + f2);
        return fib.get(n);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Reverse list:");
        System.out.println("ReverseList([1, 2, 3, 4]) : " + Arrays.toString(ReverseList(new int[]{1, 2, 3, 4})));
        System.out.println("ReverseList([1, 2, 3, 4, 5]) : " + Arrays.toString(ReverseList(new int[]{1, 2, 3, 4, 5})));

        System.out.println("Fibonacci O(N), by iteration:");
        System.out.println("FindFibIterate(5) : " + FindFibIterate(5));
        System.out.println("FindFibIterate(8) : " + FindFibIterate(8));
        System.out.println("FindFibIterate(10) : " + FindFibIterate(10));

        System.out.println("Fibonacci O(N), by recursion with memorization:");
        System.out.println("FindFibRecursive(5) : " + FindFibRecursive(5, new HashMap<Integer, Integer>()) );
        System.out.println("FindFibRecursive(8) : " + FindFibRecursive(8, new HashMap<Integer, Integer>() ));
        System.out.println("FindFibRecursive(10) : " + FindFibRecursive(10, new HashMap<Integer, Integer>()));
    }
}
