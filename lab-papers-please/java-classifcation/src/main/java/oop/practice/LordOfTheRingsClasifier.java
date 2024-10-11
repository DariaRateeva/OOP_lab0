package oop.practice;

public class LordOfTheRingsClasifier {
    public boolean belongsToLordOfTheRings(Individual individual) {

        if ("Earth".equals(individual.getPlanet())) {
            return true;
        }
        if(individual.getAge() > 5000){
            return true;
        }
        if (individual.getPlanet().equals("Unknown")) {
            if (individual.isHumanoid()) {
                if (individual.hasTrait("POINTY_EARS") || individual.hasTrait("BLONDE")
                        || individual.hasTrait("SHORT") || individual.hasTrait("BULKY")){
                    return true;
                }
            }
        }
        return false;
    }
}
