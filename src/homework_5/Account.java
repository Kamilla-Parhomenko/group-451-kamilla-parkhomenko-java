package homework_5;

public class Account {

	String owner;
	double balance;
	
	public Account(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
        if (amount>0) {
            balance+=amount;
            System.out.println("success");
        } else{
            System.err.println("what");
        }
    }
	
	public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("success");
            } else {
                System.err.println("youre too broke 4 that");
            }
        } else {
            System.err.println("what are you doing hun");
        }
    }
	
	public double getBalance() {
        return balance;
    }
}
