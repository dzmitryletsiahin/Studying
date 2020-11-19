package study.algorithmization.decompositingUsingMethods;

public class Seventeen {
    public static void main(String[] args) {
        int n = countSubtraction(331);
        System.out.println("\nКоличество вычитаний: " + n);
    }

    private static int countSubtraction(int number) {
        int count = 0;
        while (number > 0) {
            number -= countSumOfDigits(number);
            count++;
        }
        return count;
    }

    private static int countSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.print(sum + ", ");
        return sum;
    }
}
