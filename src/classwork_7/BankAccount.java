package classwork_7;

public class BankAccount {

	String owner;
	double balance;
	
	public void deposit(double amount) {
		balance+=amount;
		
		if(amount>balance) {
			System.err.println("you dont have enough money");
		}
	}
	
	public void withdraw(double amount) {
		balance-=amount;
	}
	
	public void show() {
		System.out.println(balance);
	}
}
