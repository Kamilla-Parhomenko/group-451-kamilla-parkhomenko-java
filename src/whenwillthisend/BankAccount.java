package whenwillthisend;

public class BankAccount {

	double balance;
	
	BankAccount(double balance){
		this.balance = balance;
	}
	
	void withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
		}
	}
}

class SavingsAccount extends BankAccount{

	// какого типа должен быть interestRate?
	
	SavingsAccount(double balance) {
		super(balance);
	}
	
	// я не понимаю что от меня требуется.
	
	
}