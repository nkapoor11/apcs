 /**
 * This program models is the driver program for the Person class.
 * @author Neil Kapoor
*/

public class Unit9Lab1
{
 public static void main( String [] args )
 {
 // create objects
 Person p1 = new Person();
 Person p2 = new Person( new Name("Tony", "Baggadonuts"), new Date(10,21,2001) );
 System.out.println();
 
 // display attributes.
 System.out.println( p1.getFirstName() + "\t" + p1.getLastName() + "\t"
+ p1.getBirthDayString() );
 System.out.println( p2.getFirstName() + "\t" + p2.getLastName() + "\t"
+ p2.getBirthDayString() );
 }
} 