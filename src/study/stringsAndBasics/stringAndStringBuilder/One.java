package study.stringsAndBasics.stringAndStringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String strings = reader.readLine();
            System.out.println(replace(strings));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static int replace(String strings) {
        int counter = 0;
        int maxCount = 0;

        for (int i = 0; i < strings.length(); i++) {
            if (strings.charAt(i) == ' ') {
                counter++;
            } else {
                if (maxCount < counter) {
                    maxCount = counter;
                }
                counter = 0;
            }
        }
        return maxCount;
    }
}
