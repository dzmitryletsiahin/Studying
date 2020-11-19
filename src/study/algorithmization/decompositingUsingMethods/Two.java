package study.algorithmization.decompositingUsingMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Two {
    public static void main(String[] args) throws IOException {

        int nod;
        System.out.println("Введите натуральное число: ");
        int[] number = fillArray(6);
        nod = findNOD(number);
        System.out.println("\nНайбольший общий делитель: " + nod);

    }

    private static int[] fillArray(int n) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите число a" + (i + 1) + ":");
            array[i] = Integer.parseInt(rd.readLine());
        }
        return array;
    }

    private static int findNOD(int[] number) {
        int a = Math.abs(number[0]);
        for (int element : number) {
            int b = Math.abs(element);
            while (a != 0 && b != 0) {
                if (a > b) {
                    a %= b;
                } else {
                    b %= a;
                }
            }
            a += b;
        }
        return a;
    }

}
