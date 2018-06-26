/**
 * This class contains the code to create GroceryItem objects and its getter methods. 
 * @author Neil Kapoor
*/

public class GroceryItem {
	// properties. 
	private int itemCode;
	private int shelfLife;
	
	public GroceryItem() {	} // default constructor
	
	public GroceryItem(int i, int s) {n // parameterized constructor.
		itemCode = i;
		shelfLife = s;
	}
	
	/**
 	 * @pre shelfLife variable valid. 
	 * @post shelfLife returned. 
	*/
	public int getShelfLife() {
		return shelfLife;
	}
	
	/**
 	 * @pre itemCode variable valid. 
	 * @post itemCode returned. 
	*/
	public int getItemCode() {
		return itemCode;
	}
}