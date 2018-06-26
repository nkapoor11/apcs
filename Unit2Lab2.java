/**
 * This program prompts the user to enger a monetary amount.
 * Then, it displays the monetary equivalent in dollars, quarters, dimes, nickels, and pennies.
 * @author Neil Kapoor
*/ 

public class Unit2Lab2 {
	public static void main(String[] args) {
		double amount = Input.getDouble("Enter a monetary amount (in dollars and cents): ");
		int dollars = (int) amount;
		int cents = (int)(amount * 100) % (dollars * 100);
		int quarters = cents / 25;
		int dimes = (cents % 25) / 10;
		int remainingCents = cents - (25 * quarters) - (10 * dimes);
		int nickels = remainingCents / 5;
		int pennies = remainingCents - (5 * nickels);
		System.out.println("$" + amount + " consists of " + dollars + " dollars, " + quarters + " quarters, "
			+ dimes + " dimes, " + nickels + " nickels, " + pennies + " pennies.");
	}
}