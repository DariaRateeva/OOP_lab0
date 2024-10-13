package oop.practice;

//class that checks if the individual can be classified into the Marvel universe
public class MarvelClasifier {
    public boolean belongsToMarvel(Individual individual) {

        //user should be from Asgard planet or if it doesn't know it's planet
        // it should be humanoid, have age between 0-5000 and have traits like tall and blonde
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
