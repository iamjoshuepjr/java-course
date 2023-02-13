package javaFundamentals.controlStructures.decisionMaking.exercises;

import javax.swing.*;

public class TwentyOff {
    public static void main(String[] args) {
        /* 20% discount to customers whose purchase exceeds $300
         *  What will a person pay for their purchase?
         */

        var total = Float.parseFloat(JOptionPane.showInputDialog("Enter the value of you purchase here: "));

        if (total > 300){
            var discount = total * 0.20;
            var toPay = total - discount;
            JOptionPane.showMessageDialog(null, "To pay: $"+toPay);
        }else {
            JOptionPane.showMessageDialog(null, "No discount!");
        }
    }
}
