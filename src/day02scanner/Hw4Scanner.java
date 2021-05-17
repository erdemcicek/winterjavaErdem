package day02scanner;

import java.util.Scanner;

public class Hw4Scanner {
	/*
		  Type a program which converts the hours to seconds. Hours value will be
	entered by user. (Use long)
	Hint 1: second = hour x 60 x 60
	Hint 2: To get long, use nextLong()

	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a value for hour to convert to second");
		long second = scan.nextLong() * 3600;
		System.out.println("It makes " + second + " seconds");
		scan.close();
		

	}

}
