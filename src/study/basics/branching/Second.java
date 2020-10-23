package study.basics.branching;

import java.util.Arrays;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        calculateMaxFromMin(a, b , c ,d);
    }

    public static void calculateMaxFromMin(int a, int b, int c, int d) {
        Math.max(Math.min(a, b), Math.min(c, d));
    }
}