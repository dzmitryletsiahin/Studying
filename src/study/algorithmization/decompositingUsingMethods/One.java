package study.algorithmization.decompositingUsingMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One {
    public static void main(String[] args) throws IOException {

        int a;
        int b;
        int nod;
        int nok;

        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите 2 натуральных числа:");
            a = Integer.parseInt(read.readLine());
            b = Integer.parseInt(read.readLine());
            nod = findNOD(a, b);
            System.out.println("Найбольший общий делитель: " + nod);
            nok = findNOK(a, b);
            System.out.println("Найменьшее общее кратное: " + nok);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int findNOD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        for (int i = 0; i < 2; i++) {
            while (a != 0 && b != 0) {
                if (a > b) {
                    a %= b;
                } else {
                    b %= a;
                }
            }
            a += b;
        }
        return a;
    }
    private static int findNOK(int a, int b) {
        return Math.abs(a * b / findNOD(a, b));
    }
}
