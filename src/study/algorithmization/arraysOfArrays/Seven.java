package study.algorithmization.arraysOfArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Seven {
    public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
        System.out.println("Введите квадратную матрицу с чётным числом n: ");
        int n = Integer.parseInt(reader.readLine());
        double [][] matrix = new double[n][n];
        int count;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin((i * i - j * j) / n);
                System.out.printf("%10f",matrix[i][j]);
            }
            System.out.println();
        }

        count = 0;
        for (double [] array : matrix) {
            for (double element : array) {
                if (element > 0) {
                    count++;
                }
            }
        }
        System.out.printf("%n Количество положительных чисел: %d", count);

    } catch (IOException e) {
        e.printStackTrace();
    }
}

}
