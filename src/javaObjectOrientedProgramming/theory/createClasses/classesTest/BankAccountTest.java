package javaObjectOrientedProgramming.theory.createClasses.classesTest;
import javaObjectOrientedProgramming.theory.createClasses.classes.BankAccount;
import javax.swing.JOptionPane;

// Class Controllers
public class BankAccountTest {
    public static void main(String[] args) {
        byte option;
        // Instantiating a Cat object
        BankAccount account = new BankAccount();

        // Accessing Cat object attributes
        account.accountNumber = 1475779728;
        account.accountHolderName = "Joshuép Jr.";
        account.balance = 5890;

        // Accessing Cat object methods
        String name = account.getAccountHolderName();
        int numberAccount = account.getAccountNumber();

        JOptionPane.showMessageDialog(null, "Welcome "+name+ "\nAccount Number: "+numberAccount);

        option = Byte.parseByte(JOptionPane.showInputDialog("Chose and option: " +
                "\n1. Display balance " +
                "\n2. Deposit " +
                "\n3. Withdraw ")
        );

        switch (option) {
            case 1:
                account.displayBalance();
                break;

            case 2:
                float amount = Float.parseFloat(JOptionPane.showInputDialog("Amount to deposit $"));
                account.deposit(amount);
                handleWithdraw(account);
                break;

            case 3:
                amount = Float.parseFloat(JOptionPane.showInputDialog("Amount to withdraw $"));
                account.withdraw(amount);
                handleWithdraw(account);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + option);
        }
    }

    public static void handleWithdraw(BankAccount account){
        String view = String.valueOf(JOptionPane.showInputDialog("Do you want see your Balance? ").charAt(0));
        if(view.equalsIgnoreCase("Y")){
            account.displayBalance();
        } else {
            JOptionPane.showMessageDialog(null, "Thanks for using our services!");
        }
    }
}
