package oop.practice.lab3;

public class CarStation {
    private Dineable diningService;
    private Refuelable refuelingService;
    private Queue<Car> queue;

    public CarStation(Dineable diningService, Refuelable refuelingService, Queue<Car> queue) {
        this.diningService = diningService;
        this.refuelingService = refuelingService;
        this.queue = queue;
    }

    public void addCar(Car car) {
        queue.enqueue(car);
        System.out.println(car.getId() + " added to the queue.");
    }

    public void serveCars() {
        while (!queue.isEmpty()) {
            Car car = queue.dequeue();
            if (car.getPassengers().equals("ROBOTS")){
                RobotDinner.countRobots();
            }
            if (car.getPassengers().equals("PEOPLE")){
                PeopleDinner.countPeople();
            }

            if (car.isDining()){
                diningService.serveDinner(car.getId());
            }
            refuelingService.refuel(car.getId());
            System.out.println("Car " + car.getId() + " has been served.\n");
        }
    }

    public Queue<Car> getQueue(){
        return this.queue;
    }
}
