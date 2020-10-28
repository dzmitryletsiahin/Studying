package study.algorithmization.sorting;

import java.util.Arrays;

public class Sortings {
    public static void main(String[] args) {
        int[] ints = {10, 42, 74, 112, 96, 72, 54, 80, 91, 143};

        selectionSort(ints);
        bubbleSort(ints);
        insertionSort(ints);
        shellSort(ints);
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static void selectionSort(int[] array){
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i, i-1);
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array){
        for (int left = 0; left < array.length; left++) {
            int value = array[left]; // Вытаскиваем значение элемента

            int i = left - 1; // Перемещаемся по элементам, которые перед вытащенным элементом
            for (; i >= 0; i--) {
                if (value < array[i]) { // Если вытащили значение меньшее — передвигаем больший элемент дальше
                    array[i + 1] = array[i];
                } else {// Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            array[i + 1] = value; // В освободившееся место вставляем вытащенное значение
        }
        System.out.println(Arrays.toString(array));
    }

    public static void shellSort(int[] array ){
        int gap = array.length / 2; // Высчитываем промежуток между проверяемыми элементами
        while (gap >= 1) {          // Пока разница между элементами есть
            for (int right = 0; right < array.length; right++) { // Смещаем правый указатель, пока не сможем найти такой, что
                                                                // между ним и элементом до него не будет нужного промежутка
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]) {
                        swap(array, c, c + gap);
                    }
                }
            }
            gap = gap / 2; // Пересчитываем разрыв
        }
        System.out.println(Arrays.toString(array));
    }
}