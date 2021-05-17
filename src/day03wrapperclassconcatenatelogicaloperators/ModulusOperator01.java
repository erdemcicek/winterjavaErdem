package day03wrapperclassconcatenatelogicaloperators;

import java.util.Scanner;

public class ModulusOperator01 {
	
	/*
	  Ask user to enter 3 digit integer.
	Type a program to find the sum of the digits
	For example; 438 ==> 4+3+8 = 15
	  */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a 3 digit integer ");
		int x = scan.nextInt();
		// x = abc
		int c = x % 10;
		int b = (int)((x / 10)) % 10;
		int a = (int)((x / 100));
		System.out.println(a + b + c);
		scan.close();
		

	}

}
