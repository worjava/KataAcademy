package Primitive_tap1;

import java.math.BigInteger;

public class longBigInteger {
// квадрта макс лонга число в бигинтеджер

    public static void maxLongSqr() {
        BigInteger big = new BigInteger(String.valueOf(Long.MAX_VALUE));

        System.out.println(big.pow(2));
    }


    public static void main(String[] args) {
        maxLongSqr();

    }
}