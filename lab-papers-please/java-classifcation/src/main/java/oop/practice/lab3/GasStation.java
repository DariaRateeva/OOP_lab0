package oop.practice.lab3;

public class GasStation implements Refuelable{
    private int refueledCount = 0;
    private int totalGasConsumption = 0;

    @Override
    public void refuel(int carId) {
        System.out.println("Refueling gas car " + carId);
        refueledCount++;
    }

    public void refuel(Car car) {
        System.out.println("Refueling gas car " + car.getId());
        refueledCount++;
        totalGasConsumption += car.getConsumption();
    }

    public int getRefueledCount() {
        return refueledCount;
    }

    public int getTotalGasConsumption() {
        return totalGasConsumption;
    }
}
