/**
 * This program tests the methods in the Rectangle class, which take user input to draw a rectangle and calculate parameters.
 * @author Neil Kapoor
*/

import java.util.Scanner;

public class TestRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter width (must be between 1-30): ");
		int w = input.nextInt();
		System.out.print("Enter length (must be between 1-30): ");
		int l = input.nextInt();
		// verify inputs.
		if (l >= 1 && l <= 30 && w >= 1 && w <= 30) {
			Rectangle r1 = new Rectangle(l, w);		
			System.out.println("Area is: " + r1.computeArea());
			System.out.println("Perimeter is: " + r1.computePerimeter());
			System.out.println("Length is: " + r1.getLength());
			System.out.println("Width is: " + r1.getWidth());
			r1.setWidth(8);
			r1.setLength(9);	
		} else {
			System.out.println("Error. Length or width inputs must be in the range 1-30.");
		}
	}
}