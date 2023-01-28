package Condition_Operators;


public class TypeConversion { // преобразование типов
public static char charExpression(int a) {

    char[] unicode = Character.toChars(a + '\\');

    return unicode[0];
}



    public static void main(String[] args) {
        int a = 2522;
        byte b = (byte) a; // преобразование типов конвертировать при помощи скобок
        // в данном примере потеря данных при преоброзовании
        charExpression(10);
//            float c = a;
//            System.out.println(c);
//            double d = 4.4 + a;
//            System.out.println(d);
    }
}




