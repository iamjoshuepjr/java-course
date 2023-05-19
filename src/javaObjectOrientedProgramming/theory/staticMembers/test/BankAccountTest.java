package javaObjectOrientedProgramming.theory.staticMembers.test;
import javaObjectOrientedProgramming.theory.staticMembers.classes.BankAccount;

import javax.swing.JOptionPane;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        BankAccount account1 = new BankAccount();

        account.deposit(100000);
        account1.deposit(600899);

        JOptionPane.showMessageDialog(null, "Account Information" +
                "\nBank Account N° " + account.getAccountNumber() + // instance method
                "\nInterest rate: " +BankAccount.getInterestRate()+ "%" + // static method
                "\nBalance: $" + account.getBalance()); // instance method

        // Updating Interest rate1
        BankAccount.setInterestRate(3.6f); // static method

        float interestRate = BankAccount.getInterestRate(); // static method

        JOptionPane.showMessageDialog(null, "Account Information" +
                "\nBank Account N° " +account1.getAccountNumber() + // instance method
                "\nInterest Rate: "+interestRate+"%" +
                "\nBalance: $" + account1.getBalance()
        );

        float amount = account1.withdraw(5999);
        JOptionPane.showMessageDialog(null, "Account Information" +
                "\nBank Account N° " +account1.getAccountNumber() + // instance method
                "\nInterest Rate: "+interestRate+"%" +
                "\nWithdrawal $" +  amount +
                "\nBalance: $" + account1.getBalance()
        );
    }
}