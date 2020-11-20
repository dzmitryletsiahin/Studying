package study.stringsAndBasics.stringAsAnArray;

public class First {
    public static void main(String[] args) {
        String [] camelCase = {"helloWorld", "hoHoHo"};
        String[] snakeCase = caseConverter(camelCase);
        System.out.println(String.join(", ", camelCase));
        System.out.println(String.join(", ", snakeCase));
    }
    private static String[] caseConverter(String[]array){

        String [] snakeCase = new String[array.length];
        for ( int i = 0; i < array.length; i++){
            StringBuilder stringBuilder = new StringBuilder();
            for ( int j = 0; j < array[i].length(); j++){
                char letter = array[i].toCharArray()[j];
                if (Character.isLowerCase(letter)){
                    stringBuilder.append(letter);
                }else {
                    stringBuilder.append("_");
                    stringBuilder.append(Character.toLowerCase(letter));
                }
            }
            snakeCase[i] = stringBuilder.toString();
        }
        return snakeCase;
    }
}
