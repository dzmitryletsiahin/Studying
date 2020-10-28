package study.algorithmization.oneDimensionalArrays;

import java.util.Random;

public class Sixth {
    public static void main(String[] args) {
        double[] arr = new Random().doubles(50, 0., 20.).toArray();
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(i + 1)) {
                sum += arr[i];
            }
        }
        System.out.println("Sum: " + sum);

    }

    public static boolean isPrime(int x) {
        if (x < 2) return false;
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }
}