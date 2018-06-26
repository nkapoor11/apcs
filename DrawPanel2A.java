/**
 * This program is part (a) of exercise 3.2, which draws lines from the top left corner and increments the step down 
 * and across the left and bottom sides. 
 * @author Neil Kapoor
*/

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel2A extends JPanel {
	public void paintComponent(Graphics g) {
		// call paint paintComponent to ensure the panel displays correctly
		super.paintComponent(g);
		
		//int width = getWidth();
		
		int steps = getWidth() / 15;
		int x1 = 0;
		int y1 = 0;
		int x2 = steps;
		int y2 = getHeight();
		
		// draw a line from the upper-left to the lower-right
		for (int i = 0; i < 15; i++) {
			g.drawLine(x1, y1, x2, y2);
			y1 = y1 + steps;
			x2 = x2 + steps;

		}
		
	}
} // end class DrawPanel

