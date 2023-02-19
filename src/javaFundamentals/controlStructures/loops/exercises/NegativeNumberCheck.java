package javaFundamentals.controlStructures.loops.exercises;

import javax.swing.JOptionPane;

public class NegativeNumberCheck {
    public static void main(String[] args) {

        boolean negative = false;
        byte negativeCounter = 0;

        for (int i = 1; i < 11 ; i++) {
            var number = Integer.parseInt(JOptionPane.showInputDialog("Enter the ("+i+") number: "));

            if(number < 0){
                negativeCounter++;
                negative = true;
            }
        }

        if(negative == true){
            JOptionPane.showMessageDialog(null, "At least there is a negative number" +
                    "\nNegative Numbers: "+negativeCounter);
        }else {
            JOptionPane.showMessageDialog(null, "There are not negative numbers" +
                    "\nNegative Numbers: "+negativeCounter);
        }
    }
}
