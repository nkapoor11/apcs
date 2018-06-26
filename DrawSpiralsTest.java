/**
 * This is the driver program that draws a circular spiral using method drawArc to draw one semicircle at a time.
 * Each successive semicircle has a larger radius and continues drawing where the previous semicircle finished.
 * @author Neil Kapoor
*/

import javax.swing.JFrame; 
import java.awt.Color;
import java.awt.Graphics; 
import javax.swing.JPanel;

public class DrawSpiralsTest {
	public static void main(String[] args) {
		DrawSpirals panel = new DrawSpirals();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(250, 250);
		application.setVisible(true);
	}
}