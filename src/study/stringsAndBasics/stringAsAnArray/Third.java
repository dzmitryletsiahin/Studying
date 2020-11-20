package study.stringsAndBasics.stringAsAnArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Third {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            findDigits(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void findDigits(String strings) {
        char[] array = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int counter = 0;
        for (int i = 0; i < strings.length(); i++) {
            for (int j = 0; j < array.length; j++) {
                if (strings.charAt(i) == array[j]) {
                    counter++;
                }
            }
        }
        System.out.print("Количество цифр - " + counter);
    }
}
