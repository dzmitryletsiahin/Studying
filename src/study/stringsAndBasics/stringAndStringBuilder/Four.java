package study.stringsAndBasics.stringAndStringBuilder;

public class Four {
    public static void main(String[] args) {
        String word = "информатика";
        System.out.println(turnOut(word));
    }

    private static String turnOut (String word) {
        String cake = String.valueOf(word.charAt(word.indexOf('т')));
        cake += String.valueOf(word.charAt(word.indexOf('о')));
        cake += String.valueOf(word.charAt(word.indexOf('р')));
        cake += String.valueOf(word.charAt(word.indexOf('т')));
        return cake;
    }
}
