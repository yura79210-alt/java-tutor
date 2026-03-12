public class Fibonacci {
    public static long calculate(int n) {
        long a = 0;
        long b = 1;
        for (int i = 0; i < n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        return b;

    }
}