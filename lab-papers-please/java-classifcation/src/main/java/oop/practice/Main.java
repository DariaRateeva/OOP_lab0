package oop.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) {

    FileReader fileReader = new FileReader();
    List<Individual> individuals = fileReader.readIndividualsFromFile("src/main/resources/input.json");

    if (individuals == null || individuals.isEmpty()) {
      System.out.println("No individuals found in the input file.");
      return;
    }

    Map<String, List<Individual>> classifiedIndividuals = classifyIndividuals(individuals);

    if (classifiedIndividuals == null) {
      System.out.println("Classification failed. No classified individuals.");
      return;
    }

    View view = new View();

    for (Map.Entry<String, List<Individual>> entry : classifiedIndividuals.entrySet()) {
      String universeName = entry.getKey();
      List<Individual> individualsInUniverse = entry.getValue();

      view.writeToFiles(universeName, individualsInUniverse);
    }
  }

  private static Map<String, List<Individual>> classifyIndividuals(List<Individual> individuals) {
    // Instantiate your classifiers and add classification logic here
    StarWarsClasifier starWarsClasifier = new StarWarsClasifier();
    MarvelClasifier marvelClasifier = new MarvelClasifier();
    HitchhikersClasifier hitchhikersClassifier = new HitchhikersClasifier();
    LordOfTheRingsClasifier lordOfTheRingsClassifier = new LordOfTheRingsClasifier();

    Map<String, List<Individual>> classifiedIndividuals = new HashMap<>();


    classifiedIndividuals.put("StarWars", new ArrayList<>());
    classifiedIndividuals.put("Marvel", new ArrayList<>());
    classifiedIndividuals.put("Hitchhikers", new ArrayList<>());
    classifiedIndividuals.put("LordOfTheRings", new ArrayList<>());

    // Classify each individual
    for (Individual individual : individuals) {
      if (starWarsClasifier.belongsToStarWars(individual)) {
        classifiedIndividuals.get("StarWars").add(individual);
      } else if (marvelClasifier.belongsToMarvel(individual)) {
        classifiedIndividuals.get("Marvel").add(individual);
      } else if (hitchhikersClassifier.belongsToHitchhikers(individual)) {
        classifiedIndividuals.get("Hitchhikers").add(individual);
      } else if (lordOfTheRingsClassifier.belongsToLordOfTheRings(individual)) {
        classifiedIndividuals.get("LordOfTheRings").add(individual);
      } else {
        System.out.println("Individual with ID " + individual.getId() + " doesn't belong to any known universe.");
      }
    }

    return classifiedIndividuals;
  }
}
