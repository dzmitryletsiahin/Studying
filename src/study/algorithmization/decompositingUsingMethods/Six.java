package study.algorithmization.decompositingUsingMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Six {
    public static void main(String[] args) {

        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите первое число: ");
            int a = Integer.parseInt(read.readLine());

            System.out.println("Введите второе число: ");
            int b = Integer.parseInt(read.readLine());

            System.out.println("Введите третье число: ");
            int c = Integer.parseInt(read.readLine());

            int [] number = {a, b, c};
            System.out.println("Какое число взаимно простое?");
            System.out.println(isMutually(number));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int findNOD(int [] number) {
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

    private static boolean isMutually (int[] a) {
        return findNOD(a) == 1;
    }
}
