package study.basics.cycles;

public class Fourth {
    public static void main(String[] args) {

        squareMultiply();

    }

    public static void squareMultiply() {
        int num = 200;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum *= Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}
