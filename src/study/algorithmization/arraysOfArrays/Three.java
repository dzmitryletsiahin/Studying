package study.algorithmization.arraysOfArrays;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 3}, {0, -1, -2, -3}, {4, 5, 6, 7}, {-4, -5, -6, -7}};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер столбца матрицы: ");
        int height = scanner.nextInt();
        System.out.println("Введите номер строки матрицы: ");
        int width = scanner.nextInt();

        System.out.println("Строка: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == width - 1)
                    System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("Столбeц: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == height - 1)
                    System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
