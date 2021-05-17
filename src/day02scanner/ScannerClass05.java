package day02scanner;

import java.util.Scanner;

public class ScannerClass05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String firstName = scan.next();
		System.out.println("Please enter your last name: ");
		String lastName = scan.next();
		System.out.println(firstName + " " + lastName);
		scan.close();
		/* 
		 * nextLine() method gets full String which user entered
		for example if user enter a paragraph, nextLine() method will take all of the
		paragraph. 
		
		 *next() take, on the other hand, just the first word that user entered
		 
		 */
	}

}
