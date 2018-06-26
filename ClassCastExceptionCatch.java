/**
 * This program illustrates the ClassCastException when it is caught. 
 * @author Neil Kapoor
*/

public class ClassCastExceptionCatch {
	public static void main(String[] args) {
		Object c = "hello";
		try {
			// cast an int to something it is not an instance of, String. Catch the exception. 
			System.out.println((Integer) c);
		}
		catch (ClassCastException e) {
			System.out.println("Error. ClassCastException caught. Object not an instance of Integer.");
		}
		
	}
}