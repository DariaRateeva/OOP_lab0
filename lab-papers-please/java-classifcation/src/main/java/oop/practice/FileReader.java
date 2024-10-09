package oop.practice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public void parseAndPrintJson(String filePath) {
        try {
            File inputFile = new File(filePath);
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonData = objectMapper.readTree(inputFile);

            JsonNode dataArray = jsonData.get("data");

            if (dataArray.isArray()) {
                for (JsonNode individualNode : dataArray) {
                    int id = individualNode.get("id").asInt();
                    boolean isHumanoid = individualNode.has("isHumanoid") ? individualNode.get("isHumanoid").asBoolean() : false;
                    String planet = individualNode.has("planet") ? individualNode.get("planet").asText() : "Earth";
                    int age = individualNode.has("age") ? individualNode.get("age").asInt() : 0;

                    // Handle traits without a List
                    String[] traits = new String[individualNode.path("traits").size()];
                    for (int i = 0; i < traits.length; i++) {
                        traits[i] = individualNode.path("traits").get(i).asText();
                    }

                    // Create an Individual object
                    Individual individual = new Individual(id, isHumanoid, planet, age, traits);

                    // Print the individual directly
                    individual.PrintIndividual();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
