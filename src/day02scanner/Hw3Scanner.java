package day02scanner;

import java.util.Scanner;

public class Hw3Scanner {
	/*
	  Type a program which converts the mile to kilometer. Mile value will be
	entered by user. (Use double)
	Hint 1: km = mile x 1.6
	Hint 2: To get double, use nextDouble()

	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a mile value: ");
		//double converted = scan.nextDouble() * 1.6;
		System.out.println("It makes " + scan.nextDouble() * 1.6 + " km." );
		scan.close();
		

	}

}
