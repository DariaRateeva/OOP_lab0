package oop.practice;

public class Classifier {

    public String classify(Individual individual) {
        if (!individual.isHumanoid() && "Kashyyyk".equals(individual.getPlanet()) && individual.getAge() <= 400 && individual.hasTrait("HAIRY") && individual.hasTrait("TALL")) {
            return "Star Wars";
        } else if (!individual.isHumanoid() && "Endor".equals(individual.getPlanet()) && individual.getAge() <= 60 && (individual.hasTrait("SHORT") || individual.hasTrait("HAIRY"))) {
            return "Star Wars";
        } else if (individual.isHumanoid() && "Asgard".equals(individual.getPlanet()) && individual.getAge() <= 5000 && (individual.hasTrait("BLONDE") || individual.hasTrait("TALL"))) {
            return "Marvel";
        } else if (individual.isHumanoid() && "Betelgeuse".equals(individual.getPlanet()) && individual.getAge() <= 100 && (individual.hasTrait("EXTRA_ARMS") || individual.hasTrait("EXTRA_HEAD"))) {
            return "Hitchhiker's";
        } else if (!individual.isHumanoid() && "Vogsphere".equals(individual.getPlanet()) && individual.getAge() <= 200 && (individual.hasTrait("GREEN") || individual.hasTrait("BULKY"))) {
            return "Hitchhiker's";
        } else if (individual.isHumanoid() && "Earth".equals(individual.getPlanet()) && individual.hasTrait("BLONDE") && individual.hasTrait("POINTY_EARS")) {
            return "Lord of the Rings";
        } else if (individual.isHumanoid() && "Earth".equals(individual.getPlanet()) && individual.getAge() <= 200 && (individual.hasTrait("SHORT") || individual.hasTrait("BULKY"))) {
            return "Lord of the Rings";
        } else if (individual.isHumanoid() && "Earth".equals(individual.getPlanet())) {
            return "Lord of the Rings";
        } else {
            return "Unknown";  // Fallback case for individuals that don't match any known universe
        }
    }
}
