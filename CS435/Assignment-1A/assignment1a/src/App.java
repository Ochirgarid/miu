import java.util.Arrays;
import java.util.LinkedList;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        problem1Test();
        problem2Test();
        problem3Test();
        problem4Test();
        problem5Test();
    }

    public static void problem1Test() {
        System.out.println("------------------ Problem 1: ------------------");
        System.out.println("Slow: [1, 4, 2, 3], 5 : " + Problem1.sumFound(new int[] {1, 4, 2, 3}, 5));
        System.out.println("Slow: [3, 3, 4, 7], 6 : " + Problem1.sumFound(new int[] {3, 3, 4, 7}, 5));
        System.out.println("Slow: [1], 2 : " + Problem1.sumFound(new int[] {1}, 5));

        System.out.println("Faster: [1, 4, 2, 3], 5 : " + Problem1.sumFoundFaster(new int[] {1, 4, 2, 3}, 5));
        System.out.println("Faster: [3, 3, 4, 7], 6 : " + Problem1.sumFoundFaster(new int[] {3, 3, 4, 7}, 5));
        System.out.println("Faster: [1], 2 : " + Problem1.sumFoundFaster(new int[] {1}, 5));
    }

    public static void problem2Test() {
        System.out.println("------------------ Problem 2: ------------------");
        
        System.out.println("Slow: [1, 4, 2, 3] : " + Problem2.secondSmallest(new int[] {1, 4, 2, 3}));
        System.out.println("Slow: [3, 3, 7] : " + Problem2.secondSmallest(new int[] {3, 3, 7}));
        System.out.print("Slow: [9] : ");
        try { 
            System.out.println(Problem2.secondSmallest(new int[] {9}));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Faster: [1, 4, 2, 3] : " + Problem2.secondSmallestFaster(new int[] {1, 4, 2, 3}));
        System.out.println("Faster: [3, 3, 7] : " + Problem2.secondSmallestFaster(new int[] {3, 3, 7}));
        System.out.print("Slow: [9] : ");
        try { 
            System.out.println(Problem2.secondSmallestFaster(new int[] {9}));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void problem3Test() {
        System.out.println("------------------ Problem 3: ------------------");
        System.out.println("Slow: [1, 3, 9, 4, 8, 5] and k = 21 : " + Problem3.sumFound(new ArrayList<Integer>(Arrays.asList(1, 3, 9, 4, 8, 5)), 21) );
        System.out.println("Slow: [1, 3, 9, 4, 8, 5] and k = 22 : " + Problem3.sumFound(new ArrayList<Integer>(Arrays.asList(1, 3, 9, 4, 8, 5)), 22));
        System.out.println("Slow: [1, 3, 9, 4, 8, 5] and k = 31 : " + Problem3.sumFound(new ArrayList<Integer>(Arrays.asList(1, 3, 9, 4, 8, 5)), 31));
        System.out.println("Slow: [1, 3, 9, 4, 8, 5] and k = 0 : " + Problem3.sumFound(new ArrayList<Integer>(Arrays.asList(1, 3, 9, 4, 8, 5)), 0));


        System.out.println("Faster: [1, 3, 9, 4, 8, 5] and k = 21 : " + Problem3.sumFoundFaster(new ArrayList<Integer>(Arrays.asList(1, 3, 9, 4, 8, 5)), 21) );
        System.out.println("Faster: [1, 3, 9, 4, 8, 5] and k = 22 : " + Problem3.sumFoundFaster(new ArrayList<Integer>(Arrays.asList(1, 3, 9, 4, 8, 5)), 22));
        System.out.println("Faster: [1, 3, 9, 4, 8, 5] and k = 31 : " + Problem3.sumFoundFaster(new ArrayList<Integer>(Arrays.asList(1, 3, 9, 4, 8, 5)), 31));
        System.out.println("Faster: [1, 3, 9, 4, 8, 5] and k = 0 : " + Problem3.sumFoundFaster(new ArrayList<Integer>(Arrays.asList(1, 3, 9, 4, 8, 5)), 0));
    }

    public static void problem4Test() {
        System.out.println("------------------ Problem 4: ------------------");

        System.out.println("ArrayList: [1, 3, 9, 4, 8, 5]: ");
        Problem4.sort(new ArrayList<Integer>(Arrays.asList(1, 3, 9, 4, 8, 5)));

        System.out.println("LinkedList: [1, 3, 9, 4, 8, 5]: ");
        Problem4.sort(new LinkedList<>(Arrays.asList(1, 3, 9, 4, 8, 5)));
    }

    public static void problem5Test() {
        System.out.println("------------------ Problem 5: ------------------");
        System.out.println("Unsorted O(N): [1, 4, 2, 3], 3 : " + Problem5.find(new int[] {1, 4, 2, 3}, 3));
        System.out.println("Unsorted O(N): [1, 4, 2, 3], 5 : " + Problem5.find(new int[] {1, 4, 2, 3}, 5));

        System.out.println("Sorted O(log(N)): [1, 4, 2, 3], 3 : " + Problem5.findSorted(new int[] {1, 2, 3, 4}, 3));
        System.out.println("Sorted O(log(N)): [1, 4, 2, 3], 5 : " + Problem5.findSorted(new int[] {1, 2, 3, 4}, 5));
    }
}
