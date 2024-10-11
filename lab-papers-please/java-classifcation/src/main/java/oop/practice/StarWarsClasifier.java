package oop.practice;

public class StarWarsClasifier {
    public boolean belongsToStarWars(Individual individual) {

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
