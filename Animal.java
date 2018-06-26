/**
 * This program models an animal. 
 * @author Neil Kapoor
*/

public class Animal implements Sounds {
	private String name;
	
	/**
 	 * @pre name is valid variable. 
	 * @post name assigned empty String. 
	*/
	public Animal() {
		name = "";
	}
	
	/**
 	 * @pre n is valid variable. 
	 * @post name assigned n. 
	*/
	public Animal(String n) {
		name = n;
	}
	
	/**
 	 * @pre name is valid variable. 
	 * @post name is returned. 
	*/
	public String getName() { return name; }
	
	/**
 	 * @pre n is valid variable. . 
	 * @post name assigned n. 
	*/
	public void setName(String n) {
		name = n;
	}
	
	/**
 	 * @pre none. 
	 * @post statement printed. 
	*/
	public void drawObject() {
		System.out.println("Drawing an Animal");
	}
	
	/**
 	 * @pre none. 
	 * @post statement printed. 
	*/
	public void rotateObject() {
		System.out.println("Rotating an Animal");
	}
	
	/**
 	 * @pre none. 
	 * @post statement printed. 
	*/
	public void resizeObject() {
		System.out.println("Resizing an Animal");
	}
	
	/**
 	 * @pre none. 
	 * @post statement printed. 
	*/
	public void playSounds() {
		System.out.println("Animal sound");
	}
}