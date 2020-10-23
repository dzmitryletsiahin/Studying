package study.basics.cycles;

public class Third {
    public static void main(String[] args) {

        squareSum();
    }

    public static void squareSum() {
        int num = 100;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}