//package oop.practice.lab3;
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class Task2Test {
//
//    @Test
//    public void testPeopleDinner() {
//        System.out.println("===== Test 1: PeopleDinner =====");
//
//        PeopleDinner peopleDinner = new PeopleDinner();
//
//        peopleDinner.serveDinner(1);
//        peopleDinner.serveDinner(2);
//        peopleDinner.serveDinner(5);
//        peopleDinner.serveDinner(4);
//
//        assertEquals(2, peopleDinner.getServedCount());
//        assertEquals(2, peopleDinner.getSkippedCount());
//
//        System.out.println("===== End of Test 1 =====\n");
//    }
//
//    @Test
//    public void testRobotDinnerSkipCars() {
//        System.out.println("===== Test 2: RobotDinner Skip Cars =====");
//
//        RobotDinner robotDinner = new RobotDinner();
//
//        robotDinner.serveDinner(1);
//        robotDinner.serveDinner(5);
//        robotDinner.serveDinner(3);
//
//        assertEquals(2, robotDinner.getServedCount());
//        assertEquals(1, robotDinner.getSkippedCount());
//
//        System.out.println("===== End of Test 2 =====\n");
//    }
//
//    @Test
//    public void testStation() {
//        System.out.println("===== Test 3: GasStation =====");
//
//        GasStation gasStation = new GasStation();
//        ElectricStation electricStation = new ElectricStation();
//
//        gasStation.refuel(1);
//        electricStation.refuel(2);
//        gasStation.refuel(3);
//
//        assertEquals(2, gasStation.getRefueledCount());
//        assertEquals(1, electricStation.getRefueledCount());
//
//        System.out.println("===== End of Test 3 =====\n");
//    }
//
//    @Test
//    public void testTotalServedAndRefueled() {
//        System.out.println("===== Test 4: Total Served and Refueled =====");
//
//        PeopleDinner peopleDinner = new PeopleDinner();
//        RobotDinner robotDinner = new RobotDinner();
//        GasStation gasStation = new GasStation();
//        ElectricStation electricStation = new ElectricStation();
//
//        peopleDinner.serveDinner(1);
//        robotDinner.serveDinner(3);
//        gasStation.refuel(3);
//        electricStation.refuel(4);
//
//        int totalServed = peopleDinner.getServedCount() + robotDinner.getServedCount();
//        assertEquals(1, totalServed);
//
//        int totalRefueled = gasStation.getRefueledCount() + electricStation.getRefueledCount();
//        assertEquals(2, totalRefueled);
//
//        System.out.println("===== End of Test 4 =====\n");
//    }
//
//    @Test
//    public void testSkippedCars() {
//        System.out.println("===== Test 5:  Skipped Cars =====");
//
//        PeopleDinner peopleDinner = new PeopleDinner();
//        RobotDinner robotDinner = new RobotDinner();
//
//        peopleDinner.serveDinner(2);
//        peopleDinner.serveDinner(5);
//        robotDinner.serveDinner(6);
//        robotDinner.serveDinner(7);
//
//        assertEquals(1, peopleDinner.getServedCount());
//        assertEquals(1, peopleDinner.getSkippedCount());
//        assertTrue(peopleDinner.getSkippedCars().contains("Car2"));
//
//        assertEquals(1, robotDinner.getServedCount());
//        assertEquals(1, robotDinner.getSkippedCount());
//        assertTrue(robotDinner.getSkippedCars().contains("Car6"));
//
//        System.out.println("===== End of Test Skipped Cars =====\n");
//    }
//
//}
