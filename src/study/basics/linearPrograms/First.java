package study.basics.linearPrograms;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner scan = new Scanner(System.in);
        a =  scan.nextInt();
        b =  scan.nextInt();
        c =  scan.nextInt();

        int result = ((a - 3) * b / 2) + c;
        System.out.println(result);
    }
}
