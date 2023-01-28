package Other;

public class Max {
    static void maxIndex(int[] array) {
        int totalAll = 0;

        for (int i = 0; i < array.length; i++) {
           totalAll+=array[i];
            }


        System.out.println(totalAll);

//


    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 78, 8, 9, 110, 115};
        maxIndex(array);
    }

}



//
//static void maxIndex(int[] array) {
//        int min = 0;
//
//        for (int i = 0; i < array.length; i++) {
//        if(array[i] >min){
//        min=array[i];
//        }
//
//        }
//        System.out.println(min);
