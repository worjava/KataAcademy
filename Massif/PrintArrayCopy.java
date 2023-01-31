package Massif;

import java.util.Arrays;

public class PrintArrayCopy {
public static int[] getArrayMiddle(int[] numbers) {


    if (numbers.length % 2 == 0 && numbers.length != 0) {
        return Arrays.copyOfRange(numbers, numbers.length / 2 - 1, numbers.length / 2 + 1);
    } else if (numbers.length % 2 != 0) {
        return Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length / 2 + 1);
    } else {
        return new int[]{};
    }

    }

        public static void main (String[]args){
            int a[] = {};
            System.out.println(Arrays.toString(getArrayMiddle(a)));
            ;
        }
    }