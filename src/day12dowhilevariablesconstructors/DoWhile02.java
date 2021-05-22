package day12dowhilevariablesconstructors;

import java.util.Scanner;

public class DoWhile02 {
	/*
	 	Ask user to enter his/her first name
		 If the initial is lower case print a message like "Make the initial upper case"
		 If the initial is upper case print a message like "You did it right"
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = "";
		boolean isLetter = true;
		do {
			System.out.println("Enter your first name");
			name = scan.next();
			for ( int i = 0 ; i < name.length() ; i++) {
				if (!(( name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || ( name.charAt(i) >= 'A' && name.charAt(i) <= 'Z'))) {
					isLetter = false;
				}
			}
			if ( name.charAt(0) > 'a' && name.charAt(0) < 'z')
				System.out.println("Make the initial upper case");
			if (!(isLetter))
				System.out.println("Please do not enter characters other than letters");
		}while( (name.charAt(0) < 'A' || name.charAt(0) > 'Z') || !(isLetter));
		System.out.println("You did it right");
		scan.close();
	}

}
