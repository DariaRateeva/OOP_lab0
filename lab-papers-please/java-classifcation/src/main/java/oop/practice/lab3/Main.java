package oop.practice.lab3;

public class Main {
    public static void main(String[] args) {
        // Use an absolute path to the queue folder
        String folderPath = "src/main/java/oop/practice/lab3/queue";

        Semaphore semaphore = new Semaphore();

        Queue<Car> gasQueue = new LinkedListQueue<>();
        Queue<Car> electricQueue = new LinkedListQueue<>();

        CarStation gasStation = new CarStation(new PeopleDinner(), new GasStation(), gasQueue);
        CarStation electricStation = new CarStation(new RobotDinner(), new ElectricStation(), electricQueue);

        semaphore.registerStation("GAS", gasStation);
        semaphore.registerStation("ELECTRIC", electricStation);

        Scheduler scheduler = new Scheduler(semaphore);
        scheduler.startScheduler(folderPath);
    }
}



