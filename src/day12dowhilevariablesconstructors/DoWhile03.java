package day12dowhilevariablesconstructors;

import java.util.Scanner;

public class DoWhile03 {
	/*
	 	Ask user to enter password
		 If the password has more than 6 characters print "it is okay"
		 Otherwise, print "Make the password longer than 6 characters" and ask user to enter a new password
	 */

	public static void main(String[] args) {
	passCheck();	

	}
	public static void passCheck() {
		Scanner scan = new Scanner(System.in);
		String pass = "";
		do {
			System.out.println("Enter your password. ");
			pass = scan.next();
			if ( pass.length() > 6)
				System.out.println("It is okay");
			else
				System.out.println("Make the password longer than 6 characters");
		}while( pass.length() <= 6);
		scan.close();
	}

}
