import java.util.Arrays;

public class Problem2 {
    public static int secondSmallest(int[] arr) {
        if(arr==null || arr.length < 2) {
            throw new IllegalArgumentException("Input array too small");
        }
        Arrays.sort(arr);
        return arr[1];
    }

    public static int secondSmallestFaster(int[] arr) {
        if(arr==null || arr.length < 2) {
            throw new IllegalArgumentException("Input array too small");
        }
        int small = Math.min(arr[0], arr[1]);
        int secondSmall = Math.max(arr[0], arr[1]);

        for(int i = 2; i < arr.length; i++) {
            if(arr[i] >= secondSmall) continue;
            if(arr[i] <= small) {
                secondSmall = small;
                small = arr[i];
            } else {
                secondSmall = arr[i];
            }
        }
        return secondSmall;
    }
}
