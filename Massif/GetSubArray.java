package Massif;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetSubArray {   //Пример ввода: {1,3,5,6,9,11,24}, 4, 10  Пример вывода: [5, 6, 9]
public static int[] getSubArrayBetween(int[] numbers, int start, int end) {

    int counter = 0;

    for (int i = 0; i < numbers.length; i++) {
        if (start <= numbers[i] && end >= numbers[i]) {
            counter++;
        }
    }

    int[] array = new int[counter];

    for (int i = 0; i < numbers.length; i++) {
        if (start <= numbers[i] && end >= numbers[i]) {
            for (int j = 0; j < array.length; j++) {
                array[j] = numbers[i++];


            }


        }

    }
    return array;
}

    public static void main(String[] args) {

        int[] a = {1,3,5,6,9,11,2};
        System.out.println(Arrays.toString(getSubArrayBetween(a, 4, 10)));
    }
}