package oop.practice;


public class Main {
  public static void main(String[] args) {
    String[] traits = {"BLONDE, TALL"};

    Individual individual = new Individual(0, true, "Asgard", 2034, traits);
//    System.out.println("ID: " + individual.getId());
//    System.out.println("isHumanoid: " + individual.isHumanoid());
//    System.out.println("Planet: " + individual.getPlanet());
//    System.out.println("Age: " + individual.getAge());
//    System.out.println("Traits: " + String.join(", ", individual.getTraits()));

    individual.PrintIndividual();

    Individual partialDataIndividual = new Individual(1, false, null, 100, null);
    partialDataIndividual.PrintIndividual();

    Individual minimalDataIndividual = new Individual(2, true, null, 300, null);
    minimalDataIndividual.PrintIndividual();  }
}
