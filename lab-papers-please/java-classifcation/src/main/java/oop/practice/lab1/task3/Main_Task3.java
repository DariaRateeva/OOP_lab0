package oop.practice.lab1.task3;

import oop.practice.lab1.task1.Display;
import java.util.ArrayList;
import static oop.practice.lab1.task1.Display.printDisplayInfo;


public class Main_Task3 {
    public static void main(String[] args) {
        Display display1 = new Display(1920, 1080, 96.0f,"Model A" );
        Display display2 = new Display(2560, 1440, 109.0f,"Model B" );
        Display display3 = new Display(3840, 2160, 138.0f,"Model C" );

        Assistant assistant = new Assistant("Assistent1", new ArrayList<>());

        assistant.assignDisplay(display1);
        assistant.assignDisplay(display2);
        assistant.assignDisplay(display3);
        System.out.println("\nAssigned models to assistant " + assistant.getAssistantName());
        for(Display d : assistant.getAssignedDisplays()){
            printDisplayInfo(d);
        }

        System.out.println("\nDisplays comparison");
        assistant.assist();

        Display boughtDisplay = assistant.buyDisplay(display3);
        System.out.println("\nBought display information: ");
        printDisplayInfo(boughtDisplay);

        System.out.println("\nAssigned models to assistant " + assistant.getAssistantName() + " after the bought display");
        for(Display d: assistant.getAssignedDisplays()){
            printDisplayInfo(d);
        }


    }
}
