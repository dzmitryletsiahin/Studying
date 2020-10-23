package study.basics.cycles;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        summation(num);
    }

    public static void sum (int num){
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);

    }

    public static void summation(int num){
        if(num <= 0){
            System.out.println("Число не положительное");
        }else {
            sum(num);
        }
    }
}