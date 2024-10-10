package oop.practice;

import java.util.List;

public class Main {
  public static void main(String[] args) {

    FileReader fileReader = new FileReader();
    List<Individual> individuals = fileReader.readIndividualsFromFile("src/main/resources/input.json");

    System.out.println("Individuals with even id: ");
    for (Individual individual : individuals) {
      if(individual.getId()%2 == 0) {
        individual.PrintIndividual();
      }
    }

    System.out.println("Just humanoids");
    for (Individual individual : individuals) {
      if(individual.isHumanoid()) {
        individual.PrintIndividual();
      }
    }

    Classifier classifier = new Classifier();

    for (Individual individual : individuals) {
      String universe = classifier.classify(individual);
      individual.setUniverse(universe);
      System.out.println("ID: " + individual.getId() + ", Universe: " + individual.getUniverse());  // Should print the universe
    }
  }
}
