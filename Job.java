/**
 * This class contains the code to create Job objects and its getter methods. 
 * @author Neil Kapoor
*/

public class Job {
	// properties
	private int number;
	private int printTime; 
	
	public Job() {} // default constructor.
	public Job(int n, int t) { // parameterized constructor.
		number = n;
		printTime = t;
	}
	/**
 	 * @pre number variable valid. 
	 * @post number returned. 
	*/
	public int getNumber() {
		return number;
	}
	/**
 	 * @pre printTime variable valid. 
	 * @post printTime returned. 
	*/
	public int getPrintTime() {
		return printTime;
	}
}