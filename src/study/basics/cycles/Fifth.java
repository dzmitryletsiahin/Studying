package study.basics.cycles;

public class Fifth {
    public static void main(String[] args) {
        printSymbols();
    }

    public static void printSymbols() {
        for (int i = 32; i <= 126; i++) {
            System.out.println(i + " " + (char) i);
        }
        System.out.println();
    }
}

