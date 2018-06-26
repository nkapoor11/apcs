/** 
 * This program draws a bull's-eye that alternates between two random colors, which are generated randomly.
 * @author Neil Kapoor
*/

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Draw extends JPanel {

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 200, 200);
		// draw circles with different colors. 
		
		
	}

	public static void main(String[] args) {
		Draw panel = new Draw();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(230, 250);
		application.setVisible(true);
		
	}
}