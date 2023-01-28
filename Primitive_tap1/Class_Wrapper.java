package Primitive_tap1;

public class Class_Wrapper {

    //    Обертка — это специальный класс, который хранит внутри значение примитива.
//
//    Но поскольку это именно класс, он может создавать свои экземпляры.
//    Они будут хранить внутри нужные значения примитивов, при этом будут являться настоящими объектами.
    public static void main(String[] args) {
        int a = 'q';
        float b = 12222222222L;
        System.out.println(a);
        System.out.println(b);
    }
}                                                                                   //            String -> int -
                                                                                    //            int -> long+
                                                                                    //            byte -> char-
                                                                                    //            float -> long-
                                                                                    //            char -> int
                                                                                    //            int -> boolean