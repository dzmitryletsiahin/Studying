package study.algorithmization.decompositingUsingMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nine {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите размеры сторон четырехугольника: ");
            System.out.println("x = ");
            int x = Integer.parseInt(read.readLine());
            System.out.println("y = ");
            int y = Integer.parseInt(read.readLine());
            System.out.println("z = ");
            int z = Integer.parseInt(read.readLine());
            System.out.println("t = ");
            int t = Integer.parseInt(read.readLine());

            System.out.println("Площадь четырехугольника: ");
            double quadrilateral = (float) calculateSquare(x, y, z, t);
            System.out.println(quadrilateral);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double calculateSquare(double x, double y, double z, double t) {
        double diagonal = Math.sqrt(x * x + y * y);
        double s1 = x * y / 2;
        double p = (diagonal + z + t) / 2;
        double s2 = Math.sqrt(p * (p - diagonal) * (p - z) * (p - t));
        return s1 + s2;
    }
}
