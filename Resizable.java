/**
 * This interface can be used by any class that can be resized. 
 * @author Neil Kapoor
*/
public interface Resizable extends Rotatable {
	/**
 	 * @pre none. 
	 * @post blueprint to resize an object. 
	*/
	void resizeObject();
}