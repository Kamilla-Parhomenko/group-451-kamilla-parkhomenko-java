package classwork;

public class BankAccount {

	double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	void deposit(double amount) {
		balance+=amount;
	}
	
	void withdraw(double amount) {
		if(balance>=amount) {
			balance-=amount;
		} else {
			System.err.println("ti slishkom nishiy dlya etoqo");
		}
	}
	
	double getBalance() {
		return balance;
	}
}
