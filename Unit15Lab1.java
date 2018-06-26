/**
 * This program sets up a GUI that calculates the sum of two values. 
 * @author Neil Kapoor
 */

// import packages for GUI. 
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.*;

public class Unit15Lab1 extends Application {
	Label response = new Label("Enter your information");	
	private TextField tfFirstValue = new TextField();
	private TextField tfSecondValue = new TextField();
	private TextField tfSumIs = new TextField();
	private Button btCalculate = new Button("Calculate");

	@Override // from start() method in Application class. 
	public void start(Stage myStage) {
		myStage.setTitle("Simple Calculator");
		GridPane rootNode = new GridPane();
		rootNode.setHgap(5);
		rootNode.setVgap(5);
		rootNode.add(new Label("First Value:"), 0, 0);
		rootNode.add(tfFirstValue, 1, 0);
		rootNode.add(new Label("Second Value: "), 0, 1);
		rootNode.add(tfSecondValue, 1, 1);
		rootNode.add(new Label("Sum is:"), 0, 2);
		rootNode.add(tfSumIs, 1, 2);
		rootNode.add(btCalculate, 1, 3);
		
		// Set properties for UI
		rootNode.setAlignment(Pos.CENTER);
		tfFirstValue.setAlignment(Pos.BOTTOM_LEFT);
		tfSecondValue.setAlignment(Pos.BOTTOM_LEFT);
		tfSumIs.setAlignment(Pos.BOTTOM_LEFT);
		tfSumIs.setEditable(false);
		rootNode.setHalignment(btCalculate, HPos.LEFT);	
		
		// Process events, register handler
		btCalculate.setOnAction(new ButtonHandler());
		
		// Create scene and place on stage. 
		Scene myScene = new Scene(rootNode, 400, 250);
		myStage.setScene(myScene);
		myStage.show();
	} // end of start method.
	
	class ButtonHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			double first = Double.parseDouble(tfFirstValue.getText());
			double second = Double.parseDouble(tfSecondValue.getText());
			// Calculate sum.
			double sum = first + second;
			tfSumIs.setText(String.format("%.2f", sum));
		}
	}
}