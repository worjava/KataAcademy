package Condition_Operators;

public class SpotCentre {
public int determineGroup(int age) {
    int result = 0;
    int premier = 1; // группа  от 7 до 13
    int second = 2;  // от 14  до 17
    int adult = 3;  // 18 до 65

    if (age >= 7 && age <= 13) {
        result = premier;
    } else if (age >= 14 && age <= 17) {
        result = second;
    } else if (age >= 18 && age <= 65) {
        result = adult;
    } else {
        result = -1;
    }

    return result;
}

    public static void main(String[] args) {
        SpotCentre spot = new SpotCentre();
        System.out.println( spot.determineGroup(66));
    }

}
