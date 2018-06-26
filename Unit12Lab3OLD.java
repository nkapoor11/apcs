import java.util.*;
import java.io.*;
import java.lang.*; 
import java.nio.*;


public class Unit12Lab3 {		
	private static Formatter output; // outputs text to a file. 
	private static Scanner input; // user input
	private static Scanner fileInput; // file input
		
	public static void main(String[] args) {
		System.out.print("Enter name of file: ");
		// initialize for user input.
		input = new Scanner(System.in); 
		String fname = input.next(); // get file name.
		
		if (openFile(fname)) { // if correct file name is inputted...
			//  allow the user to add a contact from the list, delete a contact from the list, 
			// and display the entire contact list.
			System.out.println("hello");
			addRecords(); // allow the user to add a contact from the list.
			closeFile();
		};

	}
		
	//open file clients.txt
	public static boolean openFile(String fname) {
		try {
			String fileName = fname;
			output = new Formatter(fname);
			return true;
		}
		catch (SecurityException s) {
			System.err.println("Write permission denied. Terminating.");
			System.exit(1); // terminate the program. 
			return false;
		}
		catch (FileNotFoundException f) {
			System.err.println("Error opening file. Terminating.");
			System.exit(1); // terminate the program. 
			return false;
		}
	}
		
	public static void addRecords() {
		// add contact information to the list. 
		
		try {
			while(fileInput.hasNextLine()) {
				// get user input to add contact to list. 
				System.out.print("\n\nEnter contact first name: ");	
				String firstName = input.next();
				System.out.print("\nEnter contact last name: ");
				String lastName = input.next();
				System.out.print("\nEnter contact phone number: "); 
				String phoneNumber = input.next();
				System.out.print("\nEnter contact email address: ");
				String email = input.next();
				
				String[] contactInfo = { firstName, lastName, phoneNumber, email };
				
				List<String> newInput = Arrays.asList(contactInfo);
				System.out.printf("Unsorted array elements: %s%n", list);
				
				Collections.sort(list); // sort ArrayList
				System.out.printf("Sorted array elements: %s%n", list);
				
				// output new record to file.

		}
		catch (FormatterClosedException f) {
			System.err.println("Error writing to file. Terminating."); break;
		}
		catch (NoSuchElementException e) {
			System.err.println("Invalid input. Please try again.");
			input.nextLine(); // discard input so user can try again. 
		}
			
		System.out.println("Enter another contact? 0 for no, 1 for yes: ");
		switch(input.nextInt()) {
			case 0: moreInput = false; break;
			case 1: moreInput = true; break;
		}
			
			
		} // end while. 

		System.out.println();
	}
		
	public static void closeFile() {
		if(output != null) {
			output.close();
		}
	}

}