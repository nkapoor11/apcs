/**
 * This program implements a simple multiplication quiz by generating random numbers.
 * It then prompts the user to enter the product of the numbers. 
 * @author Neil Kapoor
*/

import java.util.Scanner;
import java.lang.*; // to get current time in milliseconds. 
public class MultiplicationQuiz
{
 public static void main( String [] args )
 {
 // prompt user to enter how many problems to generate. 
 Scanner input = new Scanner( System.in );
 System.out.print("Enter how many problems to generate: ");
 int n = input.nextInt();
 int count = 0; // counts number of problems correctly answered. 
 long time1 = System.currentTimeMillis(); // start time
 
 // Generate 2n random numbers that will be multiplied for n problems total.
 for (int i = 0; i < n; i++) {
 	int number1 = (int) ( Math.random() * 10 );
 	int number2 = (int) ( Math.random() * 10 );
 	
 	// Prompt user to input answer
 	System.out.print( "What is " + number1 + " * " + number2 + "? " );
 	int answer = input.nextInt();

 	// Grade the answer
 	if ( ( number1 * number2 ) == answer ) {
 		System.out.println( "Congratulations...you are correct!" );
 		count++;
 	} else
 		System.out.println("The correct answer is " + (number1 * number2));
 }
 long time2 = System.currentTimeMillis();
 int netTime = (int) ((time2 - time1) / 1000.0); // in seconds
 System.out.println("Time taken in seconds is: " + netTime);
 double score = (((double) count) / n) * 100;
 System.out.println("Your percent score is: " + score);
 
 

 
 }
}