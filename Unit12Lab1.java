/**
 * This program uses an ArrayList to display the properties of various grocery items.
 * @author Neil Kapoor
*/

import java.util.*; // import package. 

public class Unit12Lab1 {
	public static void main(String[] args) {
		// create ArrayList.
		ArrayList<GroceryItem> groceries = new ArrayList<GroceryItem>();
		
		// initialize variables. 
		long rnSeed = 0;
		int shelfLife = 0;
		Random rnGenerator = new Random(rnSeed); // creates Random object.
		int count = 0; // counts number of items with shelf life less than 7 days (inclusive)
		
		// add GroceryItem objects into ArrayList. 
		for (int i = 0; i < 50; i++) {
			shelfLife = rnGenerator.nextInt(30) + 1; // next int in range 1 to 30. 
			groceries.add(new GroceryItem(i, shelfLife));
			
			if (shelfLife <= 7) {
				count++; // count number of items with shelf life less than 7 days (inclusive). 
			}
		}
		// display the number of items with a shelf life greater than seven days, the
		// number of items with a shelf life of 7 days or less, and display each list of items.
		System.out.println("Number of items with a shelf life greater than seven days: " + (50 - count));
		System.out.println("Number of items with a shelf life of 7 days or less: " + count + "\n");
		
		// seven days or less.
		System.out.println("List of items with a shelf life of seven days or less: ");
		for (int j = 0; j < groceries.size(); j++) {
			if (groceries.get(j).getShelfLife() <= 7) {
				System.out.println("Item code: " + groceries.get(j).getItemCode() + "\t" + " Shelf life: " + groceries.get(j).getShelfLife());
			} 
		}	
			
		// greater than seven days. 	
		System.out.println("List of items with a shelf life of seven days or less: ");
		for (int k = 0; k < groceries.size(); k++) {
			if (groceries.get(k).getShelfLife() > 7) { 
				System.out.println("Item code: " + groceries.get(k).getItemCode() + "\t" + "Shelf life: " + groceries.get(k).getShelfLife());
			}
		}
		
		
	}
}


