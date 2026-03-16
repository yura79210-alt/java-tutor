import java.util.Scanner;
public class Fibonacci {
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
                long res = addFactorial(n);
                return res;
            } catch (NumberFormatException ex) {
                System.out.println("Это не целое число. Попробуйте ещё раз.");
            }
        }
    }
private long addFactorial (int n){
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
