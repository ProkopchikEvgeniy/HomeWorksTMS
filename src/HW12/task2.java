package HW12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 {
    public static void main(String[] args){
        String exampleString = " 222-222-222 +(29)1234567 4444-2222-11 ghghjdd prokopchik.jenya20163@gmail.com";
        Pattern emailPattern = Pattern.compile("\\b[\\w.]+@[\\w-]+\\.[a-z]{2,8}\\b");
        Matcher emailMatcher = emailPattern.matcher(exampleString);

        Pattern documentPattern = Pattern.compile("\\d{4}-\\d{4}-\\d{2}\\b");
        Matcher documentMatcher = documentPattern.matcher(exampleString);

        Pattern telephoneNumberPattern = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}\\b");
        Matcher telephoneNumberMatcher = telephoneNumberPattern.matcher(exampleString);

        while(telephoneNumberMatcher.find()){
            System.out.println("telephone: "+telephoneNumberMatcher.group());
        }
        while(documentMatcher.find()){
            System.out.println("document: "+documentMatcher.group());
        }
        while(emailMatcher.find()){
            System.out.println("email: "+emailMatcher.group());
        }
    }
}
