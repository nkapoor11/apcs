 /**
 * This program models is the driver program for the CounterConsoleMenu class.
 * @author Neil Kapoor
*/

public class CounterTest {
	public static void main(String[] args) {
		// initialize object.
		CounterConsoleMenu c = new CounterConsoleMenu();
		// play game.
		while ( !(c.getChoice()).equals("quit") ) {
			c.displayMenuChoices();
			c.getUserInput();
			c.displayCount();
		}
		
	}
}