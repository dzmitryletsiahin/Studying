package study.algorithmization.decompositingUsingMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eight {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите число элементов массива (6 или больше элементов): ");
            int m = Integer.parseInt(read.readLine());
            int[] array = new int[m];
            if (m >= 6) {
                for (int i = 0; i < array.length; i++) {
                    int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                    array[i] = (int) (Math.random() * 100) * positiveNegative;
                    System.out.print(array[i] + ", ");
                }
                System.out.println("\nРезультат: ");
                calculate(array, 1);
                calculate(array, 3);
                calculate(array, 4);
            } else {
                System.out.println("Вы ввели меньше 6 элементов: ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void calculate(int[] array, int k) {
        int sum = 0;
        for (int i = k - 1; i < k + 2; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
