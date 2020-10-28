package study.algorithmization.oneDimensionalArrays;

import java.util.Scanner;

public class Second {

    public static void main(String[] args) {

        double[] array = new double[5];
        double z = 8.0;
        int count = 0;

        System.out.println("Z = " + z);
        fillArrayFromConsole(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                count++;
            }
        }

        printArray(array);
        System.out.println("Количество замен: " + count);
        System.out.println();
    }

    public static void fillArrayFromConsole(double[] mas) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {
            System.out.print("arr[" + i + "] => ");
            mas[i] = scanner.nextDouble();
        }
        scanner.close();
    }

    public static void printArray(double[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println("arr[" + i + "] = " + mas[i]);
        }
    }
}

