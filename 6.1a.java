import javax.swing.JFrame; 

public class 6.1a {
	public static void main(String[] args) {
		DrawLines panel = new DrawLines();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400, 250);
		application.setVisible(true);
	}
}