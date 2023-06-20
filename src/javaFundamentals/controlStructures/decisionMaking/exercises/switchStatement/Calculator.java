package javaFundamentals.controlStructures.decisionMaking.exercises.switchStatement;

import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Program that simulates the operation of an arithmetic calculator");
        var number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number here: "));
        var number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number here: "));
        var operation = JOptionPane.showInputDialog("\t\tYou had entered\n" +
                "Number 1: "+ number1 +
                "\nNumber 2: "+ number2 +
                "\nSelect what operation you want to perform on them: " +
                "\nAddition - (A - a)" +
                "\nSubtraction - (S -s) " +
                "\nMultiplication - (M -m)" +
                "\nDivision - (D -d)"
                ).charAt(0);

        switch (operation){
            case 'A':
            case 'a':

                JOptionPane.showMessageDialog(null, "You have selected Addition Option - Character selected: ("+operation+") " +
                        "\nNumber 1: ("+number1+") " +
                        "\nNumber 2: ("+number2+") " +
                        "\nResult: ("+(number1 + number2)+")");

                break;

            case 'S':
            case 's':
                JOptionPane.showMessageDialog(null, "You have selected Subtraction Option - Character selected: ("+operation+") " +
                        "\nNumber 1: ("+number1+") " +
                        "\nNumber 2: ("+number2+") " +
                        "\nResult: ("+(number1 - number2)+")");
                break;

            case 'M':
            case 'm':
                JOptionPane.showMessageDialog(null, "You have selected Multiplication Option - Character selected: ("+operation+") " +
                        "\nNumber 1: ("+number1+") " +
                        "\nNumber 2: ("+number2+") " +
                        "\nResult: ("+(number1 * number2)+")");
                break;

            case 'D':
            case 'd':
                JOptionPane.showMessageDialog(null, "You have selected Division Option - Character selected: ("+operation+") " +
                        "\nNumber 1: ("+number1+") " +
                        "\nNumber 2: ("+number2+") " +
                        "\nResult: ("+(number1 / number2)+")");
                break;
            default:
                JOptionPane.showMessageDialog(null, "You have not selected any option");

        }
    }
}
