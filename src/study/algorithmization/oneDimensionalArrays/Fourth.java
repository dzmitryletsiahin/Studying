package study.algorithmization.oneDimensionalArrays;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        double[] array = new double[10];
        int minIndex = 0;
        int maxIndex = 0;
        double min;
        double max;

        fillArrayFromConsole(array);

        min = array[0];
        max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            } else if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        double temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        printArray(array);

        System.out.println();
    }

    public static void fillArrayFromConsole(double[] mas) {
        System.out.println("Заполните массив из 10 элементов: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {
            System.out.print("arr[" + i + "] => ");
            mas[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public static void printArray(double[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println("arr[" + i + "] = " + mas[i]);
        }
    }
}
