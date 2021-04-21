public class Problem8 {
    public static int smallestCommon(int x, int y) {
        // naive linear search with O(N * M) time complexity

        for(int i = 1; i < x * y; i ++) {
            if(i % x == 0 && i % y == 0) {
                return i;
            }
        }
        return x * y;
    }

    public static int gcd(int x, int y) {
        if (x > y) return gcd(y, x);
        if (y % x == 0) return x;
        return gcd(x, y % x);
    }

    public static int smallestCommonFaster(int x, int y) {
        // Using GCD and calculus with O(log(N)) time complexity
        int d = gcd(x, y);
        return x * y / d;
    }
}
