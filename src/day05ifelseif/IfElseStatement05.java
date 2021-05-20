package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement05 {
	/*
	 * Type java code by using if-else if() statement.
	A school has following rules for grading system:
	1. Below 50 - D     2. 50 to 59 - C       3. 60 to 79 - B.     4. From 80 to 100 - A
	Ask user to enter marks and print the corresponding grade.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your mark");
		int mark = scan.nextInt();// 
		if ( (mark > 100) || ( mark <0))
			System.out.println("Please enter a valid mark");
		else if ( (mark <= 100) && (mark >= 80 ))
			System.out.println("Your grade is A");
		else if ( (mark < 80) && ( mark >= 60))
			System.out.println("Your grade is B");
		else if ( ( mark < 60) && ( mark >= 50))
			System.out.println("Your grade is C");
		else
			System.out.println("Your grade is D");
		scan.close();
	}
}
