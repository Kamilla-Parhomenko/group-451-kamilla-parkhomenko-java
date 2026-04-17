package packagename;

public class BankAccount {

	String owner;
	int balance;
	
	public void deposit(double amount) {
		balance+=amount;
	}
	
	public void withdraw(double amount) {
		balance-=amount;
	}
	
	public BankAccount(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount("Owner", 1500);
		ba.deposit(45.78);
		ba.withdraw(34.67);
	}
}
