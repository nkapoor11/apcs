/**
 * This program prompts the user to enter an angle, in degrees, and then 
 * display the angle in degrees, in radians, and the Sine, Cosine, and Tangent of the angle.
 * @author Neil Kapoor
*/

import java.util.Scanner;

public class Unit5Activity1_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an angle in degrees: ");
		
		double degrees = input.nextDouble();
		System.out.println("Angle in degrees: " + degrees);
		System.out.println("Angle in radians: " + Math.toRadians(degrees));
		System.out.println("Sin of the angle: " + Math.sin(degrees));
		System.out.println("Cos of the angle: " + Math.cos(degrees));
		System.out.println("Tan of the angle: " + Math.tan(degrees));
	}
}