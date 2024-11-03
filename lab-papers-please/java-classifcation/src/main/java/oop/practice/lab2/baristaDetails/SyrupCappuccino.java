package oop.practice.lab2.baristaDetails;

class SyrupCappuccino extends Cappuccino {
    private SyrupType syrup;

    public SyrupCappuccino(Intensity intensity, int mlOfMilk, SyrupType syrup) {
        super(intensity, "SyrupCappuccino", mlOfMilk);
        this.syrup = syrup;
    }

    public SyrupType getSyrup() {
        return syrup;
    }

    public void setSyrup(SyrupType syrup) {
        this.syrup = syrup;
    }

    @Override
    public void printCoffeeDetails(){
        super.printCoffeeDetails();
        System.out.println(name + " with syrup taste: " + syrup.toString());
    }

    public void makeSyrupCappuccino(){
        super.makeCappuccino();
        System.out.println("Adding " + syrup.toString() + " flavored syrup");
    }

}
