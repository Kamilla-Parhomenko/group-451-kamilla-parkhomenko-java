package aaaaaaaaaaaaaaaaaaaaaaa;

public class BankAccount {

	protected String accountNumber;
    protected double balance;


    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public void deposit(double amount) {
        balance+=amount;
    }
    
    public void withdraw(double amount) {
        if(amount<=balance) {
        	balance-=amount;
        } else {
        	System.out.println("u too broke for that");
        }
    }
}
