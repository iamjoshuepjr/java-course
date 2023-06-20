package javaFundamentals.controlStructures.decisionMaking.exercises.switchStatement;

import javax.swing.JOptionPane;

public class ATM {
    public static void main(String[] args) {
        float balance = 100000;
        float deposit, withdraw, currentBalance;

        JOptionPane.showMessageDialog(null, "Welcome to ATM-Bank");
        var option = Byte.parseByte(
                JOptionPane.showInputDialog(
                        "Menu"+
                        "\n1. Account" +
                        "\n2. Deposit" +
                        "\n3. Withdraw" +
                        "\n4. Exit")
        );

        switch (option){
            case 1:
                JOptionPane.showMessageDialog(null, "You have selected Account option\n" +
                        "Your balance is: $"+balance +" dollars");
                break;
            case 2:
                deposit = Float.parseFloat(JOptionPane.showInputDialog("You have selected Deposit option\n" +
                        "Enter the deposit  $"));
                currentBalance = balance + deposit;
                JOptionPane.showMessageDialog(null, "Done!\nYour new Balance is: $"+currentBalance);
                break;
            case 3:
                withdraw = Float.parseFloat(JOptionPane.showInputDialog("You have selected Withdraw option\n" +
                        "Enter amount to withdraw $"));
                if(withdraw > balance){
                    JOptionPane.showMessageDialog(null, "Warning!\n" +
                            "Invalid Action!\n" +
                            "Amount to withdraw is greater than balance.");
                }else {
                    currentBalance = balance - withdraw;
                    JOptionPane.showMessageDialog(null, "Withdrawal Successful\n"+
                            "New Balance: $"+currentBalance +
                            "\nWithdraw: $"+withdraw);
                }
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Thank you for using our services!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Warning!\nInvalid choice!");
                break;
        }
    }
}
