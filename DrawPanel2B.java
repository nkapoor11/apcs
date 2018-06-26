/**
 * This program is part (b) of exercise 3.2, which draws lines from the top left corner and increments the step down from all four corners. 
 * @author Neil Kapoor
*/

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel2B extends JPanel {
	public void paintComponent(Graphics g) {
		// call paint paintComponent to ensure the panel displays correctly
		super.paintComponent(g);
		
		//int width = getWidth();
		
		int steps = getWidth() / 15;
		int x1 = 0;
		int y1 = 0;
		int x2 = steps;
		int y2 = getHeight();
		
		// draw a line from the upper-left to the lower-right (right side)
		for (int i = 0; i < 15; i++) {
			g.drawLine(x1, y1, x2, y2);
			y1 = y1 + steps;
			x2 = x2 + steps;

		}
		
		x1 = 0;
		y1 = getHeight();
		x2 = steps;
		y2 = 0;
		
		// draw a line from the lower-left to the top-right (left side)
		for (int i = 0; i < 15; i++) {
			g.drawLine(x1, y1, x2, y2);
			y1 = y1 - steps;
			x2 = x2 + steps;

		}
		
		x1 = 0;
		y1 = getHeight();
		x2 = getWidth();
		y2 = getHeight() - steps;
		
		// draw a line from the lower-left to the top-right (right side)
		for (int i = 0; i < 15; i++) {
			g.drawLine(x1, y1, x2, y2);
			x1 = x1 + steps;
			y2 = y2 - steps;


		}
		
		x1 = 0;
		y1 = 0;
		x2 = getWidth();
		y2 = steps;
		
		// draw a line from the upper-left to the lower-right (left side)
		for (int i = 0; i < 15; i++) {
			g.drawLine(x1, y1, x2, y2);
			x1 = x1 + steps;
			y2 = y2 + steps;


		}
		
	}
} // end class DrawPanel