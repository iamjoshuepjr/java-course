package javaFundamentals.controlStructures.decisionMaking.exercises.ifStatement.IfElse;

import javax.swing.JOptionPane;

public class CorrectDate2 {
    public static void main(String[] args) {
        /*
           Ask for the date as follows:
           day, month, year.
           Determine if the date is correct.
        */

        // input
        var day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day here: "));
        var month = Integer.parseInt(JOptionPane.showInputDialog("Enter the month here: "));
        var year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year here: "));

        // Process and Output
        if((day >= 1) && (day <= 31)){
            if((month >= 1) && (month <= 12)){
                // validating months days
                if(month == 2){
                    if(day > 28){
                        JOptionPane.showMessageDialog(null, "Incorrect date!\nFebruary does not have more than 28 days. Unless leap years, but in this case it is not considered that option.\nDay: "+day);
                    }else {
                        JOptionPane.showMessageDialog(null, "Congrats! Valid Date\nDay: "+day+"\nMonth: "+month+"\nYear: "+year);
                    }
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    if (day > 30){
                        JOptionPane.showMessageDialog(null, "Incorrect date!\nApril, June, September and November does not have more than 30 days.\nDay: "+day);
                    }
                    JOptionPane.showMessageDialog(null, "Congrats! Valid Date\nDay: "+day+"\nMonth: "+month+"\nYear: "+year);
                } else {
                    JOptionPane.showMessageDialog(null, "Waring!\nThe month may not be greater than 12 or less than 1.\nMonth: "+month);
                }
            }else {
                JOptionPane.showMessageDialog(null, "Waring!\nThe month may not be greater than 12 or less than 1.\nMonth: "+month);
            }
        }else {
            JOptionPane.showMessageDialog(null, "Incorrect date!\nThe day may not be greater than 31 or less than 1.\nDay: "+day);
        }
    }
}