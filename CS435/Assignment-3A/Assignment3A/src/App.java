public class App {
    public static int isPrime(int n) {
        return isPrime(n, (int) Math.floor(Math.sqrt(n)) );
    }
    public static int isPrime(int n, int d) {
        if(d == 1) { return 1; }
        if(n == 1 || n % d == 0) { return 0; }
        return isPrime(n, d - 1);
    }
    public static int gcd(int m, int n){
        if(n < m) return gcd(n, m);
        if(n % m == 0) return m;
        return gcd(n % m, m);
    }

public static boolean problem3(int m, int n) {
    int d = gcd(m, n);
    while (d % 2 == 0) {
        d /= 2;
    }
    if(d > 1 && isPrime(d) == 1) {
        return true;
    }
    return false;
}
    public static void main(String[] args) throws Exception {
        System.out.println("isPrime(5): " + isPrime(5));
        System.out.println("isPrime(6): " + isPrime(6));

        System.out.println("problem3(24, 40): " + problem3(24, 40));
        System.out.println("problem3(24, 36): " + problem3(24, 36));
        System.out.println("problem3(24, 35): " + problem3(24, 35));
    }
}
