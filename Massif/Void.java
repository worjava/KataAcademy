package Massif;

public class Void {
    //  вывода должен перевести курсор на новую строку.
// Пример ввода: [3,5,20,8,7,3,100]
// Пример вывода: 3,5,7,3
public static void printOddNumbers(int[] arr) {

    StringBuilder st = new StringBuilder();
    int a = st.length() - 1;
    for (int j = 0; j < arr.length ; j++) {
        if (arr[j] % 2 != 0 && arr[j] != 0) {

            st.append(arr[j] + ",");

        }
    }
    System.out.println(st);

}

    public static void main(String[] args) {
        int[] a = {1,2,3,5,15,1515,14151,-256,121,-1514,-7,-8,-9,-17,31,57,25,547};
        printOddNumbers(a);
    }

}


