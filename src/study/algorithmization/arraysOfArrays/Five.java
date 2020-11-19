package study.algorithmization.arraysOfArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Five {
    public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
        System.out.println("Введите квадратную матрицу параметры которой четное число: ");
        int n = Integer.parseInt(reader.readLine());
        int[][] matrix = new int[n][n];
        if (n % 2 == 0) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i > 0)  {
                        if (n - (i + j) <= 0) {
                            matrix[i][j] = 0;
                        } else {
                            matrix[i][j] = i + 1;
                        }
                        System.out.printf("%3d ", matrix[i][j]);
                    }
                    else {
                        matrix[i][j] = 1;
                        System.out.printf("%3d ", matrix[i][j]);
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Введенное число нечетное!");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
