/**
 * This program implements Bubble sort. 
 * It is an O(n^2) algorithm because for every element in the array, it must be verified where it should be in the array relative to 
 * every other element, resulting in nested for loops and n^2 efficiency. 
 * @author Neil Kapoor
*/

public class Bubble {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 8, 7, 2, 1, 9 }; // array to be sorted. 
		bubbleSort(arr);
		// print results. 
		for (int k : arr)
			System.out.print(k);
		
		System.out.println();
	}
	
	/**
 	 * @pre arr array valid. 
	 * @post array sorted in increasing order. 
	*/
	public static void bubbleSort(int[] arr) {
		// there are n^2 iterations. 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j+1]) {
					// swap indexes. 
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}