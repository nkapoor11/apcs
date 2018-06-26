/**
 * This program models a date as having integer month, day, and year attributes.
 * It includes appropriate methods to make the Date class functional and easy to reuse.
 * @author Neil Kapoor
*/

public class Date
{
 	 // initialize data fields.
     private int month;
     private int day;
     private int year;
     
     public Date() { 
     	month = 0;
     	day = 0;
     	year = 0;
     }
     
     public Date( int m, int d, int y ) { 
     	month = m;
     	day = d;
     	year = y;	
     }
     
     /**
      * @pre month variable is valid. 
      * @post returns month. 
     */
     public int getMonth() { return month; }
     
     /**
      * @pre day variable is valid. 
      * @post returns day. 
     */
     public int getDay() { return day;  }
     
     /**
      * @pre year variable is valid. 
      * @post returns year. 
     */
     public int getYear() { return year;  }
     
     /**
      * @pre month, day, year variables are valid. 
      * @post returns date in appropriate format. 
     */
     public String getDateString() {
     	return month + "/" + day + "/" + year;
     }
     
     /**
      * @pre m, d, y are type int. 
      * @post month, day, year variables are modified to parameter inputs. 
     */
     public void setDate(int m, int d, int y) {
     	month = m;
     	day = d;
     	year = y;
     }
     
     /**
      * @pre m is type int. 
      * @post month variable is modified to parameter input. 
     */
     public void setMonth(int m) { 
     	month = m; 
     }
     
     /**
      * @pre d is type int. 
      * @post day variable is modified to parameter input. 
     */
     public void setDay(int d) { 
     	day = d;  
     }
     
     /**
      * @pre y is type int. 
      * @post year variable is modified to parameter input. 
     */
     public void setYear(int y) { 
     	year = y;  
     }
}

