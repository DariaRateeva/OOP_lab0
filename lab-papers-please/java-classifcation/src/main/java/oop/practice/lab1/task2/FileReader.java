package oop.practice.lab1.task2;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;

public class FileReader {
    public String readFileIntoString(String path) {
        try{
            return Files.readString(Path.of(path));
        } catch(IOException e)  {
            System.out.println("Error: " + e.getMessage());
            return "";
        }
    }
}
