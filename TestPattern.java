/**
 * This program is the driver program for testing the publisher subscriber method. 
 * @author Neil Kapoor
*/

public class TestPattern
{
 public static void main( String [] args )
 {
 // Create Publisher & Subscriber objects
 //MySubscriber aSubscriber1 = new MySubscriber();
 MyPublisher aPublisher = new MyPublisher( 3 );

 // Register a Subscriber
 for (int i = 0; i < 3; i++) {
 	 aPublisher.register( new MySubscriber() );
 }


 // Increment Publisher object to cause state changes
 aPublisher.increment();
 aPublisher.increment();
 aPublisher.increment();
 aPublisher.increment();
 }
}