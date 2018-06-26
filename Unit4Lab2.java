/**
 * This program prompts the user to enter the maximum number of asterisks (*) to
 * display on a line of output, and then displays a line of output with that many asterisks, a line
 * with one less asterisk, a line with two less asterisks, …, and a line with one asterisk.
 * @author Neil Kapoor
*/
import java.util.Scanner;

public class Unit4Lab2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the maximum number of asterisks (*) to display on a line of output: ");
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}