package Massif;

import java.util.Arrays;

public class GetCentreArray {

public static int[] getArrayMiddle(int[] numbers) {
    int divider = numbers.length / 2;
    if (numbers.length % 2 == 0 && numbers.length != 0) {
        return new int[]{numbers[divider - 1], numbers[divider]};
    } else if (numbers.length == 0) {
        return new int[]{};


    } else {
        return new int[]{numbers[divider]};
    }


}

public static void main(String[] args) {
    int b[] = {};
    System.out.println(Arrays.toString(getArrayMiddle(b)));

}
}