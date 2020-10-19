package study.basics.linearPrograms;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(is(x,y));
    }

    public static boolean is (int x,int y) {
        if (Math.abs(x) > 4 && y <= 0) return false;
        if (Math.abs(x) > 2 && y > 0) return false;
        return y <= 5 && y >= -3;
    }
}

