/**
 * This program is the driver program for ArrayTools class. This program provides three "tester" arrays of different types 
 * to test the methods of the ArrayTools class. 
 * @author Neil Kapoor
*/

public class ArrayToolsTest2 {
	public static void main(String[] args) {
		char[] a = {'a', 'B', 'f', 'e'};
		char[] a2 = {'a', 'B', 'f', 'e'};
		
		int [] b = {5, 2, 1, 6, 7 };
		int [] b2 = {5, 2, 1, 6, 7 };
		
		double [] c = {5.1, 3.1};
		double [] c2 = {3.1, 5.1};
		
		ArrayTools2 array = new ArrayTools2();
		
			
		System.out.println("\nTest equals() methods:");
		System.out.println(array.equals(a, a2));
		System.out.println(array.equals(b, b2));
		System.out.println(array.equals(c, c2) + "\n");
		
		System.out.println("Test find() methods:");
		System.out.println(array.find(a, 'B'));
		System.out.println(array.find(b, 1));
		System.out.println(array.find(c, 5.1));
		
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
		System.out.println(array.average(c) + "\n"); 
		
		array.sort(a);
		array.sort(b);
		array.sort(c);
		// print sorted arrays.
		System.out.println("\nSorted arrays:\n");
		for( char cc : a)
			System.out.print(cc + " ");
		System.out.println();
		for( int num : b)
			System.out.print(num + " ");
		System.out.println();
		for( double x : c)
			System.out.print(x + " ");
		System.out.println();
		
	}
}

