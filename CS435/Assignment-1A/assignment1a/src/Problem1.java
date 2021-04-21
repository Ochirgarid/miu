import java.util.Arrays;

public class Problem1 {
    public static boolean sumFound(int[] arr, int z) {
        if(arr==null || arr.length < 2) {
            return false;
        }
        for (int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] + arr[j] == z && arr[i] != arr[j] ) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean sumFoundFaster(int[] arr, int z) {
        if(arr==null || arr.length < 2) {
            return false;
        }

        boolean[] seenValues = new boolean[z + 1];
        Arrays.fill(seenValues, false);

        for (int i = 0; i < arr.length; i ++) {
            if(arr[i] > z) continue;
            int completion = z - arr[i];
            if (completion != arr[i] && completion <= z && seenValues[completion] == true) {
                return true;
            }
            seenValues[arr[i]] = true;
        }
        return false;
    }
        
}
