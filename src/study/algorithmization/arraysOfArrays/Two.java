package study.algorithmization.arraysOfArrays;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту матрицы: ");
        int height = scanner.nextInt();
        System.out.println("Введите ширину матрицы: ");
        int width = scanner.nextInt();

        if(height != width){
            System.out.println("Высота и ширина квадратной матрицы должны совпадать");
        }

        int[][] matrix = new int[height][width];

        for (int i = 0; i < height; i++) {
            System.out.println((i + 1) + "-я строка матрицы: ");
            for (int j = 0; j < width; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println();

        printDiagonalLine(matrix);
    }

    public static void printDiagonalLine(int[][] matrix){
        System.out.println("Элементы стоящие на диагонали: ");
        for (int i = 0; i < matrix.length; i++){
            System.out.print(matrix[i][i] + " ");
        }
    }
}
