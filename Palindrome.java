/**
 * This program checks if a String array is a palindrome. 
 * @author Neil Kapoor
*/

public class Palindrome {
	public static void main(String[] args) {
		String[] arr = { "R", "A ?", "c", "e", "c", "a", "r. " };
		System.out.println(testPalindrome( arr));
	}
	
	public static boolean testPalindrome(String[] arr) {
		// ignore spaces and punctuation in the String. 
		for (int j = 0; j < arr.length; j++) {
			arr[j] = arr[j].replaceAll("\\W", "");
		}
		
		// now iterate recursively. 
		if (arr.length == 1) {
			return true;
		}
		else if (arr[0].toLowerCase().equals(arr[arr.length - 1].toLowerCase())) {
			String[] newArr = new String[arr.length-2];
			for (int i = 0; i < arr.length - 2; i++) {
				newArr[i] = arr[i+1];
			} 
			return testPalindrome(newArr);
		}
		else { 
			return false; 
		}
	}
}