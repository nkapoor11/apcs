/**
 * This program reads a text file and counts the number of characters, words, sentences,
and paragraphs. A blank space or tab character should be used to delimit a word, a period (.)
should be used to delimit a sentence, and a newline character should be used to delimit a
paragraph. 
 * @author Neil Kapoor
*/
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WordCount {
	// reads a text file
	private static Scanner input;
	private static Scanner input2;
	private static Scanner input3;
	private static Scanner input4;
	static String fileName;
	static String counts;
	static boolean doCharacterCount = false;
	static boolean doSentenceCount = false;
	static boolean doWordCount = false;
	static boolean doParagraghCount = false;
	public static void main(String[] args) {
		// invoked by:  –[c][w][s][p] filename
		// e.g.  –cws f.txt
		if (args.length == 1) {
			// all counts should be done on the file.
			fileName = args[0];
			doCharacterCount = true;
			doSentenceCount = true;
			doWordCount = true;
			doParagraghCount = true;
		} else {
			counts = args[0];
			counts = counts.substring(1, counts.length());
			
			if (counts.contains("c")) {
				doCharacterCount = true;
			}
			if (counts.contains("w")) {
				doWordCount = true;
			}
			if (counts.contains("s")){
				doSentenceCount = true; 
			} 
			if (counts.contains("p")){
				doParagraghCount = true; 
				
			}
			fileName = args[1];
		}
		openFile();
		readRecords(doCharacterCount, doSentenceCount, doWordCount, doParagraghCount);
		System.out.println();
		closeFile();
	}
	// open file clients.txt
	public static void openFile() {
		try {
			input = new Scanner(Paths.get(fileName));
			input2 = new Scanner(Paths.get(fileName));
			input3 = new Scanner(Paths.get(fileName));
			input4 = new Scanner(Paths.get(fileName));
		}
		catch (IOException ioException) {
			System.err.println("Error opening file. Terminating.");
			System.exit(1);
		}
	}
		
	// read record from file
	public static void readRecords(boolean doCC, boolean doSC, boolean doWC, boolean doPC) {
		int numWords = 0;
		int numS = 0; 
		int numChars = 0;
		int numParas = 0;
		
		try {
			if (doSC) {				
				while(input.hasNextLine()) { 
					String line = input.nextLine();
					String[] tokens1 = line.split("[.]");
					numS += tokens1.length;	
				}	
				System.out.println("\nSentence count: " + numS);
			}

			if (doWC) {
				while(input2.hasNextLine()) { 
					// display record contents.
					String sentence = input2.nextLine();
					String[] tokens = sentence.split(" ");
					numWords += tokens.length;
				}		
			System.out.println("\nWord count: " + numWords);
	
			} 
			
			if (doCC) {
				while(input3.hasNextLine()) { 
					// display record contents.
					String sentence = input3.nextLine();
					String[] tokens = sentence.split(" ");
					for(String token : tokens) {
						numChars += token.length();
					}
				}	
				System.out.println("\nCharacter count: " + numChars);		
			} 
			
			if (doPC) {
				while(input4.hasNextLine()) { 
					// display record contents.
					String sentence = input4.nextLine();
					String[] tokens = sentence.split("\n");
					numParas += tokens.length;
				}	
				System.out.println("\nParagraph count is: " + numParas);		
			} 
		}
		catch (NoSuchElementException elementException) {
			System.err.println("File improperly formed. Terminating.");
		}
		catch (IllegalStateException stateException) {
			System.err.println("Error reading from file. Terminating.");
		} 
	} // end method readRecords

	// close file and terminate application.
	public static void closeFile() {
		if (input != null)
			input.close();
			input2.close();
			input3.close();
	}
} // end class WordCount.