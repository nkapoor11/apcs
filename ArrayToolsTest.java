/**
 * This program is the driver program for ArrayTools class. This program provides three "tester" arrays of different types 
 * to test the methods of the ArrayTools class. 
 * @author Neil Kapoor
*/

public class ArrayToolsTest {
	public static void main(String[] args) {
		char[] a = {'a', 'B', 'f', 'e'};
		int [] b = {5, 2, 1, 6, 7 };
		double [] c = {5.1, 3.1};
		
		ArrayTools array = new ArrayTools();
		
		System.out.println("\nMinimums:");
		System.out.println(array.minimum(a));
		System.out.println(array.minimum(b));
		System.out.println(array.minimum(c));
		
		System.out.println("\nMaximums:");
		
		System.out.println(array.maximum(a));
		System.out.println(array.maximum(b));
		System.out.println(array.maximum(c));
		
		System.out.println("\nMinimum at indices:");
		System.out.println(array.minimumAt(a));
		System.out.println(array.minimumAt(b));
		System.out.println(array.minimumAt(c));
		
		System.out.println("\nMaximum at indices:");
		System.out.println(array.maximumAt(a));
		System.out.println(array.maximumAt(b));
		System.out.println(array.maximumAt(c));

   		System.out.println("\nAverages:");
		System.out.println(array.average(b));
		System.out.println(array.average(c));
	}
}

