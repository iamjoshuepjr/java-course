package javaObjectOrientedProgramming.exercises.inheritance.classes;
import javax.swing.JOptionPane;

// Object class
// Superclass
public class BankAccount {

    // Attributes
    private int accountNumber;
    private String accountHolderName;
    private float balance;


    // Constructor
    public BankAccount(int accountNumber, String accountHolderName, float balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Methods
    public void deposit(float amount) {
        if (amount > 0) {
            balance += amount;
            JOptionPane.showMessageDialog(null, "Deposit of $" + amount + " successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid deposit amount.");
        }
    }

    public void withdraw(float amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                JOptionPane.showMessageDialog(null, "Withdrawal of $" + amount + " successful!");
            } else {
                JOptionPane.showMessageDialog(null, "Insufficient funds.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid withdrawal amount.");
        }
    }

    public void displayBalance() {
        JOptionPane.showMessageDialog(null, "Account Balance: $" + balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public float getBalance(){
        return balance;
    }

    public void setBalance(float balance){
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}