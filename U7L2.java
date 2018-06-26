/**
 * This program contains a set of methods that converts numbers between different number systems.
 * @author Neil Kapoor
*/

public class U7L2 {
	public static void main(String[] args) {
		System.out.println(decimalToBinary( 167 ));
		System.out.println(decimalToHex(282));
		System.out.println(binaryToDecimal("10100111"));
		System.out.println(binaryToHex("00101111011110"));
	}
	
	public static String decimalToBinary( int decimalNumber ) {
		int quotient = -1;
		String remainder = "";
		while (quotient != 0) {
			quotient = decimalNumber / 2; // 6
			remainder =  decimalNumber % 2 + remainder;
			decimalNumber = quotient;
		}
		return remainder;
	}
	
	public static String decimalToHex( int decimalNumber ) {
		int quotient = -1;
		String remainder = "";
		while (quotient != 0) {
			quotient = decimalNumber / 16; // 7
			int num = decimalNumber % 16; // 11
			String hex = "";
			switch(num) {
				case 10: hex = "A"; break;
				case 11: hex = "B"; break;
				case 12: hex = "C"; break;
				case 13: hex = "D"; break;
				case 14: hex = "E"; break;
				case 15: hex = "F"; break;
			}
			if (num >= 10) {
				remainder = remainder + hex;
			} else {
				remainder = num + remainder;
			}
			decimalNumber = quotient;
		}
		return remainder;
	}
	
	public static int binaryToDecimal( String binaryString ) {
		String[] parts = binaryString.split("");
		int dec = 0;
		for (int i = 0; i < parts.length; i++) {
			dec += Integer.parseInt(parts[i]) * Math.pow(2, parts.length - (i + 1));
		}
		return dec;
	} 
	
	public static String binaryToHex( String binaryString )  {
		String chunk = "";
		int hex = 0;
		String strHex = "";
		String finalHex = "";
		while ( ((binaryString.length() % 4) != 0) ) {
			binaryString = "0" + binaryString;
		}
		for (int i = 0; i + 4 <= binaryString.length(); i += 4) {
			hex = 0;
			chunk = binaryString.substring(i, i + 4);
			String[] parts = chunk.split("");			
			for (int j = 0; j < parts.length; j++) {
				hex += Integer.parseInt(parts[j]) * Math.pow(2, parts.length - (j + 1));
			}
			switch(hex) {
				case 10: strHex = "A"; break;
				case 11: strHex = "B"; break;
				case 12: strHex = "C"; break;
				case 13: strHex = "D"; break;
				case 14: strHex = "E"; break;
				case 15: strHex = "F"; break;
			} 
			if (hex >= 10) {
				finalHex = finalHex + strHex;
			} else {
				finalHex = finalHex + Integer.toString(hex);
			}
			if ((finalHex.substring(0, 1)).equals("0")) {
				finalHex = finalHex.substring(1,finalHex.length());
			}
		} 
		return finalHex;
	} 
}