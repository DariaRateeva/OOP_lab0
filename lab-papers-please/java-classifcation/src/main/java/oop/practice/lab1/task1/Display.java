package oop.practice.lab1.task1;

public class Display {
    private int width;
    private int height;
    private float ppi;
    private String model;

    public Display(int width, int height, float ppi, String model) {
        this.width = width;
        this.height = height;
        this.ppi = ppi;
        this.model = model;
    }

    public void compareSize(Display m){
        int area1 = width*height;
        int area2 = m.width*m.height;
        if(area1 > area2){
            System.out.println(model + " has bigger size than, " + m.model);
        } else if(area1 < area2){
            System.out.println(model + " has smaller size than, " + m.model);
        } else{
            System.out.println(model + " has equal size than, " + m.model);
        }
    }

    public void compareSharpness(Display m){
        if(ppi > m.ppi){
            System.out.println(model + " is sharper than, " + m.model);
        } else if(ppi < m.ppi){
            System.out.println(m.model + " is sharper than, " + model);
        }else{
            System.out.println(model + " has same resolution as " + m.model);
        }
    }

    public void compareWithMonitor(Display m){
        compareSize(m);
        compareSharpness(m);
    }
}
