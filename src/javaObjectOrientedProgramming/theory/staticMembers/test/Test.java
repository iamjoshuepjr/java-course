package javaObjectOrientedProgramming.theory.staticMembers.test;

import javaObjectOrientedProgramming.theory.staticMembers.classes.BankAccount;

import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(100000);
        float interestRate = BankAccount.getInterestRate();
        JOptionPane.showMessageDialog(null, "Bank Account " +account.getAccountNumber() +
                "\nInterest Rate: "+interestRate+"%" +
                "\nBalance: $" + account.getBalance());
    }
}
