package Primitive_tap1;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import static java.math.BigDecimal.valueOf;

public class Test1 {
    public double priceCalculation(double price, int count) {
        return price * count;

    }

    public static boolean doubleExpression(double a, double b, double c) {

        return (Math.abs(a + b - c) > 0.0001);


    }

    public static void main(String[] args) {


        // 8 примитивных типов
        byte var = 15;                       // от -128 до 127
        short vari = 30000;                            //-37768 до 32767
        long varin = 9223372036854775807l;
        char varian = 'c';                             //65.538           кодировка Unicode ( 0 do 65537)
        float f = 1.14f;
        double varim = 2.16;
        boolean variableName = true;


    }
}