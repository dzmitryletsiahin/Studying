package study.basics.branching;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение Х: ");
        int x = scanner.nextInt();

        functionValue(x);
    }

    private static void functionValue(int x) {

        double squaredX = Math.pow(x, 2);
        double cubedX = Math.pow(x, 3);

        if (x <= 3) {
            System.out.println(squaredX - 3 * x + 9);
        } else {
            System.out.println(1 / (cubedX + 6));
        }
    }
}
