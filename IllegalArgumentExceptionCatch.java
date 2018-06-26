/**
 * This program illustrates the IllegalArgumentException when it is caught. 
 * @author Neil Kapoor
*/

public class IllegalArgumentExceptionCatch {
	public static void main(String[] args) {
		try {
			int percent = 104; // 104 % percent
			// percent must be a valid number. If it is not, throw an exception. Then, catch the exception. 
			if (percent < 0 | percent > 100) {
				throw new IllegalArgumentException();
			} else {
				System.out.println("good input.");
			}
		}
		catch (IllegalArgumentException e) {
			System.out.println("Error. IllegalArgumentException caught. Percent input must be greater than 0 and less than 100.");
		}
		
	}
}