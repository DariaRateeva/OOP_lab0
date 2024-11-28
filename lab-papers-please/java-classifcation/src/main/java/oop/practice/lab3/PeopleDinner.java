package oop.practice.lab3;

import java.util.HashSet;
import java.util.Set;

public class PeopleDinner implements Dineable {
    private int servedCount = 0;
    private Set<String> skippedCars = new HashSet<>();
    private static int totalPeople = 0;

    @Override
    public void serveDinner(int carId) {
        if (carId % 2 == 0) { // Example condition for skipping
            System.out.println("Skipping dinner for car " + carId);
            skippedCars.add("Car" + carId);
        } else {
            System.out.println("Serving dinner to people in car " + carId);
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

    public static void countPeople(){
        totalPeople++;
    }
}
