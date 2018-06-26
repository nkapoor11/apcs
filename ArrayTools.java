/**
 * This program delineates all the methods to return minimums, maximums, their locations, and averages of an array. 
 * @author Neil Kapoor
*/

import java.util.Arrays;
public class ArrayTools {
	char minimum( char array[] ) {
		Arrays.sort(array);
		return array[0];
	}

	int minimum( int array[] ) {
		Arrays.sort(array);
		return array[0];
	}
	double minimum( double array[] ) {
		Arrays.sort(array);
		return array[0];
	}
	
	char maximum( char array[] ) {
		Arrays.sort(array);
		return array[array.length - 1];
	}
	int maximum( int array[] ) {
		Arrays.sort(array);
		return array[array.length - 1];
	
	}
	double maximum( double array[] ) {
		Arrays.sort(array);
		return array[array.length - 1];
	}
	
	int minimumAt( char array[] ) {
		// make a copy of array[]. 
		char [] copyArray = new char[array.length];
		System.arraycopy(array, 0, copyArray, 0, array.length);
		// Use this "destination array" to find the minimum value. 
		Arrays.sort(copyArray);
		char min = copyArray[0]; // smallest value in the sorted array.
		int index = Arrays.binarySearch(array, min);
		return index;
	}
	
	int minimumAt( int array[] ) {
		// make a copy of array[]. 
		int [] copyArray = new int[array.length];
		System.arraycopy(array, 0, copyArray, 0, array.length);
		// Use this "destination array" to find the minimum value. 
		Arrays.sort(copyArray);
		int min = copyArray[0]; // smallest value in the sorted array.
		int index = Arrays.binarySearch(array, min);
		return index;
	}
	int minimumAt( double array[] ) {
		// make a copy of array[]. 
		double [] copyArray = new double[array.length];
		System.arraycopy(array, 0, copyArray, 0, array.length);
		// Use this "destination array" to find the minimum value. 
		Arrays.sort(copyArray);
		double min = copyArray[0]; // smallest value in the sorted array.
		int index = Arrays.binarySearch(array, min);
		return index;
	
	}
	
	int maximumAt( char array[] ) {
		// make a copy of array[]. 
		char [] copyArray = new char[array.length];
		System.arraycopy(array, 0, copyArray, 0, array.length);
		// Use this "destination array" to find the minimum value. 
		Arrays.sort(copyArray);
		char max = copyArray[copyArray.length - 1]; // smallest value in the sorted array.
		int index = Arrays.binarySearch(array, max);
		return index;
	}
	int maximumAt( int array[] ) {
		// make a copy of array[]. 
		int [] copyArray = new int[array.length];
		System.arraycopy(array, 0, copyArray, 0, array.length);
		// Use this "destination array" to find the minimum value. 
		Arrays.sort(copyArray);
		int max = copyArray[copyArray.length - 1]; // smallest value in the sorted array.
		int index = Arrays.binarySearch(array, max);
		return index;
	}
	int maximumAt( double array[] ) {
		// make a copy of array[]. 
		double [] copyArray = new double[array.length];
		System.arraycopy(array, 0, copyArray, 0, array.length);
		// Use this "destination array" to find the minimum value. 
		Arrays.sort(copyArray);
		double max = copyArray[copyArray.length - 1]; // smallest value in the sorted array.
		int index = Arrays.binarySearch(array, max);
		return index;
	}
	
	double average( int array[] ) {
		double total = 0;
		for (int num : array) {
			total += num;
		}
		return total / array.length;
	}
	double average( double array[] ) {
		double total = 0;
		for (double num : array) {
			total += num;
		}
		return total / array.length;
	}

} 