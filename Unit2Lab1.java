/**
 * This program displays the integer equivalents (ASCII) of uppercase and lowercase characters, 
 * the digits 0 through 9, the symbols +, -, _, =, &, @, #, $, ?, >, <, |, !, ~, 
 * and a blank space character.
 * @author Neil Kapoor
*/

import java.io.*;

public class Unit2Lab1 {
	public static void main(String[] args) {
		char [] lowercase = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		char [] uppercase = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		char [] symbols = { '+', '-', '_', '=', '&', '@', '#', '$', '?', '>', '<', '|', '!', '~' };
		char [] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		
		// for loops that loop through the alphabet and symbols arrays printing their ASCII values. 
		for (int i = 0; i < lowercase.length; i++) {
			System.out.printf("The character %c has the value %d\n", lowercase[i], ((int) lowercase[i]));
			System.out.printf("The character %c has the value %d\n", uppercase[i], ((int) uppercase[i]));
		}
		
		for (int i = 0; i < symbols.length; i++) {
			System.out.printf("The symbol %c has the value %d\n", symbols[i], ((int) symbols[i]));
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("The digit %c has the value %d\n", digits[i],  ((int) digits[i]) );
		}
				
		// prints blank space character ASCII value.
		System.out.printf("The blank space character %c has the value %d\n", ' ', ((int) ' '));
	}
}