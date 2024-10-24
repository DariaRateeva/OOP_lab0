package oop.practice.lab1.task1;

public class Main_Task1 {
    public static void main(String[] args) {
    Display display1 = new Display(1920, 1080, 96.0f,"Display1" );
    Display display2 = new Display(2560, 1440, 109.0f,"Display2" );
    Display display3 = new Display(3840, 2160, 138.0f,"Display3" );

    display1.compareSize(display2);
    display2.compareSharpness(display3);
    display3.compareWithMonitor(display1);

    }
}
