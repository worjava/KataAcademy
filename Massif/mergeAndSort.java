package Massif;

import java.util.Arrays;

public class mergeAndSort {
    //    Реализовать метод mergeAndSort(int[] firstArray,
//     int[] secondArray), который принимает соединяет
//     и сортирует два произвольных массива чисел
//    Пример ввода: {1, 3, 7, 5}, {8, 4, 2, 4}
//    Пример вывода: [1, 2, 3, 4, 4, 5, 7, 8]
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        int     i = 0;
        int j = 0;
        int k = 0;
        for (; i < firstArray.length && j < secondArray.length; k++) {
            if (firstArray[i] < secondArray[j]) {
                mergedArray[k] = firstArray[i];
                i++;
            } else {
                mergedArray[k] = secondArray[j];
                j++;
            }
        }
        for (; i < firstArray.length; i++, k++) {
            mergedArray[k] = firstArray[i];
        }
        for (; j < secondArray.length; j++, k++) {
            mergedArray[k] = secondArray[j];
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] a = {11, 22, 33, 44, 55};
        int[] b = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(mergeAndSort(a, b)));
    }
}

