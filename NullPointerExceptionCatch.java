/**
 * This program illustrates the NullPointerException when it is caught. 
 * @author Neil Kapoor
*/

public class NullPointerExceptionCatch {
	public static void main(String[] args) {
		
		try {
			// create a variable that has null value, identify that, and throw the exception, and then catch it. 
			Integer num = null;
			if (num == null) {
				throw new NullPointerException();
			} else {
				System.out.println(" num is: " + num);
			}
		}
		catch (NullPointerException e) {
			System.out.println("Error. NullPointerException caught. Object passed as an argument does not point to anything.");
		}
	}
}