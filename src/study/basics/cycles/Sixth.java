package study.basics.cycles;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число m: ");
        int m = scanner.nextInt();
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        if (n < m) {
            System.out.println("Неверный ввод");
        } else {
            for (int num = m; num <= n; num++)
                printDivisors(num);
        }
    }

    private static void printDivisors(int num) {

        System.out.println("Делители для числа " + num + " (исключая само число и 1): ");

        for (int i = 2; i < num; i++) {
            if ((num % i) == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}
