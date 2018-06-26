/**
 * This program draws 10 random filled shapes in random colors, positions, and sizes.
 * @author Neil Kapoor
*/

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Activity5_2 {
	public static void main(String[] args) {
		DrawShapes panel = new DrawShapes();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(250, 250);
		application.setVisible(true);
	}
}