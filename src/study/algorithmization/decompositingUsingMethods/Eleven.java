package study.algorithmization.decompositingUsingMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eleven {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите число M: ");
            int m = Integer.parseInt(read.readLine());
            System.out.println("Введите число N: ");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Число, состоящее из большего количества цифр: ");
            System.out.println(moreDigits(m, n));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String moreDigits(int m, int n) {
        int firstCount = (int)(Math.log10(Math.abs(m))+1);
        int secondCount = (int)(Math.log10(Math.abs(n))+1);
        if (firstCount == secondCount) {
            return "Количество цифр равно";
        } else {
            return (firstCount > secondCount) ? ("число M") : ("число N");
        }
    }
}
