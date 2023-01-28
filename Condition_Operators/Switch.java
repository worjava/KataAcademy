package Condition_Operators;

public class Switch {
    //"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday".
public static String checkWeekend(String weekday) {
    String result = null;

    String a = weekday.contains("Monday") || weekday.contains("Tuesday") || weekday.contains("Wednesday")
            || weekday.contains("Thursday") || weekday.contains("Friday") ? result = "Надо еще поработать" : result;

    String b = weekday.contains("Saturday") || weekday.contains("Sunday") ? result = "Ура, выходной!" : result;


    return result;
}


    public static void main(String[] args) {
        System.out.println(checkWeekend("Friday"));
    }
}


//    boolean result;
//    switch (weekday) {
//        case "Saturday":
//        case "Sunday":
//            result = true;
//            break;
//        case "Friday":
//
//        case "Monday":
//        case "Tuesday":
//        case "Wednesday":
//        case "Thursday":
//        default:
//            result = false;
//            break;
//    }
//    return result;
//}

//
//    boolean result;
//    if (weekday.equals("Monday") || weekday.equals("Tuesday") || weekday.equals("Wednesday")
//            || weekday.equals("Thursday") || (weekday.equals("Friday"))) {
//            result = false;
//            } else if (weekday.equals("Saturday") || (weekday.equals("Sunday"))) {
//            result = true;
//            } else {
//            result = false;
//
//            }
//
//            return result;
//            }
