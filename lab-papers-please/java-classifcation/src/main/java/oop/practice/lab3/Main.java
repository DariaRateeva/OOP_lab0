package oop.practice.lab3;

public class Main {
    public static void main(String[] args) {
        String folderPath = "src/main/java/oop/practice/lab3/queue";

        Semaphore semaphore = new Semaphore();

        Queue<Car> gasQueueWithPeople = new LinkedListQueue<>();
        Queue<Car> gasQueueWithRobots = new LinkedListQueue<>();
        Queue<Car> electricQueueWithPeople = new LinkedListQueue<>();
        Queue<Car> electricQueueWithRobots = new LinkedListQueue<>();

        CarStation gasStationWithPeople = new CarStation(new PeopleDinner(), new GasStation(), gasQueueWithPeople);
        CarStation gasStationWithRobots = new CarStation(new RobotDinner(), new GasStation(), gasQueueWithRobots);
        CarStation electricStationWithPeople = new CarStation(new PeopleDinner(), new ElectricStation(), electricQueueWithPeople);
        CarStation electricStationWithRobots = new CarStation(new RobotDinner(), new ElectricStation(), electricQueueWithRobots);

        semaphore.registerStation("GAS_PEOPLE", gasStationWithPeople);
        semaphore.registerStation("GAS_ROBOTS", gasStationWithRobots);
        semaphore.registerStation("ELECTRIC_PEOPLE", electricStationWithPeople);
        semaphore.registerStation("ELECTRIC_ROBOTS", electricStationWithRobots);

        Scheduler scheduler = new Scheduler(semaphore);
        scheduler.startScheduler(folderPath);
    }
}
