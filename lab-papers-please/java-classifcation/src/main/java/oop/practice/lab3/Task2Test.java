package oop.practice.lab3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task2Test {


    @Test
    public void testPeopleDinner() {
        PeopleDinner peopleDinner = new PeopleDinner();

        peopleDinner.serveDinner("Car1");
        peopleDinner.serveDinner("NoDineCar2");
        peopleDinner.serveDinner("Car3");
        peopleDinner.serveDinner("NoDineCar4");

        assertEquals(2, peopleDinner.getServedCount());

        assertEquals(2, peopleDinner.getSkippedCount());

        assertTrue(peopleDinner.getSkippedCars().contains("NoDineCar2"));
        assertTrue(peopleDinner.getSkippedCars().contains("NoDineCar4"));
    }

    @Test
    public void testRobotDinner() {
        RobotDinner robotDinner = new RobotDinner();

        robotDinner.serveDinner("Car1");
        robotDinner.serveDinner("NoDineCar2");
        robotDinner.serveDinner("Car3");

        assertEquals(2, robotDinner.getServedCount());

        assertEquals(1, robotDinner.getSkippedCount());

        assertTrue(robotDinner.getSkippedCars().contains("NoDineCar2"));
    }

    @Test
    public void testGasStation() {
        GasStation gasStation = new GasStation();

        gasStation.refuel("Car1");
        gasStation.refuel("Car2");

        assertEquals(2, gasStation.getRefueledCount());
    }

    @Test
    public void testElectricStation() {
        ElectricStation electricStation = new ElectricStation();

        electricStation.refuel("Car1");

        assertEquals(1, electricStation.getRefueledCount());
    }

    @Test
    public void testTotalServedAndRefueled() {
        PeopleDinner peopleDinner = new PeopleDinner();
        RobotDinner robotDinner = new RobotDinner();
        GasStation gasStation = new GasStation();
        ElectricStation electricStation = new ElectricStation();

        peopleDinner.serveDinner("Car1");
        robotDinner.serveDinner("Car2");
        gasStation.refuel("Car3");
        electricStation.refuel("Car4");

        int totalServed = peopleDinner.getServedCount() + robotDinner.getServedCount();
        assertEquals(2, totalServed);

        int totalRefueled = gasStation.getRefueledCount() + electricStation.getRefueledCount();
        assertEquals(2, totalRefueled);
    }
}
