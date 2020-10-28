package study.algorithmization.oneDimensionalArrays;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {

        double[] array = new double[10];
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;


        fillArrayFromConsole(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                posCount++;
            } else if (array[i] == 0) {
                zeroCount++;
            } else {
                negCount++;
            }
        }

        System.out.println("В массиве " + posCount + " положительных, " + negCount + " отрицательных и " + zeroCount
                            + " нулевых элементов");
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
}
