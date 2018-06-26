/**
 * This program illustrates the ArrayIndexOutOfBoundsException when it is caught. 
 * @author Neil Kapoor
*/

public class ArrayIndexOutOfBoundsExceptionCatch {
	public static void main(String[] args) {
		try {
			int [] nums = { 0, 1, 2 };
			// iterate through the array one extra time beyond the valid array indices. Then, catch the exception.
			for (int i = 0; i <= nums.length; i++) {
				System.out.println(nums[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error. ArrayIndexOutOfBoundsException caught. Index is equal to length of array.");
		}
		
	}
}