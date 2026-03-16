import java.util.Scanner;
public class Factorial {
    public long calculate() {
        Scanner f = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число (или exit для выхода): ");
            String line = f.nextLine().trim();
            if (line.equalsIgnoreCase("exit")) {
                System.out.println("Всего доброго!");
                return -1;
            }
            try {
                int n = Integer.parseInt(line);
                if (n < 0) {
                    System.out.println("Введенное число должно быть больше 0!");
                    continue;
                }
                long fac = completeFactorial(n);
                return fac;
            } catch (NumberFormatException ex) {
                System.out.println("Это не целое число. Попробуйте ещё раз.");
            }
        }
    }
    private long completeFactorial (int n){
                long fac = 1;
                for (int i = 1; i <= n; i++) {
                    fac *= i;
                }
                return fac;
            }
        }

