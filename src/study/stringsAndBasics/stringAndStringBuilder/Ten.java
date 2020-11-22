package study.stringsAndBasics.stringAndStringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ten {
    public static void main(String[] args) {
        int numOfSentences = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите предложения: ");
            String strings = reader.readLine();
            for (int i = 0; i < strings.length(); i++){
                if (strings.charAt(i) == '.' || strings.charAt(i) == '!' || strings.charAt(i) == '?'){
                    numOfSentences++;
                }
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        System.out.println("В строке " + numOfSentences + " предложений(я)");
    }
}
