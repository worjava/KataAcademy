package Condition_Operators;

import java.math.BigInteger;

import static java.lang.Integer.parseInt;

public class Factorial {

    // факторила 3! = 1*2*3... . 0! = 1 ; 2! = 2

public static BigInteger factorial(int value) {

    BigInteger big = BigInteger.valueOf(1); // создаем переменную 1 биг интеджер
    for (int i = 1; i < value + 1; i++) { // в цикле создаем 1 для factorial 0 и единицу для корректной работы
        big = big.multiply(BigInteger.valueOf(i)); // используем метод умножения мульиплей
    }

    return big;
    }



public static void main(String[] args) {
    System.out.println(factorial(3));
}

}
