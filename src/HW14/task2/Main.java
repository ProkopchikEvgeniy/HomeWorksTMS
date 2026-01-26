package HW14.task2;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File catalog = new File("src/HW14/task2");
//        File inputFile = new File(catalog, "documents.txt");
        File validFile = new File(catalog, "validDocuments.txt");
        File invalidFile = new File(catalog, "invalidDocuments.txt");

        Pattern docnumPattern = Pattern.compile("^docnum[a-zA-Z1-9]{9}$");
        Pattern contractPattern = Pattern.compile("^contract[a-zA-Z1-9]{7}$");
        System.out.println("Введите путь к файлу:");
        String inputFile = in.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter validWriter = new BufferedWriter(new FileWriter(validFile));
             BufferedWriter invalidWriter = new BufferedWriter(new FileWriter(invalidFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                if (docnumPattern.matcher(line).matches() || contractPattern.matcher(line).matches()) {
                    validWriter.write(line);
                    validWriter.newLine();
                } else {
                    invalidWriter.write(line + reason(line));
                    invalidWriter.newLine();
                }
            }

            System.out.println("Валидные документы сохранены в: " + validFile.getPath());
            System.out.println("Невалидные документы сохранены в: " + invalidFile.getPath());

        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
    public static String reason(String line){
        if(line.length()!=15){
            return " Некорректная длина";
        } else if (!line.startsWith("docnum") || !line.startsWith("contract")) {
            return " Неверное начало документа";
        }
        else {
            return " Неверная вторая часть";
        }
    }
}