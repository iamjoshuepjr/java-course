package javaFundamentals.controlStructures.loops.exercises;

import javax.swing.JOptionPane;

public class AverageAndZeroCounter {
    public static void main(String[] args) {
        float averagePos = 0, averageNeg = 0;
        int sumPos = 0, sumNeg = 0;
        byte zeroCounter = 0, posCounter = 0, negCounter = 0;

        for (byte i = 1; i < 11; i++) {
            var number = Integer.parseInt(JOptionPane.showInputDialog("Enter the number ("+i+") here: "));

            if(number == 0){
                zeroCounter++;
            } else if (number > 0) {
                posCounter++;
                sumPos += number;
            }else {
                negCounter++;
                sumNeg += number;
            }
        }

        if(posCounter == 0){
            JOptionPane.showMessageDialog(null, "Warning!\nDivision by zero is impossible");
        }else {
            averagePos = (float) sumPos / posCounter;
            JOptionPane.showMessageDialog(null, "Positive Average: "+averagePos);
        }

        if(negCounter == 0){
            JOptionPane.showMessageDialog(null, "Warning!\nDivision by zero is impossible");
        }else {
            averageNeg = (float) sumNeg / negCounter;
            JOptionPane.showMessageDialog(null, "Negative Average: "+averageNeg);
        }
        JOptionPane.showMessageDialog(null, "Number of zero: "+zeroCounter);
    }
}
