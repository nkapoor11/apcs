/**
 * This program models a bank account with abstract methods. 
 * @author Neil Kapoor
*/

public abstract class Account {
	// private attributes common to all accounts.
	protected int accountNumber;
	protected double balance;
	protected double interestRate;
	protected Date dateCreated;
	
	public double getBalance() { return balance; }
	
	// abstract methods to be defined in subclasses.
	public abstract void deposit(double a);
	public abstract void withdraw(double a);

}