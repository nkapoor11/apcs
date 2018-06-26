/**
 * This program draws 10 random filled shapes in random colors, positions, and sizes.
 * @author Neil Kapoor
*/

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class DrawShapes extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// draw the bulls-eye
		for(int i = 0; i < 10; i++) { // 10 shapes
			
			// generate random color parameters.
			int num1 = (int)(Math.random() * 255);
			int num2 = (int)(Math.random() * 255);
			int num3 = (int)(Math.random() * 255);
			
			
			// determine whether to draw a rectangle or an oval.
			int num = (int)(Math.random() * 100);
			
			// generate other parameters, i.e. coordinates and dimensions at random.
			int x = (int)(Math.random() * getWidth());
			int y = (int)(Math.random() * getHeight());
			int length = (int)(Math.random() * (getWidth() / 2));
			int height = (int)(Math.random() * (getHeight() / 2));
			
			g.setColor(new Color(num1, num2, num3));
			
			if (num % 2 == 0) {
				// draw a rectangle
				g.fillRect(x, y, length, height);
			}
			else {
				// draw an oval.
				g.fillOval(x, y, length, height);
			}
		}
	}
	
}