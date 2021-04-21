public class Problem5 {
    public static boolean find(int[] arr, int z) {
        // Linear search with O(N) time complexity
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == z) {
                return true;
            }
        }
        return false;
    }        

    public static boolean findSorted(int[] arr, int z) {
        // Binary search with O(log(N)) time complexity
        int l = 0;
        int r = arr.length;

        while (l < r) {
            int mid = (l + r) / 2;
            if(arr[mid] == z) {
                return true;
            }
            if(arr[mid] > z) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }
}
