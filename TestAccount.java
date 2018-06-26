/**
 * This program tests the Account classes hierarchy methods.  
 * @author Neil Kapoor
*/

public class TestAccount {
	public static void main(String[] args) {
		// array of CheckingAccount and SavingsAccount objects
		Account [] array = { new CheckingAccount(100, 12345, 15000, .05, new Date(2, 4, 2018)), 
							new SavingsAccount(12346, 4500, .04, new Date(3,5,2017) ) 						
							};
		
		// test methods.
		for (Account a : array) {
			System.out.println("Starting balance: " + a.getBalance());
			a.deposit(300); System.out.println("Balance is: " + a.getBalance());
			a.deposit(100); System.out.println("Balance is: " + a.getBalance());
			a.withdraw(200); System.out.println("Balance is: " + a.getBalance());
			a.withdraw(200); System.out.println("Ending balance is: " + a.getBalance());
			System.out.println();
		}
		
		
	}
}
