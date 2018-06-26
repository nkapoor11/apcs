/**
 * This program draws a square-shaped spiral, centered on the panel, using method drawLine. 
 * It uses for loop and switch constructs to determine the coordinates for the square spiral.
 * @author Neil Kapoor
*/

import java.awt.Color;
import java.awt.Graphics; 
import javax.swing.JPanel;
import javax.swing.JFrame; 

public class DrawLines extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
			
		int x1 = getWidth() / 2;
		int y1 = getHeight() / 2;
		int x2 = x1;
		int y2 = y1;
			
		for(int i = 1; i < 14; i++) {
			switch(i % 4) {
				case 0: // y2 is the same as y1. 
						x2 = x2 + (5 * i); break;
				case 1: // x2 is the same as x1. 
						y2 = y2 + (5 * i + 10); break;
				case 2: // y2 is the same as y1.
						x2 = x2 - (5 * i); break;
				case 3: // x2 is the same as x1.
						y2 = y2 - (5 * i + 10); break;
			}
			g.drawLine(x1, y1, x2, y2);
				
			x1 = x2;
			y1 = y2;
		}
	}	
		
	public static void main(String[] args) {
		DrawLines panel = new DrawLines();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(250, 250);
		application.setVisible(true);
	}
}