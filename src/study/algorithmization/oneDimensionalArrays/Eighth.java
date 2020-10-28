package study.algorithmization.oneDimensionalArrays;

import java.util.Arrays;

public class Eighth {
    public static void main(String[] args) {
        int[] array = {46, 234, 345, 112, 320, 154, 176, 124, 418};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(removeMins(array)));
    }

    public static int[] removeMins(int[] array) {
        int counter = 0;
        int min = array[0];

        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }

        for (int element : array) {
            if (element == min) {
                counter++;
            }
        }

        int[] result = new int[array.length - counter];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                result[j++] = array[i];
            }
        }

        return result;
    }
}

