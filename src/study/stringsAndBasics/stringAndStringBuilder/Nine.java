package study.stringsAndBasics.stringAndStringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nine {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String strings = reader.readLine();
            System.out.println(" Small letters "+ findSmall(strings));
            System.out.println(" Big letters "+ findBig(strings));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int findSmall(String strings) {
        StringBuilder stringBuilder = new StringBuilder(strings);
        int counter = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) >= 'a' && stringBuilder.charAt(i) <= 'z'){
                counter++;
            }
        }
        return counter;
    }
    private static int findBig(String strings) {
        StringBuilder stringBuilder = new StringBuilder(strings);
        int counter = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) >= 'A' && stringBuilder.charAt(i) <= 'Z'){
                counter++;
            }
        }
        return counter;
    }
}
