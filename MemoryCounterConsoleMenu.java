/**
 * This program creates a menu for the user to enter input. 
 * @author Neil Kapoor
*/

public class MemoryCounterConsoleMenu {
	// declare data field.
	protected String choice;
	protected MemoryCounter c1;
	/**
 	 * @pre choice, c1 variable is valid. 
	 * @post initialize variables. 
	*/
	public MemoryCounterConsoleMenu() {
		choice = "reset";
		c1 = new MemoryCounter();
	}

	/**
 	 * @pre none. 
	 * @post display to console. 
	*/
	public void displayMenuChoices() {
		System.out.println("The menu choices for the counter are: increment, decrement, reset, and quit.");
	}
	// A mechanism to get user input
	/**
 	 * @pre choice, c1 variables is valid. 
	 * @post count appropriately modified. 
	*/
	public void getUserInput() {		
		// get user input.
		choice = Input.getString("Enter choice for counter: ");
		
		switch(choice) {
			case "increment": c1.increment(); break; // increments counter and memory count
			case "reset": c1.reset(); break; // resets counter and memory count
			case "decrement": c1.decrement(); break; // decrements counter only, memory count stays the same. 
			case "quit": break; 
		}
	}
	
	/**
 	 * @pre choice variable is valid. 
	 * @post return choice. 
	*/
	public String getChoice() { return choice; }
	
	/**
 	 * @pre c1 variable is valid. 
	 * @post displayed to console. 
	*/
	public void displayCount() { 
		System.out.println( "Count is: " + c1.getCount()); 
		System.out.println("Memory count is: " + c1.getMemoryCount());
	}
}