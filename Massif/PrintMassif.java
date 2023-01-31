package Massif;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintMassif {

public static void printArray(int[] numbers) {
    StringBuilder st = new StringBuilder();
    if (numbers.length == 0) {
        st.append('[');
    }

    st.append("[");
    for (int a : numbers) {
        st.append(a);
        st.append(", ");


    }
    try {
        st.deleteCharAt(st.length() - 1);
        st.deleteCharAt(st.length() - 1);
    } catch (Exception a) {
    }
    if (numbers.length == 0) {
        st.append("[]");
    } else {
        st.append("]");
    }


    System.out.println(st);

}

    public static void main(String[] args) {
        int abc[] = {};
        printArray(abc);
    }
}