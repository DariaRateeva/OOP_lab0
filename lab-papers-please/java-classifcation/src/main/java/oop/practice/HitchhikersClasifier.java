package oop.practice;

public class HitchhikersClasifier {
    public boolean belongsToHitchhikers(Individual individual) {

        if ("Betelgeuse".equals(individual.getPlanet()) || "Vogsphere".equals(individual.getPlanet())) {
            return true;
        }

        if (individual.getPlanet().equals("Unknown")) {
            if ((individual.getAge() >= 0 && individual.getAge() <= 100) ||
                    (individual.getAge() >= 0 && individual.getAge() <= 200)) {
                if (individual.hasTrait("EXTRA_ARMS") || individual.hasTrait("EXTRA_HEAD") || individual.hasTrait("GREEN")
                || (individual.hasTrait("BULKY")) && !individual.isHumanoid()) {
                   return true;
                }
            }
        }
        return false;
    }
}
