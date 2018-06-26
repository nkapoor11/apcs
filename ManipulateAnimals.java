/**
 * This program tests the Drawable, Rotatable, Resizable, and Sounds interfaces' methods using Animal and Vehicle objects. 
 * @author Neil Kapoor
*/

public class ManipulateAnimals {
	public static void main(String[] args) {
		// Create a collection of 2 vehicles and 2 animals stored in the same array. 
		Sounds [] array = { new Animal(), new Vehicle() };
		
		// Loop through the array and execute the drawObject(),
		// rotateObject(), resizeObject(), and playSound() methods polymorphically for each element in the array. 
		for (Sounds o : array) {
			o.drawObject(); o.rotateObject(); o.resizeObject(); o.playSounds();
			System.out.println();
		}
	}
}