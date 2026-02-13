package classwork_7;

public class BankAccount {

	String owner;
	double balance;
	
	public void deposit(double amount) {
		balance+=amount;
	}
	
	public void withdraw(double amount) {
		balance-=amount;
	}
	
	public void show() {
		System.out.println(balance);
	}
}
