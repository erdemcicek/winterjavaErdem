package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class Ternary02 {
	/*
	 * Type java code by using ternary.
	Write a program to print absolute value of an integer entered by user.
	 */
	public static void main(String[] args) {
		/*
		 * Type java code by using using ternary.
	Take values of length and width of a rectangle from user and check if it is square or not.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length and width of rectangle");
		double length = scan.nextDouble();
		double width = scan.nextDouble();
		String isSquare = length == width ? "It is a square" : "It is a rectangle";
		System.out.println(isSquare);
		scan.close();
		
		
		
//		System.out.println("Enter an integer");  Ctrl + Shift + :
//		int a = scan.nextInt();
//		int absoluteValue = a >= 0 ? a : -a;
//		System.out.println(absoluteValue);
		
	}

}
