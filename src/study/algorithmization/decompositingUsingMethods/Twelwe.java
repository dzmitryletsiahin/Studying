package study.algorithmization.decompositingUsingMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Twelwe {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите число K: ");
            int k = Integer.parseInt(read.readLine());
            System.out.println("Введите число N: ");
            int n = Integer.parseInt(read.readLine());

            int [] array = createArray(k, n);

            System.out.println("Результат: ");
            printArray(array);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int [] createArray (int k, int n) {
        int [] array = new int[k];
        int i;
        for (i = 0; i < array.length && k > n; i++) {
            array[i] = (int) (Math.random() * n) + 1;
            k -= array[i];
        }
        array[i] = k;
        int [] arrayA = new int[i + 1];
        System.arraycopy(array, 0, arrayA, 0, i + 1);
        return arrayA;
    }

    private static void printArray (int [] array) {  //вывод массива
        for (int element : array) {
            System.out.printf("%3d ", element);
        }
    }
}
