package javaFundamentals.controlStructures.decisionMaking.exercises;

import javax.swing.*;

public class CorrectTime {
    public static void main(String[] args) {
        /* Ask for the date as follows:
           day, month, year.
           Determine if the date is correct. Assume the months are 30 days each.
        */

        // input
        var day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day here: "));
        var month = Integer.parseInt(JOptionPane.showInputDialog("Enter the month here: "));
        var year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year here: "));

        // process and output
        if((day >= 1) && (day <= 30)){
            if((month >= 1) && (month <= 12)){
                if(year != 0){
                    JOptionPane.showMessageDialog(null, "Congratulations Correct Date!\nDay: "+day+"\nMonth: "+month+"\nYear: "+year);
                }else {
                    JOptionPane.showMessageDialog(null, "Waring!\nThe year may be different than 0.\nYear: "+year);
                }
            }else {
                JOptionPane.showMessageDialog(null, "Waring!\nThe month may not be greater than 12 or less than 1.\nMonth: "+month);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Incorrect date!\nThe day may not be greater than 31 or less than 1.\nDay: "+day);
        }
    }
}
