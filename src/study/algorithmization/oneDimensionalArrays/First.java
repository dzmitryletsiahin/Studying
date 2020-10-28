package study.algorithmization.oneDimensionalArrays;

import java.util.Random;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число k: ");
        int k = scanner.nextInt();
        int[] arr = new int[8];
        int sum = 0;

        fillArray(arr);
        printArray(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                sum += arr[i];
            }
        }

        System.out.println("Сумма элементов, которые кратны " + k + ", равна " + sum);
    }

    public static void fillArray(int[] mas) {
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(100);
        }
    }

    public static void printArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println("arr[" + i + "] = " + mas[i]);
        }
    }
}