package String;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//"[^a-zA-Z0-9]\"]"
public class Palindrome {
public static boolean isPalindrome(String text) {
    StringBuilder st = new StringBuilder();
    String a = text.replaceAll("[^A-Za-zА-Яа-я0-9]", "").toLowerCase();
    st.append(a);
    return new Boolean(a.equalsIgnoreCase(st.reverse().toString()));
}

    public static void main(String[] args) {
        String a = "Was it a cat I saw";
        System.out.println(isPalindrome(a));
    }
}
