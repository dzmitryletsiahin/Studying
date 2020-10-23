package study.basics.cycles;

import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число A: ");
        int a = in.nextInt();
        System.out.print("Введите число B: ");
        int b = in.nextInt();

        digitCompare(a,b);

    }

    public static void digitCompare(int a, int b){

        int[] arr = new int[10];

        while (a != 0) {
            arr[a % 10]++;
            a /= 10;
        }

        while (b != 0) {
            if (arr[b % 10] != 0)
                System.out.print(b % 10 + " ");
            b /= 10;
        }
    }
}