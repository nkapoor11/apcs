/**
 * This program draws a circular spiral using method drawArc to draw one semicircle at a time.
 * Each successive semicircle has a larger radius and continues drawing where the previous semicircle finished.
 * The program uses for and if loops to determine the x, y, height, width, and sweep variables. 
 * @author Neil Kapoor
*/

import java.awt.Color;
import java.awt.Graphics; 
import javax.swing.JPanel;

public class DrawSpirals extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int sweep = 180;
		int width = 10;
		int height = 10;
		int x = getWidth() / 2;
		int y = getHeight() / 2;
		
		for(int i = 1; i < 10; i++, width += 10, height += 10) {
			if (i % 2 == 0) {
				// sweep should be -180 degrees. 
				sweep = -180;
				x = -5 * i + 125;
				y = x + 5;
			}
			else { 
				// sweep should be 180 degrees. 
				sweep = 180; 
				x = -5 * i + 130;
				y = x;  
			}
			g.drawArc(x, y, width, height, 0, sweep);
		} 
	}	
}