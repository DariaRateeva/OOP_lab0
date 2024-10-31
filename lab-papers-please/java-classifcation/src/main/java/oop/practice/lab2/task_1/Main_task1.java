package oop.practice.lab2.task_1;

public class Main_task1 {
    public static void main(String[] args) {
        Coffee coffee = new Coffee(Intensity.STRONG);
        System.out.println(coffee.getName());
        Cappuccino cappuccino = new Cappuccino(Intensity.LIGHT, 10);
        System.out.println(cappuccino.getName());
        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(Intensity.NORMAL, 10,SyrupType.MACADAMIA );
        System.out.println(syrupCappuccino.getName());
        Americano americano = new Americano(Intensity.NORMAL, 10);
        System.out.println(americano.getName());
        PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(Intensity.STRONG, 10, 20);
        System.out.println(pumpkinSpiceLatte.getName());
        System.out.println("The intensity of your bevarage is : " + pumpkinSpiceLatte.getIntensity());
        System.out.println("The bevarage contains milk:" + pumpkinSpiceLatte.getMlOfMilk() + "ml");
    }
}
