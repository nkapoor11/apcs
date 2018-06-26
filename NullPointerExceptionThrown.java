/**
 * This program illustrates the NullPointerException when it is thrown. 
 * @author Neil Kapoor
*/

public class NullPointerExceptionThrown {
	public static void main(String[] args) {
		// create variable that has null value and make it do something.
		Integer num;
		doSomething(num);
	}
	/**
 	 * @pre n variable valid. 
	 * @post results printed. 
	*/
	public static void doSomething(Integer n) {
		System.out.println(" n is: " + n);
	}
}