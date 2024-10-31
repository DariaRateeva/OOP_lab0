package oop.practice.lab2.task_1;

public class Americano extends Coffee{
    private int mlOfWater;

    public Americano(Intensity intensity, int mlOfWater) {
        super(intensity, "Americano");
        this.mlOfWater = mlOfWater;
    }

    public int getMlOfWater() {
        return mlOfWater;
    }

    public void setMlOfWater(int mlOfWater) {
        this.mlOfWater = mlOfWater;
    }

    @Override
    public void printCoffeeDetails(){
        super.printCoffeeDetails();
        System.out.println(name + "volume of water: " + mlOfWater);
    }

}
