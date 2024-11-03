package oop.practice.lab2.baristaDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Barista {

    private Scanner scanner = new Scanner(System.in);

    public void takeOrder(){
        List<String> coffeeOrders = new ArrayList<>();
        System.out.println("Welcome to the coffee shop!");
        System.out.println("Please select your coffee options. Enter the number corresponding to your choice.");
        System.out.println("Once you are done, type 'done' to finish your order.");

        while(true){
            System.out.println("Menu:");
            System.out.println("1. Cappuccino:");
            System.out.println("2. Americano:");
            System.out.println("3. PumpkinSpiceLatte:");
            System.out.println("4. SyrupCappuccino:");
            System.out.println("Enter your choice (or 'done' to complete your order):");

            String choice = scanner.nextLine();
            if(choice.equals("done")){
                break;
            }

            switch(choice){
                case "1":
                    coffeeOrders.add("Cappuccino");
                    System.out.println("Cappuccino added to your order.");
                    break;
                case "2":
                    coffeeOrders.add("Americano");
                    System.out.println("Americano added to your order.");
                    break;
                case "3":
                    coffeeOrders.add("PumpkinSpiceLatte");
                    System.out.println("PumpkinSpiceLatte added to your order.");
                    break;
                case "4":
                    coffeeOrders.add("SyrupCappuccino");
                    System.out.println("SyrupCappuccino added to your order.");
                    break;
            }
        }

        System.out.println("\nPreparing your order...");
        for(String coffeeType : coffeeOrders){
            System.out.println("\nPreparing " + coffeeType + " :");
            makeCoffees(coffeeType);
        }

        System.out.println("Your order is ready. Enjoy!");
    }

    private void makeCoffees(String coffeeType) {
        Coffee coffee;
        Intensity intensity = askForIntensity();
        int volume = getVolumeBasedOnIntensity(intensity);

        switch(coffeeType){
            case "Cappuccino":
                coffee = new Cappuccino(intensity, volume);
                ((Cappuccino) coffee).makeCappuccino();
                break;
            case "Americano":
                coffee = new Americano(intensity, volume);
                ((Americano) coffee).makeAmericano();
                break;
            case "PumpkinSpiceLatte":
                int pumpkinSpiceAmount = askForPumpkinSpiceAmount();
                coffee = new PumpkinSpiceLatte(intensity, volume, pumpkinSpiceAmount);
                ((PumpkinSpiceLatte) coffee).makePumpkinSpiceLatte();
                break;
            case "SyrupCappuccino":
                SyrupType syrupType = askForSyrupType();
                coffee = new SyrupCappuccino(intensity, volume, syrupType);
                ((SyrupCappuccino) coffee).makeSyrupCappuccino();
                break;
            default:
                System.out.println("Unknown coffee type: " + coffeeType);
                return;
        }
        System.out.println("\nYour coffee order details are: ");
        coffee.printCoffeeDetails();
        System.out.println("Your " + coffeeType + " is ready!\n");
    }

    private SyrupType askForSyrupType() {
        System.out.println("Please select the type of syrup for your Syrup Cappuccino. Enter the number corresponding to your choice:");
        System.out.println("Options:");
        System.out.println("1. MACADAMIA");
        System.out.println("2.VANILLA");
        System.out.println("3.COCONUT");
        System.out.println("4.CARAMEL");
        System.out.println("5.CHOCOLATE");
        System.out.println("6.POPCORN");
        String syrupInput = scanner.nextLine().toUpperCase();

        switch (syrupInput) {
            case "1":
                return SyrupType.MACADAMIA;
            case "2":
                return SyrupType.VANILLA;
            case "3":
                return SyrupType.COCONUT;
            case "4":
                return SyrupType.CARAMEL;
            case "5":
                return SyrupType.CHOCOLATE;
            case "6":
                return SyrupType.POPCORN;
            default:
                System.out.println("Invalid syrup type selected. Setting default value to VANILLA.");
                return SyrupType.VANILLA;
        }
    }

    private int askForPumpkinSpiceAmount() {
        System.out.println("Please select the amount of pumpkin spice for your Pumpkin Spice Latte. Enter the number corresponding to your choice:");
        System.out.println("Options: 1. LIGHT (20 g), 2. ORIGINAL (40 g), 3. INTENSE (50 g)");
        String spiceInput = scanner.nextLine();

        switch (spiceInput) {
            case "1":
                return 20;
            case "2":
                return 40;
            case "3":
                return 50;
            default:
                System.out.println("Invalid choice for pumpkin spice amount. Setting default value to ORIGINAL (40 g).");
                return 40;
        }
    }

    private int getVolumeBasedOnIntensity(Intensity intensity) {
        switch(intensity){
            case STRONG:
                return 100;
            case NORMAL:
                return 150;
            case LIGHT:
                return 200;
            default:
                return 150;
        }
    }


    private Intensity askForIntensity() {
        System.out.println("Please select the intensity of your coffee. Enter the number corresponding to your choice:");
        System.out.println("Options: 1.LIGHT, 2.NORMAL, 3.STRONG");
        String intensityInput = scanner.nextLine();

        switch (intensityInput) {
            case "1":
                return Intensity.LIGHT;
            case "2":
                return Intensity.NORMAL;
            case "3":
                return Intensity.STRONG;
            default:
                System.out.println("Invalid intensity selected. Settinf default value - NORMAL.");
                return Intensity.NORMAL;
        }
    }

}


