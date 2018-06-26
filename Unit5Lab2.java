/**
 * This program prompts the user to enter a month (1-12) and a year (e.g., 2012), and
 * then displays a calendar for that month and year as illustrated below:
 * @author Neil Kapoor
*/

import java.util.Scanner;

public class Unit5Lab2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a month (1-12): ");
		int m = input.nextInt();
		System.out.print("Enter a year (e.g., 2012): ");
		int y = input.nextInt();
		printMonthCalendar(m, y);
	}
	
	public static void printMonthCalendar( int m, int y ) {
		printMonthHeader(m, y);
		printMonthBody( m, y );
	}
	
	public static void printMonthHeader( int m, int y ) {
		System.out.println();
		System.out.println("\t" + getMonthName(m) + " " + y);
		System.out.println("------------------------------");
		System.out.println("Sun Mon Tue Wed Thu Fri Sat ");
	}
	
	public static void printMonthBody( int m, int y ) {
		// get first day of the month using 1 thru 7 scale: 1 is Mon, 2 is Tue, etc. 
		int day = getStartDay(m, 1, y);
		
		// determine what date is Saturday based on day value.
		int saturday = 7 - day;
		
		// use for loop to print all the days in the month. 
		for (int j = 1; j <= getNumDaysInMonth(m, y); j++) {
			if (j == 1) { 
				// if it's the first day, then determine how much spacing needed to print the 1.
				if (day != 7) {
					// Sunday requires no spacing. 
					for (int i = 1; i < (5 + 4 * (day-1)); i++) {
						System.out.print(" ");
					}
				}
			}
			
			// adjust inter-number spacing for single digit dates until 10. 
			if (j < 10) {
				System.out.print(j + "   ");
			} else { System.out.print(j + "  "); } // for two-digit numbers. 
			
			// go to next line if it's Saturday. 
			if (j % 7 == saturday) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	public static int getNumDaysInMonth( int m, int y) {
		int numDays = 0;
		
		switch(m) {
			case 1: numDays = 31; break; // jan
			case 2: numDays = isLeapYear(y) ? 29 : 28; // feb
			case 3: numDays = 31; break; // march
			case 4: numDays = 30; break; // april
			case 5: numDays = 31; break; // may
			case 6: numDays = 30; break; // june
			case 7: numDays = 31; break; // july
			case 8: numDays = 31; break; // aug
			case 9: numDays = 30; break; // sept
			case 10: numDays = 31; break; // oct
			case 11: numDays = 30; break; // nov
			case 12: numDays = 31; break; // dec
		}
		return numDays;		
	}
	
	
	public static boolean isLeapYear(int y) {
		// check if year is a leap year.
		if ((y % 4 == 0) && (y % 100 != 0) && (y % 400 == 0)) {
			return true;
		}
		else { return false; }
	}
	
	public static String getMonthName( int m ) {
		String month = "";
		
		switch(m) {
			case 1: month = "January"; break;
			case 2: month = "February"; break;
			case 3: month = "March"; break;
			case 4: month = "April"; break;
			case 5: month = "May"; break;
			case 6: month = "June"; break;
			case 7: month = "July"; break;
			case 8: month = "August"; break;
			case 9: month = "September"; break;
			case 10: month = "October"; break;
			case 11: month = "November"; break;
			case 12: month = "December"; break;
		}
		return month;
	}
 /*
  The method getStartDay() implements Zeller's Algorithm for determining the day of the
  week the first day of a month is. The method adjusts Zeller's numbering scheme
  for day of week ( 0=Saturday, ..., 6=Friday ) to conform to a day of week number
  that corresponds to ISO conventions (i.e., 1=Monday, ..., 7=Sunday)
  
  Pre-Conditions: The month value, m,  is 1-12
                        The day value, d, is 1-31, or 1-28, 1-29 for February
                        The year value, y, is the full year (e.g., 2012)
                  
 Post-Conditions: A value of 1-7 is returned, representing the first day of the month
                        1 = Monday, ..., 7 = Sunday
  */

  public static int getStartDay( int m, int d, int y )
  {
    // Adjust month number & year to fit Zeller's numbering system
    if ( m < 3 ) 
    {
      m = m + 12;
      y = y - 1;
    }
    
    int k = y % 100;      // Calculate year within century
    int j = y / 100;      // Calculate century term
    int h = 0;            // Day number of first day in month 'm'
    
    h = ( d + ( 13 * ( m + 1 ) / 5 ) + k + ( k / 4 ) + ( j / 4 ) + ( 5 * j ) ) % 7;
    
    // Convert Zeller's value to ISO value (1 = Mon, ... , 7 = Sun )
    int dayNum = ( ( h + 5 ) % 7 ) + 1;     
    
    return dayNum;
  }

}