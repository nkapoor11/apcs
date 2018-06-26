/**
 * This class outlines the contact object and its attributes, setter/getter methods. 
 * @author Neil Kapoor
*/

public class Contact {
	private String fName;
	private String lName;
	private String email;
	private int phoneNumber;

	public Contact() { // default constructor
		fName = "";
		lName = "";
		email = "";
		phoneNumber = 0;
	}
	
	// parameterized constructor. 
	public Contact(String fName, String lName, String email, int phoneNumber) {
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	/**
 	 * @pre fName variable valid. 
	 * @post fName returned. 
	*/
	public String getfName() {
		return fName;
	}
	/**
 	 * @pre fName variable valid. 
	 * @post fName set to parameter arg. 
	*/
	public void setfName(String fName) {
		this.fName = fName;
	}
	/**
 	 * @pre lName variable valid. 
	 * @post lName returned. 
	*/
	public String getlName() {
		return lName;
	}
	/**
 	 * @pre lName variable valid. 
	 * @post lName set to parameter arg. 
	*/
	public void setlName(String lName) {
		this.lName = lName;
	}
	/**
 	 * @pre email variable valid. 
	 * @post email returned. 
	*/
	public String getEmail() {
		return email;
	}
	/**
 	 * @pre email variable valid. 
	 * @post email set to parameter arg. 
	*/
	public void setEmail(String email) {
		this.email = email;
	}
	/**
 	 * @pre phoneNumber variable valid. 
	 * @post phoneNumber returned. 
	*/
	public int getPhoneNumber() {
		return phoneNumber;
	}
	/**
 	 * @pre phoneNumber variable valid. 
	 * @post email set to parameter arg.
	*/
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
