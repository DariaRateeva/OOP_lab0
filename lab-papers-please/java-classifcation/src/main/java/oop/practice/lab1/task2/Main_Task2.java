package oop.practice.lab1.task2;

import java.io.File;

public class Main_Task2 {
    public static void main(String[] args) {
        if (args.length > 0) {
            String filePath = args[0];
            FileReader fileReader = new FileReader();
            String content = fileReader.readFileIntoString(filePath);
            String fileName = new File(filePath).getName();
            TextData textData = new TextData(content);
            textData.setFileName(fileName);
            System.out.println("File name is: " + textData.getFileName());
            System.out.println(textData.getText());
            System.out.println("Number of vowels equals " + textData.getNumberOfVowels());
            System.out.println("Number of consonants equals " + textData.getNumberOfConsonants());
            System.out.println("Number of letters equals " + textData.getNumberOfLetters());
            System.out.println("Number of sentences equals " + textData.getNumberOfSentences());
            System.out.println("Longest word is: " + textData.getLongestWord());

        } else {
            System.out.println("No file path provided in arguments. Please enter a file path to see the result");
        }
    }
}
