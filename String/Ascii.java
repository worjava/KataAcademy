package String;

import java.util.Arrays;

public class Ascii {
//Напишите статический класс AsciiCharSequence, реализующий компактное хранение последовательности
// ASCII-символов (их коды влезают в один байт) в массиве байт. 128 символов
// По сравнению с классом String из Java 8, хранящим каждый символ как char, AsciiCharSequence будет занимать в два раза меньше памяти
//Класс AsciiCharSequence должен:
//
//реализовывать интерфейс java.lang.CharSequence;
//иметь конструктор, принимающий массив байт;
//определять методы length(), charAt(), subSequence() и toString()
//
//Сигнатуры методов и ожидания по их поведению смотрите в описании интерфейса java.lang.CharSequence (JavaDoc или исходники).
//
//В данном задании методам charAt() и subSequence() всегда будут подаваться корректные входные параметры,
// поэтому их проверкой и обработкой ошибок заниматься не нужно. Тем более мы еще не проходили исключения.

public static class AsciiCharSequence implements CharSequence {

  private   byte a[];

    public AsciiCharSequence(byte[] a) {
        this.a = a;
    }

    @Override
    public int length() {
        return a.length;
    }

    @Override
    public char charAt(int index) {
        return (char) (a[index]);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(a, start, end));
    }

    @Override
    public String toString() {
        return new String(a);

    }
}


    public static void main(String[] args) {
        byte fff []= {1,23,45,6,76,76,};

        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(fff);
        System.out.println( asciiCharSequence.toString());
        System.out.println(asciiCharSequence.subSequence(4,4));
    }
}
