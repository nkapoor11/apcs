/**
 * This program creates a custom DivideByZeroException.
 * @author Neil Kapoor
*/

public class DivideByZeroException extends Exception {
	private int denom; 
	
	public DivideByZeroException() {}
	
	public DivideByZeroException(String s) {
		super(s);
	}
	/**
 	 * @pre d, denom variables valid. 
	 * @post denom variable set to d. 
	*/
	public DivideByZeroException(int d) {
		super("div by zero");
		denom = d;
	}
	/**
 	 * @pre denom variable valid. 
	 * @post denom returned. 
	*/
	public int getDenominator() {
		return denom;
	}
}