/**
 * This program asks a user to guess a secret number between 1 and N, where N is a
 * positive number that the user is prompted for and prompts the user for
 * the maximum number of guesses they would like. Each time the player makes a guess,
 * the program responds with “correct”, “too low”, or “too high”. The program should keep
 * track of the number of guesses the user made to discover the secret number. The program
 * continues execution until the user has discovered the secret number or has exceeded the
 * maximum number of guesses. The program also allows the user to play the game again
 * until the user declines.
 * @author Neil Kapoor
*/

import java.util.*;

public class Unit4Lab1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive number N: ");
		int N = input.nextInt();
		System.out.print("Enter the maximum number of guesses you would like make: ");
		int maxGuesses = input.nextInt();
		int count = 0; // counts guesses
		int randomNumber = (int) (N * Math.random()) + 1;
		boolean isCorrect = false;
		int guess;
		
		while(!(isCorrect)) {
			System.out.print("Guess a secret number between 1 and " + N + ": ");
			guess = input.nextInt();
			
			if ( (count >= maxGuesses) || (guess == randomNumber) ) {
				isCorrect = true; 
				if (count >= maxGuesses) {
					System.out.println("You exceeded the max number of guesses, " + maxGuesses + ".");
				} else {
					System.out.println("correct");
				}
				
				System.out.print("Would you like to play again? Enter 1 for yes, 0 for no: ");
				if (input.nextInt() == 1) {
					// reset everything.
					System.out.print("Enter a positive number N: ");
					N = input.nextInt();
					System.out.print("Enter the maximum number of guesses you would like make: ");
					maxGuesses = input.nextInt();
					count = 0; 
					randomNumber = (int) (N * Math.random()) + 1;
					isCorrect = false;
				}
			}
			else if (guess < randomNumber) {
				System.out.println("too low");
			}
			else if (guess > randomNumber) {
				System.out.println("too high");
			}
			else {
				System.out.print("Guess a secret number between 1 and " + N + ": ");
				guess = input.nextInt();
			}
			
			count++; // increment guesses made.
			
		}
		
		 
	}
}