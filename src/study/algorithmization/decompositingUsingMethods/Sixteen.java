package study.algorithmization.decompositingUsingMethods;

public class Sixteen {
    public static void main(String[] args) {
        int n = 6;
        int sum = calculateSum(n);
        int evenNumbers = countEvenNumbers(sum);
        System.out.printf("Сумма %d чисел, состоящих из четных чисел: %d %n", n, sum);
        System.out.printf("В найденной сумме %d четных чисел", evenNumbers);
    }

    private static int calculateSum(int n) {
        int[] numbers = findNumbers(n);
        int sum = 0;
        for (int element : numbers) {
            sum += element;
        }
        return sum;
    }

    private static int[] findNumbers(int n) {
        int size = (int) Math.pow(5, n);
        int[] numbers = new int[size];
        int firstNumber = 1;
        for (int i = 1; i < n; i++) {
            firstNumber += (int) Math.pow(10, i);
        }
        numbers[0] = firstNumber;

        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = nextNumber(numbers[i - 1], n);
        }
        return numbers;
    }

    private static int nextNumber(int number, int n) {
        boolean isNext = false;
        while (!isNext) {
            number += 2;
            isNext = true;
            int m = n;
            while (m > 0) {
                if ((number / ((int) Math.pow(10, m-- - 1))) % 2 == 0) {
                    isNext = false;
                }
            }
        }
        return number;
    }

    private static int countEvenNumbers(int n) {
        int rest;
        int count = 0;
        while (n != 0) {
            rest = n % 10;
            n = n / 10;
            if (rest % 2 == 0)
                count++;
        }
        return count;
    }
}
