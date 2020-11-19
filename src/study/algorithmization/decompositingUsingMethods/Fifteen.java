package study.algorithmization.decompositingUsingMethods;

public class Fifteen {
    public static void main(String[] args) {
        findNumbers(2);
        findNumbers(3);
        findNumbers(4);
        findNumbers(5);
        findNumbers(6);
        findNumbers(7);
        findNumbers(8);
        findNumbers(9);

    }

    private static void findNumbers (int n) {
        int [] number = new int[n];
        number[0] = 1;
        while (number[n - 1] < 9) {
            for (int i = 1; i < number.length; i++) {
                number[i] = number[0] + i;
            }
            for (int element : number) {
                System.out.print(element);
            }
            System.out.print(", ");
            number[0]++;
        }
        System.out.println("\b\b");
    }
}
