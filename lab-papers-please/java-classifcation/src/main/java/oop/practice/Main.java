package oop.practice;

import java.util.List;

public class Main {
  public static void main(String[] args) {

    FileReader fileReader = new FileReader();
    List<Individual> individuals = fileReader.readIndividualsFromFile("src/main/resources/input.json");

    StarWarsClasifier starWarsClasifier = new StarWarsClasifier();
    MarvelClasifier marvelClasifier = new MarvelClasifier();
    HitchhikersClasifier hitchhikersClassifier = new HitchhikersClasifier();
    LordOfTheRingsClasifier lordOfTheRingsClassifier = new LordOfTheRingsClasifier();

    for(Individual individual : individuals){
      if(starWarsClasifier.belongsToStarWars(individual)) {
        System.out.println("ID: " + individual.getId() + " belongs to Star Wars");
      } else if (marvelClasifier.belongsToMarvel(individual)) {
        System.out.println("ID: " + individual.getId() + " belongs to Marvel");
      }else if (hitchhikersClassifier.belongsToHitchhikers(individual)) {
        System.out.println("ID: " + individual.getId() + " belongs to Hitchhiker's");
      }
      else if (lordOfTheRingsClassifier.belongsToLordOfTheRings(individual)) {
        System.out.println("ID: " + individual.getId() + " belongs to Lord of The Rings");
      }
      else{
        System.out.println("ID: " + individual.getId() + " does not belong ");
      }

    }


  }
}
