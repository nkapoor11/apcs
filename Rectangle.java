/**
 * This program contains the class methods for the Rectangle class to take in user input to draw a rectangle and make basic calculations.
 * @author Neil Kapoor
*/
import java.util.Scanner;

public class Rectangle {
	// initialize Scanner for user input.
	Scanner input = new Scanner(System.in);
	// declare private data fields for rectangle.
	private int length;
	private int width;
	private char c;
	
	public Rectangle() { }// default constructor.
	
	public Rectangle(int l, int w) { // parameterized constructor.
			length = l;
			width = w;
			drawRect(l,w); // call drawRect() method to draw rectangle using user input.
	}
	
	public void drawRect(int length, int width) {
		//  prompt the user for a character. 
		System.out.print("Enter a character to draw a rectangle: ");
		c = input.next().charAt(0);
		// Use that char to draw the rectangle to the console. 
		for (int i = 0; i < width; i++) {
			for(int j = 0; j < length; j++) {
				if (i == 0 || i == width-1) {
					System.out.print(c);
				}
				else {
					if (j == 0 || j == length-1) {
						System.out.print(c);
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

	// setter and getter methods. 
	public int computeArea() {
		return length * width;
		
	}
	public int computePerimeter() {
		return 2 * (length + width);
	}
	
	public void setLength( int l) {
		length = l;
	}
	
	public void setWidth( int w) {
		width = w;
	}	
	
	public int getWidth() {
		return width;
	}
	
	public int getLength() {
		return length;
	}
}