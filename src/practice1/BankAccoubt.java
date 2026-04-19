package practice1;

public class BankAccoubt {

	String owner;
	double balance;
	
	void deposit(double amount) {
		balance+=amount;
	}
	
	void withdraw(double amount) {
		if(amount > balance) {
			 System.err.println("error");
		} else {
			balance-= amount;
		}
	}
	
	double getbalance() {
		return balance;
	}
}
