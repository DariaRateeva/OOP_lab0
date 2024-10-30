package oop.practice.lab1.task3;

import oop.practice.lab1.task1.Display;
import java.util.List;

public class Assistant {
    private String assistantName;
    private List<Display> assignedDisplays;

    public Assistant(String assistantName, List<Display> assignedDisplays) {
        this.assistantName = assistantName;
        this.assignedDisplays = assignedDisplays;
    }

    public List<Display> getAssignedDisplays() {
        return assignedDisplays;
    }

    public String getAssistantName() {
        return assistantName;
    }

    public void assignDisplay(Display d){
        assignedDisplays.add(d);
    }

    public void assist(){
        for(int i = 0; i<assignedDisplays.size(); i++){
            Display display1 = assignedDisplays.get(i);
            for (int j = i+1; j<assignedDisplays.size(); j++){
                Display display2 = assignedDisplays.get(j);
                display1.compareWithMonitor(display2);
            }
        }
    }

    public Display buyDisplay(Display d){
        assignedDisplays.remove(d);
        return d;
    }
}
