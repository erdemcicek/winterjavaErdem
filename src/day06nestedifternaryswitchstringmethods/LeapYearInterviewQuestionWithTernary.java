package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class LeapYearInterviewQuestionWithTernary {
	/*
	 * Ask user to enter year
	Type java code by using if-else if() statement.
	Write a program to check if a year is leap year or not.
	if the year is divisible by 100 then it must be divisible by 400.
	If a year is not divisible by 100 then it must be divisible by 4.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year");
		int a = scan.nextInt(); // 'a' is year
		//String r = (a % 100 == 0) ? (a % 400 == 0 ? "leap year": "not leap year") : (a % 4 == 0 ? "leap year" : "not leap year") ;
		//System.out.println(r);
		System.out.println((a % 100 == 0) ? (a % 400 == 0 ? "leap year": "not leap year") : (a % 4 == 0 ? "leap year" : "not leap year"));
		scan.close();

	}

}
