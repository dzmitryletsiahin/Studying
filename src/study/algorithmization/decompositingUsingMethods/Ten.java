package study.algorithmization.decompositingUsingMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ten {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите размер массива: ");
            int m = Integer.parseInt(read.readLine());
            System.out.println("Введите число N: ");
            int n = Integer.parseInt(read.readLine());

            creationOfArray (m, n);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void creationOfArray (int m, int n) {
        int [] array = new int [m];
        for(int i = 0; i < array.length;i++){
            array[i] = n;
            System.out.printf("%d, ", array[i]);
        }
    }
}