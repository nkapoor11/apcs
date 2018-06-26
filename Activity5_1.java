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
		
		for(int i = 5; i > 0; i--) {
			// draw the face
			if (i % 2 == 0) {
				g.setColor(new Color(num1, num2, num3));
			}
			else {
				g.setColor(new Color(num4, num5, num6));
			}
			//g.setColor(new Color(0, 0, i*40));
			g.fillOval(125 - (i * 15), 125 - (i * 15), 30 * i, 30 * i);
			
			//g.setColor(new Color(0, 255, 255));
			//g.fillOval(30, 30, 150, 150);
			//g.fillOval(i * 10, i * 10, 210 - 10 * i, 210 - 10 * i);
			//g.fillOval( i * 10, i * 10, 200 - (10 * i), 200 - (10 * i));
		}
		
		
		
		// draw the eyes
		/*
		g.setColor(Color.BLACK);
		g.fillOval(55, 65, 30, 30);
		g.fillOval(135, 65, 30, 30);
		
		// draw the mouth
		g.fillOval(50, 110, 120, 60);
		
		// "touch up" the mouth into a smile
		g.setColor(Color.YELLOW);
		g.fillRect(50, 110, 120, 30);
		g.fillOval(50, 120, 120, 40);*/
		
		
	}
	
}