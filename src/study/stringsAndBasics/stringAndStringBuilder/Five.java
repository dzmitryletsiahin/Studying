package study.stringsAndBasics.stringAndStringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Five {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String string = reader.readLine();
            System.out.println(counter(string, 'a'));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int counter(String string, char character) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                counter++;
            }
        }
        return counter;
    }
}
