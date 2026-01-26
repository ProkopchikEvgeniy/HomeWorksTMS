package HW14.task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class task1 {
    public static void main(String[] args) {
        File catalog = new File("src/HW14/task1");
        File file = new File(catalog,"text.txt");
        try(FileInputStream fis = new FileInputStream(file)){
            StringBuilder sb = new StringBuilder();
            String longestWord = "";
            int i;
            while( (i=fis.read()) != -1){
                char ch = (char) i;
                if(!Character.isLetterOrDigit(ch) || ch =='-'){
                    if(longestWord.length()<sb.length()){
                        longestWord = sb.toString();
                    }
                    sb.setLength(0);
                    continue;
                }
                sb.append(ch);
            }
            if(sb.length() > 0 && sb.length() > longestWord.length()) {
                longestWord = sb.toString();
            }
            if(!longestWord.isEmpty()){
                System.out.println("Самое длинное слово: " + longestWord);
                System.out.println("Длина: " + longestWord.length());
            }
            else {
                System.out.println("В файле нет слов!");
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
