package Condition_Operators;

public class AgeMan {
public static byte getAgeDiff(byte age1, byte age2) {
    byte result = 0;
    if (age1 > age2) {
        result = (byte) (age1 - age2);
    }
    if (age1 < age2) {
        result = (byte) (age2 - age1);

    }
    System.out.println(result);
    return result;
}

    public static void main(String[] args) {
getAgeDiff((byte) 40, (byte) 50);
    }
}