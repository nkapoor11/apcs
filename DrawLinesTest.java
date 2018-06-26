/** 
 * This is the driver program that draws a square-shaped spiral, centered on the panel, using method drawLine. 
 * @author Neil Kapoor
*/

import javax.swing.JFrame; 

public class DrawLinesTest {
	public static void main(String[] args) {
		DrawLines panel = new DrawLines();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(250, 250);
		application.setVisible(true);
	}
}