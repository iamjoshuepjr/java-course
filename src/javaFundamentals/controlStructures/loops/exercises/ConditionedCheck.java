package javaFundamentals.controlStructures.loops.exercises;

import javax.swing.JOptionPane;

public class ConditionedCheck {
    public static void main(String[] args) {
        boolean conditioned = false;
        byte conditionedCounter = 0;

        for (int i = 1; i < 6; i++) {
            var grade = Float.parseFloat(JOptionPane.showInputDialog("Enter the ("+i+") grade here: "));
            if(grade == 3){
                conditionedCounter++;
                conditioned = true;
            }
        }
        if(conditioned == true){
            JOptionPane.showMessageDialog(null, "At least there is a conditioned student" +
                    "\nConditioned Students: "+conditionedCounter);
        }else {
            JOptionPane.showMessageDialog(null, "There are not negative numbers" +
                    "\nConditioned Students: "+conditionedCounter);
        }
    }
}
