package study.algorithmization.oneDimensionalArrays;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillArrayFromConsole(array);
        printValue(array);
    }

    public static void fillArrayFromConsole(int[] array) {
        System.out.println("Заполните массив: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("arr[" + i + "] => ");
            array[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public static void printValue(int[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] <= i) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
}