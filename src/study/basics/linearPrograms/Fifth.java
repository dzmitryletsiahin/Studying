package study.basics.linearPrograms;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        int T;

        Scanner scan = new Scanner(System.in);
        T =  scan.nextInt();

        int hour = T / 3600;
        int min = T % 3600 / 60;
        int sec = T % 3600 % 60;
        System.out.println(hour + " ч " + min + " мин " + sec + " с");
    }
}
