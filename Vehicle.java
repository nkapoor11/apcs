/**
 * This program models a Vehicle. 
 * @author Neil Kapoor
*/

public class Vehicle implements Sounds {
	private String name;
	private int age;
	
	/**
 	 * @pre name, age is valid variable. 
	 * @post name, age assigned empty String, zero value. 
	*/
	public Vehicle() {
		name = "";
		age = 0;
	}
	
	/**
 	 * @pre n, a is valid variable. 
	 * @post name, age assigned n, a. 
	*/
	public Vehicle(String n, int a) {
		name = n;
		age = a;
	}
	
	/**
 	 * @pre name is valid variable. 
	 * @post name returned. 
	*/
	public String getName() { return name; }
	
	/**
 	 * @pre n is valid variable. 
	 * @post name assigned n. 
	*/
	public void setName(String n) {
		name = n;
	}
	
	/**
 	 * @pre age is valid variable. 
	 * @post age is returned. 
	*/
	public int getAge() { return age; }
	
	
	/**
 	 * @pre a is valid variable. 
	 * @post age assigned a.
	*/
	public void setAge(int a) {
		age = a;
	}
	
	/**
 	 * @pre none. 
	 * @post statement printed. 
	*/
	public void drawObject() {
		System.out.println("Drawing a vehicle");
	}
	
	/**
 	 * @pre none. 
	 * @post statement printed. 
	*/
	public void rotateObject() {
		System.out.println("Rotating a vehicle");
	}
	
	/**
 	 * @pre none. 
	 * @post statement printed. 
	*/
	public void resizeObject() {
		System.out.println("Resizing a vehicle");
	}
	
	/**
 	 * @pre none. 
	 * @post statement printed. 
	*/
	public void playSounds() {
		System.out.println("Vehicle sound");
	}
}