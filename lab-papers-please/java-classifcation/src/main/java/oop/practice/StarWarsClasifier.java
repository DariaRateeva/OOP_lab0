package oop.practice;

//class that checks if the individual can be classified into the Star Wars universe
public class StarWarsClasifier {
    public boolean belongsToStarWars(Individual individual) {

        //user should be from Kashyyyk or Endor planet or if it doesn't know it's planet
        // it should not be humanoid, have age between 0-60 or between 0-400
        // and have traits like tall, short, hairy
        if ("Kashyyyk".equals(individual.getPlanet()) || "Endor".equals(individual.getPlanet())) {
            return true;
        }

        if (individual.getPlanet().equals("Unknown") && !individual.isHumanoid()) {
            if ((individual.getAge() >= 0 && individual.getAge() <= 60) ||
                    (individual.getAge() >= 0 && individual.getAge() <= 400)) {
                if (individual.hasTrait("HAIRY")) {
                    if (individual.hasTrait("TALL") || individual.hasTrait("SHORT")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
