/**
 * This program prompts the user to enter integers in the range 1 to 50 and displays the
 * occurrences of each integer. The program also prompts the user for the number of
 * integers that will be entered.  
 * @author Neil Kapoor
*/

import java.util.Scanner;

public class Unit6Lab1 {
	public static void main(String[] args) {
		// get user input.
		Scanner input = new Scanner(System.in);
		System.out.print("How many integers will be entered?: ");
		int size = input.nextInt();
		
		// create arrays to document input.
		int [] array = new int[size]; // takes in user input
		int [] count = new int[50]; // tracks how many times each integer occurs.
		
		// get more user input.
		System.out.print("Enter " + size + " integers in the range 1 to 50: ");
		
		for (int i = 0; i < size; i++) {
			// store user input in array. 
			array[i] = input.nextInt();	
			//System.out.println("array[" + i + "] is " + array[i]);
			// count how many times input occurs in count array. 
			count[array[i]]++; // e.g. increment from occurring 0 times to 1 time, 1 time to 2 times, etc.
		}
		
		// display results. 
		for (int i = 0; i < 50; i++) {
			if (count[i] != 0) { // only display actual inputs ;-)
				if (count[i] > 1) System.out.println(i + " occurs " + count[i] + " times.");
				else System.out.println(i + " occurs 1 time.");
			}
		}		
	}
}