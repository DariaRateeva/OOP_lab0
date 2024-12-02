package oop.practice.lab3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Scheduler {
    private Semaphore semaphore;

    public Scheduler(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void startScheduler(String folderPath) {
        semaphore.initializeQueue(folderPath);

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        // Monitor and process new JSON files every 3 seconds
        executor.scheduleWithFixedDelay(() -> semaphore.monitorQueueFolder(folderPath),
                0, 3, TimeUnit.SECONDS);

        // Serve cars every 5 seconds
        executor.scheduleWithFixedDelay(() -> semaphore.serveAll(),
                0, 5, TimeUnit.SECONDS);
    }
}
