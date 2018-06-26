/**
 * This program prompts the user to enter four integer test scores for each of
 * three students. For each of the students, calculate and display the minimum test score,
 * the maximum test score, the average of the test scores, and a letter grade A, B, C, D, F. 
 * @author Neil Kapoor
*/
import java.util.Scanner;

public class Unit5Lab3_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// use arrays to store test scores for each student.
		int [] s1 = new int[4];
		int [] s2 = new int[4];
		int [] s3 = new int[4];
		int [] [] students = { s1, s2, s3};
		// get user input.
		System.out.print("Enter four integer test scores for student 1: ");
		for (int i = 0; i < 4; i++) {
			s1[i] = input.nextInt();
		}
		
		System.out.print("Enter four integer test scores for student 2: ");
		for (int i = 0; i < 4; i++) {
			s2[i] = input.nextInt();
		}
		
		System.out.print("Enter four integer test scores for student 3: ");
		for (int i = 0; i < 4; i++) {
			s3[i] = input.nextInt();
		}
		
		System.out.println(); 
		// use for loop to display maximum, minimum, average, and grade for the three students using arrays.
		for (int i = 0; i < students.length; i++) {
			
			System.out.println("Minimum score for student " + (i + 1) + ": " + minimum(students[i][0], students[i][1], students[i][2], students[i][3]));
			System.out.println("Maximum score for student " + (i + 1) + ": " + maximum(students[i][0], students[i][1], students[i][2], students[i][3]));
			
			double average = average(students[i][0], students[i][1], students[i][2], students[i][3]);
			
			System.out.println("Average score for student " + (i + 1) + ": " + average);
			System.out.println("Grade for student " + (i + 1) + ": " + grade(average));
			System.out.println(); 
			
		}		
		
	}
	public static double average(int a, int b, int c, int d) {
		double average = (a + b + c + d) / 4.0;
		average = Math.floor(average * 10 + .5) / 10;
		return average;
	}
	public static String grade(double a) {
		int b = (int)(a);
		if (b >= 90) return "A";
		else if (b >= 80) return "B";
		else if (b >= 70) return "C";
		else if (b >= 65) return "D";
		else return "F";
	}
	
	public static double minimum(double a, double b, double c, double d) {
		double min = 0;
		boolean isTrue = true;
		min = a;
		while ( (min > b) && isTrue ) {
			min = b;
			isTrue = false;
		}
		isTrue = true;
		while ( (min > c) && isTrue) {
			min = c;
			isTrue = false;
		}
		isTrue = true;
		while( (min > d) && isTrue) {
			min = d;
			isTrue = false;
		}
		return min;
	}
	
	public static double maximum(double a, double b, double c, double d) {
		double max = 0;
		boolean isTrue = true;
		max = a;
		while ( (max < b) && isTrue ) {
			max = b;
			isTrue = false;
		}
		isTrue = true;
		while ( (max < c) && isTrue) {
			max = c;
			isTrue = false;
		}
		isTrue = true;
		while ( (max < d) && isTrue) {
			max = d;
			isTrue = false;
		}
		return max;
	}
}