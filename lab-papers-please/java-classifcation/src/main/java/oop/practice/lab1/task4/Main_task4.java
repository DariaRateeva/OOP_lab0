package oop.practice.lab1.task4;

import oop.practice.lab1.task2.FileReader;
import oop.practice.lab1.task2.TextData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.annotation.processing.Filer;
import java.io.File;
import java.nio.file.Files;

public class Main_task4 {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Please add at least one file name to the program arguments");
            return;
        }
        for(String filePath : args){
            try{
                String content = new String(Files.readAllBytes(Paths.get(filePath)));

                TextData textData = new TextData(content);
                String fileName = new File(filePath).getName();
                textData.setFileName(fileName);

                System.out.println("File name is: " + textData.getFileName());
                System.out.println(textData.getText());
                System.out.println("Number of vowels equals " + textData.getNumberOfVowels());
                System.out.println("Number of consonants equals " + textData.getNumberOfConsonants());
                System.out.println("Number of letters equals " + textData.getNumberOfLetters());
                System.out.println("Number of sentences equals " + textData.getNumberOfSentences());
                System.out.println("Longest word is: " + textData.getLongestWord());
                System.out.println("------------------------------------------------");
            } catch(IOException e) {
                System.out.println("Error reading file: " + filePath);
                e.printStackTrace();
                }
//
            }
        }

}
