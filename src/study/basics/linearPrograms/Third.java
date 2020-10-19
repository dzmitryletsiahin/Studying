package study.basics.linearPrograms;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        int x;
        int y;

        Scanner scan = new Scanner(System.in);
        x =  scan.nextInt();
        y = scan.nextInt();

        int result = (int) (((Math.sin(x) + Math.cos(y)) / (Math.cos(x) * Math.sin(y))) * Math.tan(x * y));
        System.out.println(result);

    }
}
