package oop.practice;

//class that checks if the individual can be classified into the Hitchhiker's universe
public class HitchhikersClasifier {
    public boolean belongsToHitchhikers(Individual individual) {

        //user should be from Betelgeuse or Vogsphere planet or if it doesn't know it's planet it should have age range
        //between 0-100 or 0-200, and have traits like, extra arm, extra head, green and bulky, also if
        //the individual it's bulky it should also not be humanoid
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
