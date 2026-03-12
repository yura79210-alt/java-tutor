public class Factorial {
    public static long calculate(int n) {
        long fac = 1;
        for (int i = 1; i <= n; i++) {
             fac *= i;

        }
        return fac;
    }
}