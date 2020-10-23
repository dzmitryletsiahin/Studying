package study.basics.branching;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение угла А");
        int a = scanner.nextInt();
        System.out.println("Введите значение угла B");
        int b = scanner.nextInt();

        isTriangle(a, b);

    }

    public static void isTriangle (int a, int b){
        if (a + b >= 180 || a <= 0 || b <= 0){
            System.out.println("Такой треугольник не может существовать");
        } else if (a == 90 || b == 90 || a + b == 90){
            System.out.println("Это прямоугольный треугольник");
        } else {
            System.out.println("Это треугольник");
        }
    }
}
