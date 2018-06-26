 /**
 * This program models a console menu that the user sees.
 * @author Neil Kapoor
*/

public class CounterConsoleMenu {
// declare data field.
	private String choice;
	private Counter c1;
	/**
 	 * @pre choice, c1 variable is valid. 
	 * @post initialize variables. 
	*/
	public CounterConsoleMenu() {
		choice = "reset";
		c1 = new Counter();
	}
	// A mechanism to display the menu of choices (increment, decrement, reset, quit)
	/**
 	 * @pre none. 
	 * @post display to console. 
	*/
	public void displayMenuChoices() {
		System.out.println("The menu choices are: increment, decrement, reset, and quit.");
	}
	// A mechanism to get user input
	/**
 	 * @pre choice, c1 variables is valid. 
	 * @post count appropriately modified. 
	*/
	public void getUserInput() {		
		// get user input.
		choice = Input.getString("Enter choice: ");
		
		switch(choice) {
			case "increment": c1.increment(); break;
			case "decrement": c1.decrement(); break;
			case "reset": c1.reset(); break;
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
	public void displayCount() { System.out.println( "Count is: " + c1.getCount()); }
	
	
}