package day10forloops;

import java.util.Scanner;

public class ForLoop02 {
	/*
	 * 1)Ask user to enter a String
		 2)Check the String if it is “Palindrome” or not
	 */

	public static void main(String[] args) {
		checkPalindrome();	
	}
	public static void checkPalindrome() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to see if it is palindrome ");
		String a = scan.nextLine();
		boolean isPalindrome = true;
		for ( int i = 0 ; i <= a.length()-1 ; i++ ) {
			if ( a.charAt(i) != a.charAt(a.length()-1 -i)) {
				isPalindrome = false;
			}
		}
		System.out.println( a + " is " + ((isPalindrome)?(""):("not ")) + "a palindrome");
	scan.close();
	}
}
