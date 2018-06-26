 /**
 * This program models a Name as having String firstName and String lastName.
 * It includes appropriate methods to make the Name class functional and easy to reuse.
 * @author Neil Kapoor
*/

public class Name {
	// initialize data fields.
	private String firstName;
	private String lastName;
	// default constructor.
	public Name() {
		firstName = "First";
		lastName = "Last";
	} 
	
	/**
 	 * @pre fname, lname variable is valid. 
	 * @post initializes data fields.
	*/
	public Name(String fname, String lname) { // paramterized constructor.
		firstName = fname;
		lastName = lname;
	}
	/**
 	 * @pre fname, lname variable is valid. 
	 * @post returns data fields.
	*/
	public void setName(String fname, String lname) {
		firstName = fname;
		lastName = lname;
	}
	/**
 	 * @pre firstName, lastName variable is valid. 
	 * @post returns data fields.
	*/
	public String getFullName() {
		return firstName + lastName;
	}
	/**
 	 * @pre firstName variable is valid. 
	 * @post returns firstName.
	*/
	public String getFirstName() {
		return firstName;
	}
	/**
 	 * @pre lastName variable is valid. 
	 * @post returns lastName.
	*/
	public String getLastName() {
		return lastName;
	}
}