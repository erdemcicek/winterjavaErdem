package day02scanner;

import java.util.Scanner;

public class ScannerClass06 {
	
	/* Ask user to enter his/her full name
	 * Then ask user to enter his/her spouse's first name
	 * Then ask user to enter his/her adress
	 * Then print them all on the console
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your full name");
		String fullName = scan.nextLine();
		System.out.println("Please enter your spouse's first name");
		String firstNameOfSpouse = scan.next();
		
		// After using nextLine, if you use any other method
		// type "scan.nextLine" once
		
		scan.next();
		
		System.out.println("Please enter your address");
		String address = scan.nextLine();
		System.out.println("Your name: " + fullName);
		System.out.println("The first name of your spouse: " + firstNameOfSpouse);
		System.out.println("Your address: " + address);
		scan.close();

		

	}

}
