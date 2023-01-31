package Massif;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {

        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));
        int buffer;
        boolean sort = true;
        while (sort) {
                for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        sort = false;
                        buffer = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = buffer;

                    }
                }


            }
            System.out.println(Arrays.toString(array));

        }
    }
}


//
//if (array[j] > array[j + 1]) {    // мысравниваем один индекс  с индексом плюс 1 если он стал больше то меняем местами
//        buffer = array[j]; // положить текущий элемент        // чтобы поменять их местами нужно создать переменную
//        array[j] = array[j + 1]; // далее положить след элемент
//        array[j + 1] = buffer; //  вернуть назад в буфер
//        }




