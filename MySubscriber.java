/**
 * This program models a subclass subscriber receiving the notification, with the added specification that the notification is " has been notified". 
 * @author Neil Kapoor
*/

public class MySubscriber extends Subscriber
{
 public void update()
 {
 System.out.println( " has been notified" );
 }
}