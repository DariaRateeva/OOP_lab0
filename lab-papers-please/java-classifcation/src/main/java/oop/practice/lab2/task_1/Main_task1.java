package oop.practice.lab2.task_1;

public class Main_task1 {
    public static void main(String[] args) {
        Coffee coffee = new Coffee(Intensity.STRONG);
        Cappuccino cappuccino = new Cappuccino(Intensity.LIGHT, 15);
        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(Intensity.NORMAL, 18,SyrupType.MACADAMIA );
        Americano americano = new Americano(Intensity.NORMAL, 10);
        PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(Intensity.STRONG, 9, 20);

        coffee.printCoffeeDetails();
        cappuccino.printCoffeeDetails();
        syrupCappuccino.printCoffeeDetails();
        americano.printCoffeeDetails();
        pumpkinSpiceLatte.printCoffeeDetails();

    }
}
