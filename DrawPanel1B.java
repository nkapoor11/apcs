/**
 * This program is part (b) of exercise 3.1, which draws lines from the all corners, 
 * fanning them out until they cover their half of the panel. 
 * Lines from opposite corners should intersect along the middle.
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
		for (int i = 0; i < 15; i++) {
			g.drawLine(0, 0, width, height);
			width = width + steps;
			height = height - steps;
		}
		// draw a line from the upper-right to the lower-left
		height = 0;
		width = 0;
		int endWidth = getWidth();
		for (int i = 0; i < 15; i++) {
			g.drawLine(width, height, endWidth, 0);
			width = width + steps;
			height = height + steps;
		}
		
		// draw a line from the lower-left to the upper-right
		int endHeight = getHeight();
		width = 0;
		height = 0;
		endWidth = getWidth();
		for (int i = 0; i < 15; i++) {
			g.drawLine(width, height, 0, endHeight);
			width = width + steps;
			height = height + steps;
		}
		
		// draw a line from the lower-right to the upper-left
		endHeight = getHeight();
		width = steps;
		height = endHeight - steps;
		endWidth = getWidth();
		for (int i = 0; i < 14; i++) {
			g.drawLine(width, height, endWidth, endHeight);
			width = width + steps;
			height = height - steps;
		}
	}
} // end class DrawPanel

