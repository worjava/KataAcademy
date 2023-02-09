package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
public class Mail {
public static boolean isGmailOrOutlook(String email) {
    Pattern search = Pattern.compile("^[a-zA-Z0-9]+@(gmail|outlook)\\.com$");
    Matcher matcher = search.matcher(email);

    return matcher.find();
}

public static void main(String[] args) {
    System.out.println(isGmailOrOutlook("k1at@mail.com"));
}
}
