package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class Turnery04 {
	/*
	 * Ask user to enter an integer.
	 * If the integer is negative, return "This integer is negative"
	 * If the integer is positive, return its square.
	 * Use ternary
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = scan.nextInt();
		System.out.println(a >= 0 ? a * a : "This integer is negative");
		scan.close();
		
	
		

	}

}
