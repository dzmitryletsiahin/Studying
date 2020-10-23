package study.basics.branching;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты точки А");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Введите координаты точки B");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println("Введите координаты точки C");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        isItStraightLine(x1, y1, x2, y2, x3, y3);

    }

    public static void isItStraightLine(int x1, int y1, int x2, int y2, int x3, int y3){
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("Точки принадлежат одной прямой");
        } else System.out.println("Точки не принадлежат одной прямой");
    }
}
