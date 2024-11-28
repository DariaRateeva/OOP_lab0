package oop.practice.lab3;

import oop.practice.lab3.Car;

public class ElectricStation implements Refuelable{
    private int refueledCount = 0;
    private int totalElectricConsumption = 0;

    @Override
    public void refuel(int carId) {
        System.out.println("Refueling electric car " + carId);
        refueledCount++;
    }

    public void refuel(Car car) {
        System.out.println("Refueling electric car " + car.getId());
        refueledCount++;
        totalElectricConsumption += car.getConsumption();
    }

    public int getRefueledCount() {
        return refueledCount;
    }
    public int getTotalElectricConsumption() {
        return totalElectricConsumption;
    }
}
