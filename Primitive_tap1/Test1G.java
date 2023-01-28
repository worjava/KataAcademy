package Primitive_tap1;

import java.util.Arrays;
import java.util.Scanner;

public class Test1G {
    public static void main(String[] args) {


      /*  Тебе нужно написать программу, которая:

        Считывает с консоли целое число N.
        Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
                Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
                Каждое число выводить с новой строки. Число N выводить не нужно.*/
        Scanner console = new Scanner(System.in);
        int numberN = console.nextInt();
        int a = 0;
        int[] MASSIF = new int[numberN];
        if (numberN > 0 && numberN%2==0) {
            for (int i = 0; i < MASSIF.length; i++) {
                MASSIF[i] = i;
            }
        } else {
            for (int i = 0; i < MASSIF.length; i++) {
                MASSIF[i] = i;
        }
            for (int i = 0; i <MASSIF.length/2 ; i++) {
                int temp = MASSIF[i];
                MASSIF[i]=MASSIF[MASSIF.length -i - 1];
                MASSIF[MASSIF.length-i-1]=temp;
            }


       for (int num: MASSIF){
           System.out.println(num);
       }
        }


    }
}


