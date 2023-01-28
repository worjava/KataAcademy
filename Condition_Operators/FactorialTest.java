package Condition_Operators;

import java.math.BigInteger;

public class FactorialTest {
    public static BigInteger factorial(int value) {
        BigInteger big = BigInteger.valueOf(1); // создаем переменную 1 биг интеджер
      if(value <= 0){
          return big;
      }
      return BigInteger.valueOf(value).multiply(factorial(value-1)); // возвращаем значение
        // big int через мульти плей переменноый метода
        }

    public static void main(String[] args) {
        System.out.println(  factorial(3));
    }
    }

