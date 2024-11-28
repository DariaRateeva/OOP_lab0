package oop.practice.lab3;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;

public class Semaphore {
    private Map<String, CarStation> stations;
    private ObjectMapper objectMapper;
    private long lastCarAddedTime;

    public Semaphore() {
        this.stations = new HashMap<>();
        this.objectMapper = new ObjectMapper();
        this.lastCarAddedTime = System.currentTimeMillis();
    }

    public void registerStation(String type, CarStation station) {
        stations.put(type, station);
    }

    public void monitorQueueFolder(String folderPath) {
        try {
            Path path = Paths.get(folderPath);
            if (!Files.exists(path)) {
                Files.createDirectories(path); // Create the directory if it doesn't exist
                System.out.println("Created folder: " + folderPath);
            }

            try (WatchService watchService = FileSystems.getDefault().newWatchService()) {
                path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);
                System.out.println("Monitoring folder: " + folderPath);

                while (true) {
                    WatchKey key = watchService.take();
                    for (WatchEvent<?> event : key.pollEvents()) {
                        WatchEvent.Kind<?> kind = event.kind();

                        if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
                            String fileName = event.context().toString();
                            if (fileName.endsWith(".json")) {
                                processFile(new File(folderPath + "/" + fileName));
                                lastCarAddedTime = System.currentTimeMillis();
                            }
                        }
                    }
                    key.reset();
                }
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void processFile(File file) {
        try {
            Car car = objectMapper.readValue(file, Car.class);

            CarStation station = stations.get(car.getType());
            if (station != null) {
                station.addCar(car);
                System.out.println("Car " + car.getId() + " added to " + car.getType() + " station.");
            } else {
                System.out.println("No station registered for car type: " + car.getType());
            }

            // Delete file after processing
            if (!file.delete()) {
                System.err.println("Failed to delete file: " + file.getName());
            }
        } catch (Exception e) {
            System.err.println("Failed to process file: " + file.getName() + " - " + e.getMessage());
        }
    }

    public void serveAll() {
        stations.values().forEach(CarStation::serveCars);
        printTotalsIfIdle();
    }

    private void printTotalsIfIdle() {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastCarAddedTime > 5000) { // 5 seconds of inactivity
            printTotals();
            shutdownProgram(); // Stop the program after printing totals
        }
    }

    private void shutdownProgram() {
        System.out.println("Shutting down the program...");
        System.exit(0); // Gracefully terminate the program
    }


    private void printTotals() {
        // Retrieve cumulative counts from PeopleDinner and RobotDinner
        int totalPeople = PeopleDinner.getTotalPeople();
        int totalRobots = RobotDinner.getTotalRobots();
        int totalDining = PeopleDinner.getTotalDining() + RobotDinner.getTotalDining();
        int totalNotDining = PeopleDinner.getTotalNotDining() + RobotDinner.getTotalNotDining();

        // Calculate car counts and consumption totals by type
        Map<String, Integer> carCounts = new HashMap<>();
        Map<String, Integer> consumptionTotals = new HashMap<>();

        for (Map.Entry<String, CarStation> entry : stations.entrySet()) {
            String type = entry.getKey();
            CarStation station = entry.getValue();

            carCounts.put(type, station.getTotalCarsProcessed());
            consumptionTotals.put(type, station.getTotalConsumption());
        }

        System.out.println("Totals:");
        System.out.println("Car Counts by Type: " + carCounts);
        System.out.println("Consumption Totals by Type: " + consumptionTotals);
        System.out.println("PEOPLE: " + totalPeople);
        System.out.println("ROBOTS: " + totalRobots);
        System.out.println("DINING: " + totalDining);
        System.out.println("NOT_DINING: " + totalNotDining);
    }


}
