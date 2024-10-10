package oop.practice;

import java.util.Arrays;

public class Individual {
    private int id;
    private Boolean isHumanoid;
    private String planet;
    private Integer age;
    private String[] traits;
    private String universe;

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

    public void PrintIndividual(){
        System.out.println("ID: " + id + ", isHumanoid: " + isHumanoid + ", Planet: " + planet + ", Age: " + age + ", Traits:" + Arrays.toString(traits));
    }

    public String getUniverse() {
        return universe;
    }
    public void setUniverse(String universe) {
        this.universe = universe;
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
