import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите нужное действие: ");
            System.out.println("1 - Посчитать факториал! ");
            System.out.println("2 - Посчитать фибоначи! ");
            System.out.println("3 - Выход. ");
            if (f.hasNextInt()) {
                int d = f.nextInt();
                if (d == 3) {
                    System.out.println("Всего доброго!");
                    break;
                } else if (d == 2) {
                    Fibonacci calc = new Fibonacci();
                    long res = calc.calculate();
                    if (res >= 0) {
                        System.out.println("Результат: " + res);
                    }
                }else if (d == 1) {
                        Factorial calc = new Factorial();
                        long fac = calc.calculate();
                        if (fac >= 0) {
                            System.out.println("Результат: " + fac);
                        } else {
                            System.out.println("Неверный вариант выбора! ");
                        }
                    } else {
                        String e = f.next();
                        if (e.equals("exit")) {
                            System.out.println("Всего доброго!");
                            break;
                        } else {
                            System.out.println("Вы ввели не число ");
                        }
                    }
                }
            }
        }
    }

