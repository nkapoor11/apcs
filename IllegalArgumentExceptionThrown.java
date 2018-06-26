/**
 * This program illustrates the IllegalArgumentException when it is thrown. 
 * @author Neil Kapoor
*/

public class IllegalArgumentExceptionThrown {
	public static void main(String[] args) {
		int percent = 104; // 104 % percent
		// percent must be a valid number. If it is not, throw an exception. 
		if (percent < 0 | percent > 100) {
			throw new IllegalArgumentException();
		} else {
			System.out.println("good input.");
		}
	}
}