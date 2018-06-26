/**
 * This program creates JFrame to display DrawPanel2B. (driver class)
 * @author Neil Kapoor
*/

import javax.swing.JFrame;

public class DrawPanelTest2B {
	public static void main(String[] args) {
		// create a panel that contains our drawing
		DrawPanel2B panel = new DrawPanel2B();
		
		// create a new frame to hold panel
		JFrame application = new JFrame();
		
		// set the frame to exit when it is closed
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel); // add the panel to the frame
		application.setSize(250, 250); //set the size of the frame
		application.setVisible(true); // make the frame visible
	}
} // end class DrawPanelTest
