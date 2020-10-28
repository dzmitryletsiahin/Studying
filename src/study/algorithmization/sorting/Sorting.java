package study.algorithmization.sorting;

public class Sorting {
    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int[] b = new int[]{7, 8, 9, 0};
        int[] c = concat(a, b, 2);
        for (int i : c) {
            System.out.print(i + " ");
        }
    }

    private static int[] concat(int[] a, int[] b, int i) {
        int aLen = a.length;
        int bLen = b.length;
        int[] c = new int[aLen + bLen];
        System.arraycopy(a, 0, c, 0, aLen);
        System.arraycopy(b, 0, c, aLen, bLen);
        int shift;
        for (int index = 0; index < bLen; index++) {
            shift = index + i;
            int tmp = c[shift];
            c[shift] = c[shift + bLen];
            c[shift + bLen] = tmp;
        }
        return c;
    }
}