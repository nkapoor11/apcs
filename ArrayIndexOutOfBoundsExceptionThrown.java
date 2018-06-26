/**
 * This program illustrates the ArrayIndexOutOfBoundsException when it is thrown. 
 * @author Neil Kapoor
*/

public class ArrayIndexOutOfBoundsExceptionThrown {
	public static void main(String[] args) {
		int [] nums = { 0, 1, 2 };
		// iterate through the array one extra time beyond the valid array indices. 
		for (int i = 0; i <= nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}