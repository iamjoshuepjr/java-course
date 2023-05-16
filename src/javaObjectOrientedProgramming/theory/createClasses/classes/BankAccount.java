package javaObjectOrientedProgramming.theory.createClasses.classes;

import javax.swing.JOptionPane;

// Object Class
public class BankAccount {

    // Attributes
    public int accountNumber;
    public String accountHolderName;
    public float balance;


    // Methods
    public void deposit(float amount) {
        if (amount > 0){
            balance += amount;
            JOptionPane.showMessageDialog(null, "Deposit of $" +amount+ "successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid deposit amount.");
        }
    }

    public void withdraw(float amount){
        if(amount > 0){
            if (balance >= amount){
                balance -= amount;
                JOptionPane.showMessageDialog(null, "Withdrawal of $" +amount+ "successful!");
            } else {
                JOptionPane.showMessageDialog(null, "Insufficient funds.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid withdrawal amount.");
        }
    }

    public void displayBalance(){
        JOptionPane.showMessageDialog(null, "Account Balance: $" + balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }
}