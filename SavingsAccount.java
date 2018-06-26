/**
 * This program models a savings account subclass. 
 * @author Neil Kapoor
*/

public class SavingsAccount extends Account {
	// constructors
	public SavingsAccount() {
		accountNumber = 0000;
		balance = 0;
		interestRate = 0;
		dateCreated = new Date(0,0,0000);
	}
	
	public SavingsAccount(int a, double b, double i, Date d) {
		accountNumber = a;
		balance = b;
		interestRate = i;
		dateCreated = d;
	}
	
	// constructors
	public void deposit(double a) {
		balance += a;
	}
	
	// methods
	public void withdraw(double a) {
		if (balance - a >= 0) {
			balance -= a;
		} else {
			System.out.println("Withdrawal request denied. Amount exceeds account balance.");
		}
	}	
}
