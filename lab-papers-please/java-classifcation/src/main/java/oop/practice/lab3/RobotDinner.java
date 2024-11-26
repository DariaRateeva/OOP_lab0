package oop.practice.lab3;

import java.util.HashSet;
import java.util.Set;

public class RobotDinner implements Dineable {
    private int servedCount = 0;
    private Set<String> skippedCars = new HashSet<>();

    @Override
    public void serveDinner(String carId) {
        if (carId.startsWith("NoDine")) {
            System.out.println("Skipping dinner for car " + carId);
            skippedCars.add(carId);
        } else {
            System.out.println("Serving dinner to robots in car " + carId);
            servedCount++;
        }
    }

    public int getServedCount() {
        return servedCount;
    }

    public int getSkippedCount() {
        return skippedCars.size();
    }

    public Set<String> getSkippedCars() {
        return skippedCars;
    }
}
