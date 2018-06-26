/**
 * This program contains two methods, maximum and minimum, which take three double variables as 
 * arguments and returns the maximum and minimum of the three values, respectively.
 * @author Neil Kapoor
*/

public class Unit5Lab3 {
	public static void main(String[] args) {
		// test minimum.
		System.out.println("Minimum is " + minimum(1, 2, 3));
		System.out.println("Minimum is " + minimum(10, -28, 300));	
		System.out.println("Minimum is " + minimum(1.7, 2.2, 39));	
		
		// test maximum.
		System.out.println("Maximum is " + maximum(1, 2, 3));
		System.out.println("Maximum is " + maximum(10, -28, 300));
		System.out.println("Maximum is " + maximum(1.7, 2.2, 39));			
		
	}
	
	public static double minimum(double a, double b, double c) {
		double min = 0;
		boolean isTrue = true;
		min = a;
		while ( (min > b) && isTrue ) {
			min = b;
			isTrue = false;
		}
		
		isTrue = true;
		while ( (min > c) && isTrue) {
			min = c;
			isTrue = false;
		}
		
		return min;
		
	}
	
	public static double maximum(double a, double b, double c) {
		double max = 0;
		boolean isTrue = true;
		max = a;
		while ( (max < b) && isTrue ) {
			max = b;
			isTrue = false;
		}
		
		isTrue = true;
		while ( (max < c) && isTrue) {
			max = c;
			isTrue = false;
		}
		
		return max;
		
	}
}