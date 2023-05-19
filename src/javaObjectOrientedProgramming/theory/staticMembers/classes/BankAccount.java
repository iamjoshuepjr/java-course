package javaObjectOrientedProgramming.theory.staticMembers.classes;

import javax.swing.JOptionPane;

/**
 * ===========================================================================
 *                      Static Members
 * ===========================================================================
 * Static members in Java are class-level members shared among all instances.
 * They include static variables (class variables) and static methods.
 *
 * 1. Static variables:
 * These are variables declared with the 'static' keyword, and are shared
 * among class instances (objects), accessed using class name. (e.g., ClassName.variableName;)
 * Changes propagate across instances.
 *
 * 2. Static methods:
 * These are methods declared with the 'static' keyword and can be called
 * without creating an object of the class. They belong to the class itself
 * and can only access other static members.
 *
 * This allows us to use the class and its functionality conveniently without the need for object instantiation.
 */

// Object Class
public class BankAccount {

    // Class Attributes
    private static int nextAccountNumber = 1;
    private static float interestRate = 0.02f;

    // Instance Attributes
    private int accountNumber;
    private float balance;

    public BankAccount() {
        accountNumber = nextAccountNumber++;
        balance = 0.0f;
    }

    // Class method
    public static float getInterestRate(){
        return interestRate;
    }

    public static void setInterestRate(float rate) {
        interestRate = rate;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public float getBalance(){
        return balance;
    }

    public void deposit(float amount){
        balance += amount;
    }

    public float withdraw(float amount){
        if(balance >= amount){
            balance -= amount;
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient funds.");
        }
        return amount;
    }
}