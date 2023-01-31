package Massif;

import java.util.Arrays;

public class ReversMassif {
public static int[] inverseArray(int[] numbers) {

    int[] reversed = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
        reversed[i] = numbers[numbers.length - i - 1];
    }
    return reversed;
}


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        System.out.println(Arrays.toString(inverseArray(a)));
    }
}