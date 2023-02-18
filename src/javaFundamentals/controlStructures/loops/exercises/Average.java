package javaFundamentals.controlStructures.loops.exercises;

import javax.swing.JOptionPane;

public class Average {
    public static void main(String[] args) {
        /*
        * Ask for a number positive. Calculate and display the average of all numbers entered.
        * */

        int number, sum = 0, counter = 0;
        float average = 0;

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number here: "));
        while (number >= 0){
            sum += number;
            counter++;
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number here: "));
        }
        if (counter == 0) {
            JOptionPane.showMessageDialog(null, "Warning!\nDivision by zero is impossible");
        }else {
            average = (float) sum / counter;
            JOptionPane.showMessageDialog(null, "Average: "+average);
        }
    }
}
