package study.stringsAndBasics.stringAsAnArray;

public class Second {
    public static void main(String[] args) {
        String string = "I see this word, hear this word, feel this word everywhere.";
        System.out.println(string.replace("word", "letter"));

        String word = "If my word isn't good enough for you guys, find someone else whose word is.";
        String letter = wordChanger(word);
        System.out.println(word);
        System.out.println(letter);
    }
    private static String wordChanger(String word) {
        StringBuilder strBuilder = new StringBuilder();
        String letter;
        for (int i = 0; i < word.length(); i++) {
            if (i + 3 < word.length() && word.charAt(i) == 'w'
                    && word.charAt(i + 1) == 'o'
                    && word.charAt(i + 2) == 'r'
                    && word.charAt(i + 3) == 'd') {
                strBuilder.append("letter");
                i += 3;
            } else {
                strBuilder.append(word.charAt(i));
            }
        }
        letter = strBuilder.toString();
        return letter;
    }
}
