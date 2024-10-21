package oop.practice;

import java.util.Arrays;

//class individual that contains a constructor for individual initialization
// with parameters id, isHumanoid, planet, age and traits
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
    }

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

    public boolean hasTrait(String trait){
        for (String t : traits){
            if(t.equals(trait)){
                return true;
            }
        }
        return false;
    }

}
