package javaFundamentals.arrays.oneDimensional.exercises;

import javax.swing.JOptionPane;

public class AverageAndZeroCounter {
    public static void main(String[] args) {
        // variables
        float averagePos = 0, averageNeg = 0;
        int sumPos = 0, sumNeg = 0;
        byte zeroCounter = 0, posCounter = 0, negCounter = 0;

        // array
        int[] numbers = new int[5];

        // filling array
        for (int i = 0; i < 5 ; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter the ("+(i+1)+") number here: "));

            if(numbers[i] == 0){
                zeroCounter++;
            }else if (numbers[i] > 0){
                posCounter++;
                sumPos += numbers[i];
            }else {
                negCounter++;
                sumNeg += numbers[i];
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
