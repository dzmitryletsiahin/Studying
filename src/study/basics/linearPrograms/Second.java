package study.basics.linearPrograms;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner scan = new Scanner(System.in);
        a =  scan.nextInt();
        b =  scan.nextInt();
        c =  scan.nextInt();

        int aPow = (int) Math.pow(a, 3);
        int bPow = (int) Math.pow(b, 2);
        int bNegPow = (int) Math.pow(b, -2);

        int result = (int) (b + Math.sqrt(bPow) + Math.sqrt(4 * a * c)) / (2 * a) - (aPow * c + bNegPow);
        System.out.println(result);
    }
}

