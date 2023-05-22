package javaObjectOrientedProgramming.theory.inheritance.exercises.classes;

// Subclass
public class CheckingAccount extends BankAccount{
    private float overdraftLimit;

    public CheckingAccount(int numberAccount, String accountHolderName, float balance, float overdraftLimit) {
        super(numberAccount, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public float withdrawWithOverdraft(float amount) {
        return amount * overdraftLimit;
    }
}
