package oop.practice.lab2.task_1;

public class Coffee {
    private Intensity coffeeIntensity;
    protected String name;

    public Coffee(Intensity coffeeIntensity) {
        this.coffeeIntensity = coffeeIntensity;
        this.name = "Coffee ";
    }

    public Coffee(Intensity coffeeIntensity, String name) {
        this.coffeeIntensity = coffeeIntensity;
        this.name = name;
    }


    public Intensity getIntensity() {
        return coffeeIntensity;
    }

    public void setIntensity(Intensity coffeeIntensity) {
        this.coffeeIntensity = coffeeIntensity;
    }

    public String getName() {
        return name;
    }

    public void printCoffeeDetails(){
        System.out.println("Coffee name: " + name);
        System.out.println("Coffee intensity: " + coffeeIntensity);
    }
}
