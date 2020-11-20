package study.stringsAndBasics.stringAsAnArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fourth {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String strings = reader.readLine();
            System.out.println(findNumbers(strings));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int findNumbers (String strings) {
        int counter = 0;
        for (int i = 0; i < strings.length(); i++) {
            if (isDigit(strings.charAt(i))) {
                if (i == strings.length() - 1 || !isDigit(strings.charAt(i + 1))) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private static boolean isDigit (char chars) {
        boolean isDigit = false;
        char [] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < digits.length; i++) {
            if (chars == digits[i]) {
                isDigit = true;
                break;
            }
        }
        return isDigit;
    }
}
