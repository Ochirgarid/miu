import java.util.Arrays;

public class App {
    public static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length + arr2.length;
        int[] result = new int[n];
        
        int i1 = 0;
        int i2 = 0;

        for(int i = 0; i < n; i++) {
            if(i1 == arr1.length || arr1[i1] > arr2[i2]) {
                result[i] = arr2[i2];
                i2 ++;
            } else {
                result[i] = arr1[i1];
                i1 ++;
            }
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        problem3Test();
    }

    public static String array2string(int[] arr){
        return Arrays.toString(arr);
    }

    public static void problem3Test() {
        System.out.println("Problem 3: Merge ");

        System.out.println("Input: [1, 4, 5, 8, 17], [2, 4, 8, 11, 13, 21, 23, 25]");
        System.out.println("Output: " 
            + array2string(
                merge(new int[]{1, 4, 5, 8, 17}, new int[]{2, 4, 8, 11, 13, 21, 23, 25})
            )
        );
        System.out.println("Expected: [1, 2, 4, 4, 5, 8, 8, 11, 13, 17, 21, 23, 25]");
    }
}
