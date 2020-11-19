package study.algorithmization.arraysOfArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Twelwe {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите количество строк");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Введите количество столбцов");
            int m = Integer.parseInt(read.readLine());
            int[][] matrix = new int[n][m];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                    matrix[i][j] = (int) (Math.random() * 100) * positiveNegative;
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            boolean isSorted;
            int swap;
            System.out.println("\nСортировка по возрастанию ");
            for (int i = 0; i < matrix.length; i++) {
                isSorted = false;
                while (!isSorted) {
                    isSorted = true;
                    for (int j = 0; j < matrix[i].length - 1; j++) {
                        if (matrix[i][j] > matrix[i][j + 1]) {
                            isSorted = false;
                            swap = matrix[i][j];
                            matrix[i][j] = matrix[i][j + 1];
                            matrix[i][j + 1] = swap;
                        }
                    }
                }
            }
            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    System.out.printf("%3d ", anInt);
                }
                System.out.println();
            }

            System.out.println("\nСортировка по убыванию ");
            for (int i = 0; i < matrix.length; i++) {
                isSorted = false;
                while (!isSorted) {
                    isSorted = true;
                    for (int j = 0; j < matrix[i].length - 1; j++) {
                        if (matrix[i][j] < matrix[i][j + 1]) {
                            isSorted = false;
                            swap = matrix[i][j];
                            matrix[i][j] = matrix[i][j + 1];
                            matrix[i][j + 1] = swap;
                        }
                    }
                }
            }
            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    System.out.printf("%3d ", anInt);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
