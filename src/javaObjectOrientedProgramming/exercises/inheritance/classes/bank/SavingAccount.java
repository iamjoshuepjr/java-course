package javaObjectOrientedProgramming.exercises.inheritance.classes.bank;

import javax.swing.JOptionPane;

public class SavingAccount extends BankAccount {

    private float interestRate;

    public SavingAccount(int numberAccount, String accountHolderName, float balance, float interestRate) {
        super(numberAccount, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest(int time) {
        float interest = (getBalance() * interestRate * time) / 100;
        JOptionPane.showMessageDialog(null, "Interest for " +time+ "(months) - $"+interest);
    }
}