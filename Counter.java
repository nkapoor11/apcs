 /**
 * This program models a "counter" that has various functions.
 * @author Neil Kapoor
*/

public class Counter {
	// declare data field.
	public static int count;
	/**
 	 * @pre count variable is valid. 
	 * @post initializes count.
	*/
	public Counter() {
		count = 0;
	}
	/**
 	 * @pre count variable is valid. 
	 * @post display count.
	*/
	public void displayCount() {
		System.out.println("Count is: " + count);
	}
	// A mechanism to increment, decrement, and reset the Counter
	/**
 	 * @pre count variable is valid. 
	 * @post count has been incremented. 
	*/
	public void increment() {
		count++;
	}
	/**
 	 * @pre count variable is valid. 
	 * @post count has been decremented. 
	*/
	public void decrement() {
		count--;
	}
	/**
 	 * @pre count variable is valid. 
	 * @post count has been set to zero. 
	*/
	public void reset() {
		count = 0;
	}
	/**
 	 * @pre count variable is valid. 
	 * @post return count. 
	*/
	public int getCount() { return count; }
}