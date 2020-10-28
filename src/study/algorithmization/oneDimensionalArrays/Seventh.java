package study.algorithmization.oneDimensionalArrays;

public class Seventh {
    public static void main(String[] args) {

        int[] array = {10, 5, 16, 2};
        getMaxSum(array);
    }

    public static void getMaxSum (int[] array){
        int maxSum = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            if ((array[i] + array[array.length - i - 1]) > maxSum) {
                maxSum = array[i] + array[array.length - i - 1];
            }

        }
        System.out.println(maxSum);
    }
}