package day11whileloopdowhileloop;

import java.util.Scanner;

public class DoWhile02 {
	/*
	 	Ask user to enter a number
		 If the number user entered is less than 10 print “Won!” on the console
		 Otherwise, ask user to enter a number again.
	 */

	public static void main(String[] args) {
		wonOrLoss();
	}
	public static void wonOrLoss() {
		Scanner scan = new Scanner(System.in);
		int a ;
		do {
			System.out.println("Enter an integer");	
			 a = scan.nextInt();
			 if ( a < 0)
				 System.out.println("Please enter positive numbers");
		}while( a > 9);
		System.out.println("Won");
		scan.close();
	}

}
