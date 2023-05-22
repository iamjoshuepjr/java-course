package javaObjectOrientedProgramming.theory.inheritance.exercises.test;

import javaObjectOrientedProgramming.theory.inheritance.exercises.classes.BankAccount;
import javaObjectOrientedProgramming.theory.inheritance.exercises.classes.CheckingAccount;
import javaObjectOrientedProgramming.theory.inheritance.exercises.classes.SavingAccount;

import javax.swing.*;

// Controller Class
public class BankAccountTest {
    public static void main(String[] args) {

        // Instantiating the superclass
        BankAccount account1 = new BankAccount(234525643, "Josh", 500000f);

        JOptionPane.showMessageDialog(null, "----------------- ACCOUNT -----------------" +
                "\nACCOUNT HOLDER NAME: "+ account1.getAccountHolderName() +
                "\nACCOUNT NUMBER: " + account1.getAccountNumber()
        );
        account1.displayBalance();
        account1.deposit(5000000);
        account1.displayBalance();
        account1.withdraw(6666);

        // Instantiating SavingAccount subclass
        SavingAccount account2 = new SavingAccount(234525645, "Josh", 500000f, 2.6f);
        JOptionPane.showMessageDialog(null, "----------------- SAVING ACCOUNT -----------------" +
                "\nACCOUNT HOLDER NAME:" + account2.getAccountHolderName() +
                "\nACCOUNT NUMBER: " + account2.getAccountNumber()
        );
        account2.displayBalance();
        account2.calculateInterest(6);

        // Instantiating CheckingAccount
        CheckingAccount account3 = new CheckingAccount(234525649, "Josh", 500000f, 788888);
    }
}