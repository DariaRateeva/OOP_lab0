package oop.practice;

import java.util.List;

public class Main {
  public static void main(String[] args) {
//    String[] traits = {"BLONDE, TALL"};
//
//    Individual individual = new Individual(0, true, "Asgard", 2034, traits);
//    individual.PrintIndividual();
//
//    Individual partialDataIndividual = new Individual(1, false, null, 100, null);
//    partialDataIndividual.PrintIndividual();
//
//    Individual minimalDataIndividual = new Individual(2, true, null, 300, null);
//    minimalDataIndividual.PrintIndividual();

    FileReader fileReader = new FileReader();
    fileReader.parseAndPrintJson("src/main/resources/input.json");

  }
}
