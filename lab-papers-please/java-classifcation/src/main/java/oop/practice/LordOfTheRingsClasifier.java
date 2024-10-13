package oop.practice;

//class that checks if the individual can be classified into the Lord of the Rings universe
public class LordOfTheRingsClasifier {
    public boolean belongsToLordOfTheRings(Individual individual) {

        //user should be from Earth planet or have age greater than 5000 or if it doesn't know it's planet
        // it should be humanoid and have traits like,pointy ears, blonde, short and bulky
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
