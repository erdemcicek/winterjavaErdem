package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class Ternary03 {
	/*
	 * Ask user to enter an integer. If the number has 3 digits, output will be
“This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”
How can you decide the number of digits of an integer?
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = scan.nextInt();
		System.out.println((a >= 100 && a <= 999) || (a <= -100 && a >= -999) ? "This number has 3 digits" : "This number has no 3 digits");
		//System.out.println(result);
		
		// Second Question
		/*
		  Ask user to enter a String. If the String has 2 characters, output will be
		“It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations”
		 */
		System.out.println("Enter an abbreviation");
		String abbrev = scan.next();
		String result = abbrev.length() == 2 ? "Valid abbreviation" : "Invalid abbreviation";
		System.out.println(result);
		scan.close();
		
	}

}
