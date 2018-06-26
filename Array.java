import java.util.*;
public class Array {
	public static void main(String[] args) {
		String[] arr = new String[11];
		
		for (int i = 1; i < arr.length; i += 2) {
			//list.set(i, "");
			arr[i-1] = "";
			System.out.println("i is: " + (i-1) + arr[i-1]);
			System.out.println("i is: " + i + "\t"+arr[i]);
			
			//System.out.println("Index: " + i + "\tValue: " + list.get(i));
		}
	}
}