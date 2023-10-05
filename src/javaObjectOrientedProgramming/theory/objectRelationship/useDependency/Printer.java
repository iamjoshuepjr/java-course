package javaObjectOrientedProgramming.theory.objectRelationship.useDependency;

import javax.swing.*;

public class Printer {
    private boolean isOn = false;

    public void turnOn(){
        isOn = true;
    }

    public void toPrint(Document document){
        if(isOn){
            JOptionPane.showMessageDialog(null, "Printing Document..." +
                    "\n\t"+ document.getTitle() + "\n\t" + document.getBody());
        } else {
            JOptionPane.showMessageDialog(null, "The printer is turned off!\nDo you want to turn it on?");
        }
    }

}
