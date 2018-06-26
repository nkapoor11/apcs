/**
 * This program  prompts the user to specify a financial function to use, then calculates
 * and displays the appropriate value. 
 * @author Neil Kapoor
*/
import java.util.Scanner;

public class Unit5Lab1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Specify which function. Enter 1 for Future Value of a Single Sum, 2 for Present Value of a Single Sum, "
			+ " or 3 for Future Value of an Annuity: ");
		
		int function = input.nextInt();
		double P; 
		int n;
		double i;
		double F;
		double A;
		double output = 0;
		
		switch(function) {
			case 1: System.out.print("Enter the principle: ");
					P = input.nextDouble();
					System.out.print("Enter number of years: ");
					n = input.nextInt() * 12;
					System.out.print("Enter periodic interest rate: ");
					i = input.nextDouble() / 12;
					// use equation 𝐹 = 𝑃 ∗ (1 + 𝑖) ^ 𝑛
 					F = P * Math.pow((1 + i), n);
 					output = F; 
					break;
			case 2: System.out.print("Enter F, the dollars desired in the account in the future: ");
					F = input.nextDouble();
					System.out.print("Enter number of years: ");
					n = input.nextInt() * 12;
					System.out.print("Enter periodic interest rate: ");
					i = input.nextDouble() / 12;
					// use equation P = F / ((1 + 𝑖) ^ 𝑛)
 					P = F / Math.pow((1 + i), n);
 					output = P; 
					break;
			case 3: System.out.print("Enter A, the monthly deposit dollar amount: ");
					A = input.nextDouble();
					System.out.print("Enter number of years: ");
					n = input.nextInt() * 12;
					System.out.print("Enter periodic interest rate: ");
					i = input.nextDouble() / 12;
					// use equation 𝐹 = A ∗ ( (((1 + 𝑖) ^ 𝑛) - 1) / i)
 					F = A * ( (Math.pow((1 + i), n) - 1) / i);
 					output = F; 
					break;
		}
		// round output to two decimal places. 
		// use formula: Math.floor(x * 10 ^ N + 0.5) / 10 ^ N
		
		output = Math.floor(output * 10 * 10 + .5) / 100;
		
		System.out.println("$" + output);
	}
}