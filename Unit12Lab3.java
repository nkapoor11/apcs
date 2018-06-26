/**
 * This class uses TreeMap to implement a contact list and prompts the user to add, delete, or display the list. 
 * @author Neil Kapoor
*/

import java.io.*;
import java.util.*;

public class Unit12Lab3 {
 	public static void main(String args[]) throws FileNotFoundException {
 		// create TreeMap to implement the contact list. 
 		TreeMap<String, Contact> list = new TreeMap<String, Contact>();
 		// create Scanner objects to get user input. 
 		Scanner input = new Scanner(System.in);
  		System.out.println("Enter file name where your contacts are stored: ");
  		
  		String fileName = input.nextLine(); // fileName
  		// create input to file. 
  		Scanner sc = new Scanner(new File(fileName));
  
  		// allow user to to add a contact from the list, delete a contact from the list, and display the
		// entire contact list.
  		String action = "";
  		while (!action.toLowerCase().equals("q")) { // quit when q is entered. 
  			System.out.println("Press a to add a new contact, d to display all of your contacts, del to delete a contact, or q to quit the program: ");
   			action = input.next();
  			if (action.toLowerCase().equals("a")) {
  				// get input to add the contact to the list. 
    			System.out.println("Enter first name: ");
    			String fName = input.next().toLowerCase();
    			System.out.println("Enter last name: ");
   				String lName = input.next().toLowerCase();
    			System.out.println("Enter email: ");
    			String email = input.next().toLowerCase();
    			System.out.println("Enter the phone #: ");
    			int phoneNum = input.nextInt();
    			// add contact to the list. 
    			list.put(lName, new Contact(fName, lName, email, phoneNum));
   			} else if (action.toLowerCase().equals("d")) {
   				// iterate through the list and print each key's attributes. 
    			for (Map.Entry<String, Contact> entry : list.entrySet()) {
     				System.out.println("Last Name: " + entry.getKey() + " \nFirst Name: " + entry.getValue().getfName()
       				+ " \nEmail: " + entry.getValue().getEmail() + " \nPhone #: " + entry.getValue().getPhoneNumber());
    			}
   			} else if (action.toLowerCase().equals("del")) {
   				// search list for last name by key. First get user input. 
    			System.out.println("Enter last name: ");
    			String l = input.next(); // last name to delete. 
    			if ((list.containsKey(l.toLowerCase())))
     				list.remove(l);
    			else { System.out.println("Error. The last name you entered is not in the list."); }
   			} else if (!action.toLowerCase().equals("q")) {
    			System.out.println("Sorry, that input is not recognized.");
   			}
  		}
  		System.exit(0);
	}
}
