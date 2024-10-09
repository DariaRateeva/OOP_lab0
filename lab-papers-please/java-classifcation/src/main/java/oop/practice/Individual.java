package oop.practice;

import java.util.Arrays;

public class Individual {
    private int id;
    private Boolean isHumanoid;
    private String planet;
    private Integer age;
    private String[] traits;

    public Individual(int id, boolean isHumanoid, String planet, int age, String[] traits) {
        this.id = id;
        this.isHumanoid = isHumanoid;
        this.planet = planet;
        this.age = age;
        this.traits = traits;

        //handleNullValues();
    }

//    private void handleNullValues() {
//        if (this.isHumanoid == null) {
//            this.isHumanoid = false; // Default to false if isHumanoid is null
//        }
//        if (this.planet == null || this.planet.isEmpty()) {
//            this.planet = "Earth"; // Default to "Earth" if planet is null or empty
//        }
//        if (this.traits == null) {
//            this.traits = new String[0]; // Default to an empty array if traits are null
//        }
//        if (this.age == null) {
//            this.age = 0; // Default to 0 if age is null
//        }
//    }
    public int getId() {
        return id;
    }

    public boolean isHumanoid() {
        return isHumanoid;
    }

    public String getPlanet() {
        return planet;
    }

    public int getAge() {
        return age;
    }

    public String[] getTraits() {
        return traits;
    }

    public void PrintIndividual(){
        System.out.println("ID: " + id + ", isHumanoid: " + isHumanoid + ", Planet: " + planet + ", Age: " + age + ", Traits:" + Arrays.toString(traits));
    }


}
