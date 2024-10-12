package oop.practice;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class View {
    private ObjectMapper objectMapper;
    public View(){
        this.objectMapper = new ObjectMapper();
    }
    public void writeToFiles(String universeName, List<Individual> individuals){
        try{
            File directory = new File("output");
            if(!directory.exists()){
                directory.mkdir();
            }
            FileWriter fileWriter = new FileWriter("output/"+universeName+".json");
            objectMapper.writeValue(fileWriter, individuals);
            System.out.println("File written for " + universeName + " with " + individuals.size() + " individuals");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
