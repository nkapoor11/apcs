/**
 * This program uses the Math class random() method in a program that generates and displays a
 * sequence of 20 random numbers in the range 1 – 5. 
 * @author Neil Kapoor
*/ 

public class Unit5Activity1_3 {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			int num =  (int)(1 + Math.random() * 5);
			System.out.print(num + " " );
		}
		
		System.out.println();
	}
}
		

