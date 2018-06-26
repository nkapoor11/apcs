/**
 * This program generates 100 random numbers from the set { 6, 10, 14, 18, 22} and
 * displays the number of 6’s, 10’s, etc. that are generated.
 * @author Neil Kapoor
*/

import java.util.Random;

public class Unit5Activity1_4 {
	public static void main(String[] args) {
		int [] counts = new int[5]; // array to store count values for the sequence.
		
		
		Random randomNumbers = new Random(); // random class to cycle through random number sequence.
		
		for (int i = 0; i < 100; i++) { // 100 random numbers
			int num =  6 + 4 * randomNumbers.nextInt(5);
			
			switch(num) { // check what number was generated, and increment its count in the counts array.
				case 6: counts[0]++; break;
				case 10: counts[1]++; break;
				case 14: counts[2]++; break;
				case 18: counts[3]++; break;
				case 22: counts[4]++; break;
			}
		
		}
		System.out.println();
		// display results. 
		for(int i = 0, j = 6; i < counts.length; i++, j += 4) {
			System.out.println("Frequency of " + j + ": " + counts[i] );
		}
		
	}
}