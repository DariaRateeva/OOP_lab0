package oop.practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileReader {
    public static void main(String[] args) {
        try{
            File inputFile = new File("src/main/resources/input.json");
            String content = new String(Files.readAllBytes(inputFile.toPath()));
            System.out.println(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
