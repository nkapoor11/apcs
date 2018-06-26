/**
 * This program is part (a) of exercise 3.1, which draws lines from the top left corner, 
 * fanning them out until they cover the upper left half of the panel.
 * @author Neil Kapoor
*/

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel1B extends JPanel {
	public void paintComponent(Graphics g) {
		// call paint paintComponent to ensure the panel displays correctly
		super.paintComponent(g);
		
		//int width = getWidth();
		int height = getHeight();
		int steps = getWidth() / 15;
		int width = 0;
		
		// draw a line from the upper-left to the lower-right
		for (int i = 1; i < 16; i++) {
			g.drawLine(0, 0, width, height);
			width = width + steps;
			height = height - steps;
		}
	}
} // end class DrawPanel

