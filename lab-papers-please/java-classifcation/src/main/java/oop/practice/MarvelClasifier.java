package oop.practice;

public class MarvelClasifier {
    public boolean belongsToMarvel(Individual individual) {
        if("Asgard".equals(individual.getPlanet())){
            return true;
        }
        if(individual.getPlanet().equals("Unknown") && individual.isHumanoid()){
            if(individual.getAge() >= 0 && individual.getAge() <= 5000){
                if(individual.hasTrait("TALL") || individual.hasTrait("BLONDE") ){
                    return true;
                }
            }
        }

        return false;
    }
}
