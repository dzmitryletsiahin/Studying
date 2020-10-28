package study.algorithmization.oneDimensionalArrays;

public class Nineth {
    public static void main(String[] args) {
        int[] array = {12, 8, 8, 7, 0, 0, 4, 5, 4, 8};
        printNumberFrequency(array);

    }

    public static void printNumberFrequency(int[] array) {
        int[] freq = new int[array.length];
        int globalFreqCounter = 0;

        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == number) {
                    counter++;
                }
            }

            freq[i] = counter;
            if (counter > globalFreqCounter) {
                globalFreqCounter = counter;
            }
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == globalFreqCounter && array[i] < result) {
                result = array[i];
            }
        }

        System.out.println(result);
    }
}