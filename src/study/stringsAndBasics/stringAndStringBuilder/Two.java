package study.stringsAndBasics.stringAndStringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Two {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String strings = reader.readLine();
            System.out.println(putBAfterA(strings, "a", "b"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String putBAfterA(String text, String symbolBefore, String symbolAfter) {
        return text.replaceAll(symbolBefore, symbolBefore + symbolAfter);
    }
}
