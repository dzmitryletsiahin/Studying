package study.basics.branching;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение стороны А");
        int a = scanner.nextInt();
        System.out.println("Введите значение стороны B");
        int b = scanner.nextInt();

        System.out.println("Введите значение стороны X");
        int x = scanner.nextInt();
        System.out.println("Введите значение стороны Y");
        int y = scanner.nextInt();
        System.out.println("Введите значение стороны Z");
        int z = scanner.nextInt();

        willPassThrough(a, b, x, y, z);

    }

    public static void willPassThrough(int a, int b, int x, int y, int z) {
        if (x <= a && y <= b || y <= a && x <= b ||
                x <= a && z <= b || z <= a && x <= b ||
                z <= a && y <= b || y <= a && z <= b)
            System.out.println("Кирпич пройдет");
        else
            System.out.println("Кирпич не пройдет");
    }
}
