import java.util.List;

public class Problem3 {
    public static boolean sumFound(List<Integer> list, int k) {
        // bitmask approach O(2^n)
        int n = list.size();

        for(int mask = 0; mask < (1 << n); mask ++) {
            int curSum = 0;
            for(int i = 0; i < n; i++) {
                if( ((1 << i) & mask) != 0) {
                    curSum += list.get(i);
                } 
            }
            if(curSum == k){
                return true;
            }
        }
        return false;
    }

    public static boolean sumFoundFaster(List<Integer> list, int k) {
        // dp approach O(N * K)
        int n = list.size();
        boolean[][] dp = new boolean[k + 1][n];

        for(int i = 0; i < k + 1; i ++) {
            for(int j = 0; j < n; j ++) {
                // System.out.println(i + " " + j);
                if(i == 0) {
                    dp[i][j] = true;
                    continue;
                }
                int val = list.get(j);
                if(j == 0) {
                    if(i == val) {
                        dp[i][j] = true;
                    }
                    continue;
                }
                if(val <= i) {
                    dp[i][j] = dp[i][j - 1] | dp[i - val][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
                
            }
        }
        return dp[k][n - 1]; 
    }
}
