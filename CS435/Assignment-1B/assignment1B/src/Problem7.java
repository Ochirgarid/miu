public class Problem7 {
    public static int generate(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        // naive O(2^N) recursive approach
        return generate(n - 1) + generate(n - 2);
    }

    public static int generateFaster(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        // Memorization O(N) Linear approach
        int prevPrev = 0;
        int prev = 1;
        n --;
        while (n > 0) {
            int tmp = prev + prevPrev;
            prevPrev = prev;
            prev = tmp;
            n --;
        }
        return prev;
    }
}
