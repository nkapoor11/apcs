// import packages for GUI. 
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.*;

public class Assignment11 extends Application {
	Label response = new Label("Enter your information");	
	private TextField tfInterestRate = new TextField();
	private TextField tfNumberOfYears = new TextField();
	private TextField tfLoanAmount = new TextField();
	private TextField tfMonthlyPayment = new TextField();
	private TextField tfTotalPayment = new TextField();
	private Button btCalculate = new Button("Calculate");

	@Override // from start() method in Application class. 
	public void start(Stage myStage) {
		
		// Use GridPane layout manager (create UI).
		GridPane rootNode = new GridPane();
		rootNode.setHgap(5);
		rootNode.setVgap(5);
		rootNode.add(new Label("Annual Interest Rate (%):"), 0, 0);
		rootNode.add(tfInterestRate, 1, 0);
		rootNode.add(new Label("Number of Years: "), 0, 1);
		rootNode.add(tfNumberOfYears, 1, 1);
		rootNode.add(new Label("Loan Amount:"), 0, 2);
		rootNode.add(tfLoanAmount, 1, 2);
		rootNode.add(new Label("Monthly Payment:"), 0, 3);
		rootNode.add(tfMonthlyPayment, 1, 3);		
		rootNode.add(new Label("Total Payment:"), 0, 4);
		rootNode.add(tfTotalPayment, 1, 4);
		rootNode.add(btCalculate, 1, 6);
		
		// Set properties for UI
		rootNode.setAlignment(Pos.CENTER);
		tfInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
		tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
		tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
		tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
		tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
		tfMonthlyPayment.setEditable(false);
		tfTotalPayment.setEditable(false);	
		rootNode.setHalignment(btCalculate, HPos.RIGHT);	
		
		// Process events, register handler
		btCalculate.setOnAction(new ButtonHandler());
		
		// Create scene and place on stage. 
		Scene myScene = new Scene(rootNode, 400, 250);
		myStage.setTitle("Loan Calculator");
		myStage.setScene(myScene);
		myStage.show();
	} // end of start method.
	
	class ButtonHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			double interest = Double.parseDouble(tfInterestRate.getText()) / 100;
			int years = Integer.parseInt(tfNumberOfYears.getText());
			int months = years * 12;
			double loanAmount = Double.parseDouble(tfLoanAmount.getText());
			
			// Calculate monthly payment and total payment using formulas.
			double monthlyPayment = (interest * loanAmount) / (1 - Math.pow((1 + interest), -months));
			double totalPayment = months * monthlyPayment;
			
			tfMonthlyPayment.setText(String.format("$%.2f", monthlyPayment));
			tfTotalPayment.setText(String.format("$%.2f", totalPayment));

		}
	}
}