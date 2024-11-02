package oop.practice.lab2.task_1;

public class Cappuccino extends Coffee {
    private int mlOfMilk;


    public Cappuccino(Intensity coffeeIntensity,int mlOfMilk) {
        super(coffeeIntensity, "Cappuccino");
        this.mlOfMilk = mlOfMilk;
    }

    public Cappuccino(Intensity coffeeIntensity, String name, int mlOfMilk) {
        super(coffeeIntensity);
        this.mlOfMilk = mlOfMilk;
        this.name = name;
    }

    public int getMlOfMilk() {
        return mlOfMilk;
    }

    public void setMlOfMilk(int mlOfMilk) {
        this.mlOfMilk = mlOfMilk;
    }

    @Override
    public void printCoffeeDetails(){
        super.printCoffeeDetails();
        System.out.println(name + " volume of milk: " + mlOfMilk);
    }

    public void makeCappuccino(){
        super.makeCoffee();
        System.out.println("Adding " + getMlOfMilk() + " ml of milk");
    }

}
