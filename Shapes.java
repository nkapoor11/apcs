import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Shapes extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		for (int i = 0; i < 12; i++) {
			g.drawOval(getWidth() / 2 - (i * 5), getHeight() / 2 - (i * 5), 10 + i * 10, 10 + i * 10);
		}
	}
	
	public static void main(String[] args) {
		// create a panel that contains our drawing
		Shapes panel = new Shapes();
		
		// create a new frame to hold panel
		JFrame application = new JFrame();
		
		// set the frame to exit when it is closed
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel); // add the panel to the frame
		application.setSize(500, 290); //set the size of the frame
		application.setVisible(true); // make the frame visible
	}
}