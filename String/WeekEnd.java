package String;

// https://proglang.su/java/packages
//1. boolean isWeekend(String dayName) - метод принимает строку и отвечает, является ли данная строка выходным днем.
// Выходным днем являются Sunday и Saturday.
//
// 2. int weekendCount(String[] days) - метод принимает массив строк и возвращает количество выходных дней в этом массиве.
//
// 3. int weekdayCount(String[] days) - метод принимает массив строк и возвращает количество будних дней в этом массиве.
//
//  Monday Tuesday Wednesday Thursday Friday Saturday Sunday
     public class WeekEnd {
    public static boolean isWeekend(String dayName) {
        return (dayName.contains("Saturday") || dayName.contains("Sunday") ? true : false);
    }

  final   public static int weekendCount(String[] days) {
        int count = 0;
        for (String day : days) {
            if (isWeekend(day)) {
                count++;
            }
        }
        return count;
    }

public static int weekdayCount(String[] days) {
    int count = 0;
    for (String day : days) {
        if (isWeekend(day)) {
        } else {
            count++;
        }
    }
    return count;
}

    public static void main(String[] args) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(isWeekend("Sunday"));
        System.out.println(weekendCount(week));
        System.out.println(weekdayCount(week));
    }
}

