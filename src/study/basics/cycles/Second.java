package study.basics.cycles;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число A: ");
        int a = scanner.nextInt();
        System.out.print("Введите число B: ");
        int b = scanner.nextInt();

        functionValues(a, b);

    }

    private static void functionValues(int a, int b) {

        int h = 2;
        int y;

        for (int i = a; i <= b; i += h) {
            if (i > h) {
                y = i;
            } else {
                y = i * (-1);
            }
            System.out.println("При х = " + i + " у = " + y);
        }
        System.out.println();
    }
}