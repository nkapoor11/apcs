/**
 * This program uses dialog boxes to prompt the user for the month, day,
 * and year attributes and displays the message The date is mm/dd/yyyy in a dialog box. It is the driver program using the Date class. 
 * @author Neil Kapoor
*/

import javax.swing.JOptionPane;
public class DateExercise {
	public static void main(String[] args) {
		// uses dialog boxes to prompt the user for the month, day,
		// and year attributes 
		
		int month = Input.getInt("Enter month (integer 1-12): ");
		int day = Input.getInt("Enter day (integer 1-31): ");
		int year = Input.getInt("Enter year (integer): ");
		
		// and displays the message The date is mm/dd/yyyy in a dialog box.
		Date d1 = new Date(month, day, year);
		JOptionPane.showMessageDialog( null, "The date is " + d1.getDate() );
	}
}