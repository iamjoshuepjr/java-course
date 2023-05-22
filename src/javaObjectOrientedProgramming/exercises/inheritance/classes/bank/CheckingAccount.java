package javaObjectOrientedProgramming.exercises.inheritance.classes.bank;

import javax.swing.JOptionPane;

// Subclass
public class CheckingAccount extends BankAccount{
    private float overdraftLimit;

    public CheckingAccount(int numberAccount, String accountHolderName, float balance, float overdraftLimit) {
        super(numberAccount, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdrawWithOverdraft(float amount) {
        float availableBalance = getBalance() + overdraftLimit;
        if(amount <= availableBalance){
            withdraw(amount);
            JOptionPane.showMessageDialog(null, "Withdrawal of $" + amount + " successful! " +
                    "\nCurrent Balance $" + getBalance());
        } else if (amount <= overdraftLimit) {
            float remainingBalance = amount - getBalance();
            setBalance(0.0F);
            overdraftLimit -= remainingBalance;
            JOptionPane.showMessageDialog(null, "Withdrawal with overdraft successful! " +
                    "\nCurrent balance $" + getBalance());
        } else {
            JOptionPane.showMessageDialog(null, "Withdrawal amount exceeds available balance and overdraft limit.");
        }
    }
}
