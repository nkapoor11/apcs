/**
 * This program tests the DivideByZeroException through user input.
 * @author Neil Kapoor
*/

public class Unit13Lab1 {
	public static void main(String[] args) {
		System.out.println();
		boolean invalidDenom = true;
		
		try {
			divide(10,0);
		}
		catch(DivideByZeroException e) {
			while(invalidDenom) {
				try {
					int n = Input.getInt("Denominator must be nonzero...enter again");
					divide(10,n);
					invalidDenom = false;
					System.out.println("Good job.");
				}
				catch (DivideByZeroException ex) {
					invalidDenom = true;
				}
			}			
		}
	}
	/**
 	 * @pre x, y variables valid. 
	 * @post result returned or exception thrown. 
	*/
	public static int divide(int x, int y) throws DivideByZeroException {
		int result = 0;
		try {
			result = x/y;
		}
		catch (ArithmeticException e) {
			throw new DivideByZeroException(y);
		}
		return result;
	}
}