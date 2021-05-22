package day12dowhilevariablesconstructors;

import java.util.Scanner;

public class DoWhile01 {
	/*
	 	Ask user to enter an integer
//  If the integer is even print on the console “You won!”
//	 Otherwise ask user to enter another integer
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;  // Posttest
		do {
			System.out.println("Enter a number");
			a = scan.nextInt();
		}while( a % 2 != 0);
		System.out.println("You won");  // Pretest
		scan.close();	
	}
}
