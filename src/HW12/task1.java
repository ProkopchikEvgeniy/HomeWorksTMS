package HW12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1 {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("\\b[A-ZА-Я]{2,6}\\b", Pattern.UNICODE_CHARACTER_CLASS);
        String exampleString = "ОАО REST ЗЗЗЗЗЗЗ выолфвардфыолвра аов вовоово ";
        Matcher matcher = pattern.matcher(exampleString);

        while (matcher.find()) {
            System.out.println("Найдено: " + matcher.group());
        }
    }
}
