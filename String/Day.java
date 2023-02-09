package String;

//Enum должен иметь название Day
//Enum должен содеражить элементы на каждый день недели
//сигнатура метода isWeekend()
//метод isWeekend возвращает boolean
//сигнатура метода getRusName()
//метод getRusName возвращает String
public enum Day {

MONDAY("Понедельник"),
TUESDAY("Вторник"),
WEDNESDAY("Среда"),
THURSDAY("Четврег"),
FRIDAY("Пятница"),
SATURDAY("Суббота"),
SUNDAY(
        "Воскресенье");


public String dayWeek;


public String getRusName() {
    return dayWeek;
}

public boolean isWeekend() {

    return getRusName().equals(SUNDAY.dayWeek) || getRusName().equals(SATURDAY.dayWeek) ? true : false;
}


Day(String dayWeek) {
    this.dayWeek = dayWeek;


}
}

class Test {


    public static void main(String[] args) {
        Day day = Day.WEDNESDAY;
        System.out.println(Day.MONDAY.isWeekend());
        System.out.println(Day.SATURDAY.isWeekend());
        System.out.println(Day.FRIDAY.getRusName());

    }
}