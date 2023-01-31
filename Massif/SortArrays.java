package Massif;

import java.util.Arrays;

public class SortArrays {
public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
    int[] merge = new int[firstArray.length + secondArray.length];
    for (int i = 0; i < firstArray.length; i++) {
        merge[i] = firstArray[i];
    }
    for (int i = 0; i < secondArray.length; i++) {
        merge[i + firstArray.length] = secondArray[i];
    }
    Arrays.sort(merge);
    return merge;
}


    public static void main(String[] args) {
        int a[] = {};
        int b[] = {4, 5, 67, 8, 9, 5, 3, 4, 6, 7, 8, 3, 2, 5, 1, 4, 5, 7, 9, 5, 1, 4};
        System.out.println(Arrays.toString(mergeAndSort(a, b)));
    }
}