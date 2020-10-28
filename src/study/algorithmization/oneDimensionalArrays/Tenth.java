package study.algorithmization.oneDimensionalArrays;

import java.util.Arrays;

public class Tenth {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayReduce(array)));
    }

    public static int[] arrayReduce(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i = i + 2) {
            array[index] = array[i];
            index++;
        }

        Arrays.fill(array, index, array.length, 0);
        return array;
    }
}