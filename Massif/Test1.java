package Massif;

import java.util.Arrays;

public class Test1 {
public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
    int[] merge = new int[firstArray.length + secondArray.length];

    for (int j = 0; j < firstArray.length; j++) {
        merge[j] = firstArray[j];
    }
    for (int i = 0; i < secondArray.length; i++) {
        merge[i + firstArray.length] = secondArray[i];

    }

    for (int i = 0; i < merge.length; i++) {
        int buffer;
        for (int j = 0; j < merge.length - 1; j++) {
            if (merge[j] > merge[j + 1]) {
                buffer = merge[j];
                merge[j] = merge[j + 1];
                merge[j + 1] = buffer;
            }
        }


    }
    return merge;
}
//Arrays являются   частью коллекции Java Collection Framwor
    public static void main(String[] args) {
        int[] a = {1, 4, 3, 6, 7, 0, 2, 3, 4, 5, 6, 7, 8, 10, 15, 2, 0, 1, 6, 5};
        int[] b = {0, 5, 8, 10, 9};

        System.out.println(Arrays.toString(mergeAndSort(a, b)));
    }


    private double[] concatArray(double[] a, double[] b) {  // сложить два массива
        if (a == null)
            return b;
        if (b == null)
            return a;
        double[] r = new double[a.length + b.length];
        System.arraycopy(a, 0, r, 0, a.length);
        System.arraycopy(b, 0, r, a.length, b.length);
        return r;
    }}
//}private double[] copyPartArray(double[] a, int start) { //взять часть массива
//    if (a == null)
//        return null;
//    if (start > a.length)
//        return null;
//    double[] r = new double[a.length - start];
//    System.arraycopy(a, start, r, 0, a.length - start);
//    return r;
//}
//https://developer.alexanderklimov.ru/android/java/array.php#arrays:~:text=%D0%9F%D0%BE%D0%BB%D0%B5%D0%B7%D0%BD%D1%8B%D0%B5%20%D1%80%D0%B5%D1%81%D1%83%D1%80%D1%81%D1%8B-,%D0%9C%D0%B0%D1%81%D1%81%D0%B8%D0%B2,%D0%9A%D0%BB%D0%B0%D1%81%D1%81%20Arrays,-%D0%9A%D0%BB%D0%B0%D1%81%D1%81%20java.util
////    public void onClick(View v) {
////        double[] digits = new double[] {6.5, 3.1, 5.72};
////        double[] part = copyPartArray(digits, 1);
////        Toast.makeText(v.getContext(), part[1] + "", Toast.LENGTH_LONG).show();
////    }