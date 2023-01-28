package Condition_Operators;

public class IfSwitchII {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        System.out.println(a & b); // логическое умножение умножение поразрядно

        //  Также эту операцию называют XOR, нередко ее применяют для простого шифрования:

        int number = 45; // 1001 Значение, которое надо зашифровать - в двоичной форме 101101

        int key = 102; //Ключ шифрования - в двоичной системе 1100110

        int encrypt = number ^ key; //Результатом будет число 1001011 или 75

        System.out.println("Зашифрованное число: " + encrypt);


        int decrypt = encrypt ^ key; // Результатом будет исходное число 45

        System.out.println("Расшифрованное число: " + decrypt);

    }
    }

