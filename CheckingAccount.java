/**
 * This program models a checking account subclass. 
 * @author Neil Kapoor
*/

public class CheckingAccount extends Account {
	// A checking account has an overdraft limit
	private final double OVERDRAFT_LIMIT;
	
	// constructors
	public CheckingAccount() {
		OVERDRAFT_LIMIT = 0;
		accountNumber = 0000;
		balance = 0;
		interestRate = 0;
		dateCreated = new Date(0,0,0000);
	}
	
	public CheckingAccount(double o, int a, double b, double i, Date d) {
		OVERDRAFT_LIMIT = o;
		accountNumber = a;
		balance = b;
		interestRate = i;
		dateCreated = d;
	}
	
	// methods
	public void deposit(double a) {
		balance += a;
	}
	
	public void withdraw(double a) {
		// check if exceeds overdraft limit. 
		if (balance - a >= OVERDRAFT_LIMIT) {
			balance -= a;
		} else {
			System.out.println("Withdrawal request denied. Amount exceeds overdraft limit.");
		}
	}	
}

	