/**
 * This program illustrates the ClassCastException when it is thrown. 
 * @author Neil Kapoor
*/

public class ClassCastExceptionThrown {
	public static void main(String[] args) {
		int a = 1;
		// cast an int to something it is not an instance of, String. 
		String x = (String) a;
	}
}