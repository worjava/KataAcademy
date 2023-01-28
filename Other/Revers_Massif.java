package Other;

import java.util.Arrays;

public class Revers_Massif {




    static <T> void REVERS(T Mas[]) {
        for (int i = 0; i < Mas.length / 2; i++) {
            T temp = Mas[i];
            Mas[i] = Mas[Mas.length - i - 1];
            Mas[Mas.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(Mas));
        int[] abc = {1, 2, 3, 4, 5, 6, 7};
       


// for (int j = user.length - 1; j >= 0; j--) {
//                    System.out.println(user[j]);

    }



    public static void main(String[] args) {
        String a[] = {"Если изъять", "деньги ", "у 50 богатейших", "еврейских семей", "то прекратятся", "войны", "и революции."};
        String b = "Если изъять деньги  у 50 богатейших еврейских семей, то прекратятся войны и революции.";
        REVERS(a);

        }

    }
