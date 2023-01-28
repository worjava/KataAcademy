package Primitive_tap1;

import java.sql.Array;
import java.util.Arrays;

public class Test2 {
    public static boolean isPowerOfTwo(int value) {
    value = Math.abs(value);

        return Integer.bitCount(Math.abs(value)) == 1 ;

    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(65));
    }
}