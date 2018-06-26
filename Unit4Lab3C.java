/**
 * This program prompts the user to enter a series of 10 integers and then determines and displays the largest and smallest
 * values entered. It uses the do-while construct.
 * @author Neil Kapoor
*/

import java.util.Scanner;

public class Unit4Lab3C {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a series of 10 integers: ");
		
		int counter = 0; // A counter to count how many integers were entered
		int number = 0; // The integer most recently input by the user
		int smallest = -1; // The smallest number entered so far
		int largest = 0; // The largest number entered so far
		do { // for 10 integers.
			
			number = input.nextInt();
			if ((counter == 0) || (number < smallest)) {
				smallest = number;
			}

			if (number > largest) {
				largest = number;
			}
			counter++; // increment counter after newest input.
			
			
		} while(counter < 10);
		System.out.println("smallest is " + smallest + ". largest is "  + largest);
	}
}