/**
 * This program draws a bull's eye that alternates between random colors. Note that main is the driving program.
 * @author Neil Kapoor
*/

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class DrawSmiley extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int num1 = (int)(Math.random() * 255);
		int num2 = (int)(Math.random() * 255);
		int num3 = (int)(Math.random() * 255);
		int num4 = (int)(Math.random() * 255);
		int num5 = (int)(Math.random() * 255);
		int num6 = (int)(Math.random() * 255);
		
		// draw the bulls-eye
		for(int i = 5; i > 0; i--) {
			// check which color to use.
			if (i % 2 == 0) {
				g.setColor(new Color(num1, num2, num3));
			}
			else {
				g.setColor(new Color(num4, num5, num6));
			}
			g.fillOval(125 - (i * 15), 125 - (i * 15), 30 * i, 30 * i);
		}
	}
	
}