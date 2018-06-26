/**
 * This program prompts the user to enter two numbers x and y, and displays the
 * value of x/y rounded to an integer value, to one decimal place, to two decimal places,
 * and to three decimal places.
 * @author Neil Kapoor
*/ 

import java.util.Scanner;

public class Unit5Activity1_5 {
	public static void main(String[] args) {
	// Math.floor( x * 10N + 0.5 ) / 10N
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number x: ");
	double x = input.nextInt();
	System.out.print("Enter a number y: ");
	double y = input.nextInt();
	
	System.out.println("x/y rounded to an integer value is: " + (int)(x/y));
	
	// to one decimal place: 
	double one = Math.floor( (x/y) * 10 + 0.5 ) / 10;
	System.out.println("x/y rounded to one decimal place is: " + one);
	
	// to two and three decimal places:
	
	double two = Math.floor( (x/y) * 10 * 10 + 0.5 ) / (10 * 10);
	System.out.println("x/y rounded to two decimal places is: " + two);
	
	double three = Math.floor( (x/y) * 10 * 10 * 10 + 0.5 ) / (10 * 10 * 10);
	System.out.println("x/y rounded to three decimal places is: " + three);
	
	
	
	}
}