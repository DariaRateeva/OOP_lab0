package oop.practice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public List<Individual> readIndividualsFromFile(String filePath) {
        List<Individual> individuals = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode root = objectMapper.readTree(new File(filePath));
            JsonNode dataArray = root.get("data");

            for (JsonNode individualNode : dataArray) {
                int id = individualNode.get("id").asInt();
                boolean isHumanoid = individualNode.has("isHumanoid") ? individualNode.get("isHumanoid").asBoolean() : false;
                String planet = individualNode.has("planet") ? individualNode.get("planet").asText() : "Unknown";
                int age = individualNode.has("age") ? individualNode.get("age").asInt() : 0;

                String[] traits = new String[individualNode.path("traits").size()];
                for (int i = 0; i < traits.length; i++) {
                    traits[i] = individualNode.path("traits").get(i).asText();
                }

                Individual individual = new Individual(id, isHumanoid, planet, age, traits);
                individuals.add(individual);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return individuals;
    }
}
