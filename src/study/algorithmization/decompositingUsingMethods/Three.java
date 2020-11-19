package study.algorithmization.decompositingUsingMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Three {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите сторону шестиугольника: ");
            double a = Double.parseDouble(reader.readLine());
            System.out.println("Площадь шестиугольника: ");
            System.out.printf("%.1f", squareCounter(a));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double squareCounter(double a) {
        return (3 * Math.sqrt(3) * Math.pow(a, 2)) / 2;
    }
}
