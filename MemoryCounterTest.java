 /**
 * This program models is the driver program for the CounterConsoleMenu class.
 * @author Neil Kapoor
*/

public class CounterTest {
	public static void main(String[] args) {
		// initialize object.
		MemoryCounterConsoleMenu m = new MemoryCounterConsoleMenu();
		
		// play game.
		while ( !(m.getChoice()).equals("quit") ) {
			m.displayMenuChoices();
			m.getUserInput();
			m.displayCount();
		}
		
	}
}