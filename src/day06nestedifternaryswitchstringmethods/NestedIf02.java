package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class NestedIf02 {
	/*
	 * Type java code by using nested if() statement.
	Ask user to enter a password
	If the initial of the password is uppercase then check if it is ‘A’ or not. If it is ‘A’ the output will be
	“Valid Password” otherwise the output will be “Invalid Password”
	If the initial of the password is lowercase then check if it is ‘z’ or not. If it is ‘z’ the output will be
	“Valid Password” otherwise the output will be “Invalid Password”
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the password");
		String password = scan.nextLine();
		char ch = password.charAt(0);
		if ( (ch >= 'A') && (ch <= 'Z')) {
			if ( ch == 'A')
				System.out.println("Valid Password");
			else
				System.out.println("Invalid Password");
		}else if ((ch >= 'a') && (ch <= 'z')) {
			if ( ch == 'z')
				System.out.println("Valid Passwor");
			else
				System.out.println("Invalid Password");
		}else
			System.out.println("Please enter your password by using characters in alphapet");
		scan.close();

	}

}
