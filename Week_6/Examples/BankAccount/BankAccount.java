package Week_6.Examples.BankAccount;

public class BankAccount {

    //Instance Variables
    private double balance;

    //Constructors
    public BankAccount(){
        this(0);
        //Original statement was: balance = 0;
    }

    public BankAccount(double initialBalance){
        balance = initialBalance;
    }

    //Methods

    /**
     * The statement below deposits money into an existing BankAccount object
     * @param amount
     */
    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }

    public double getBalance(){
        return balance;
    }

    /**
     * Withdraws $10 from the object the method is called from
     * Example:
     * harrysChecking.monthlyFee();
     */
    public void monthlyFee(){
        this.withdraw(10);
    }
}