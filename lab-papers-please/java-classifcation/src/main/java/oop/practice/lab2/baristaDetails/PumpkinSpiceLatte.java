package oop.practice.lab2.baristaDetails;

class PumpkinSpiceLatte extends Cappuccino{
    private int mgOfPumpkinSpice;

    public PumpkinSpiceLatte(Intensity intensityOfCoffee, int mlOfMilk, int mgOfPumpkinSpice) {
        super(intensityOfCoffee, "PumpkinSpiceLatte", mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    public int getMgOfPumpkinSpice() {
        return mgOfPumpkinSpice;
    }

    public void setMgOfPumpkinSpice(int mgOfPumpkinSpice) {
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    @Override
    public void printCoffeeDetails(){
        super.printCoffeeDetails();
        System.out.println(name + " amount of pumpkin spice: " + mgOfPumpkinSpice);
    }

    public void makePumpkinSpiceLatte(){
        super.makeCappuccino();
        System.out.println("Adding " + mgOfPumpkinSpice + " mg of pumpkin spice");
    }
}
