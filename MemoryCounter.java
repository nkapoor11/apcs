/**
 * This program models a memory counter which inherits properties/methods from class Counter.
 * @author Neil Kapoor
*/

public class MemoryCounter extends Counter {
	private static int memoryCounter; 
	
	public MemoryCounter() {
		memoryCounter = 0;
	}
	/**
 	 * @pre memoryCounter variable is valid. 
	 * @post display memoryCounter.
	*/
	public void displayMemoryCount() {
		System.out.println("Memory count is: " + memoryCounter);
	}
	
	/**
 	 * @pre memoryCounter, count variable is valid. 
	 * @post memoryCounter, count has been incremented. 
	*/
	
	public void increment() {
		count++;
		memoryCounter++;
		System.out.println("Just incremented memory counter.");
	}
	
	/**
 	 * @pre memoryCounter, count variable is valid. 
	 * @post memoryCounter, count has been set to zero. 
	*/
	
	public void reset() {
		count = 0;
		memoryCounter = 0;
	}
	/**
 	 * @pre memoryCounter variable is valid. 
	 * @post return memoryCounter. 
	*/
	
	public int getMemoryCount() { return memoryCounter; }

}