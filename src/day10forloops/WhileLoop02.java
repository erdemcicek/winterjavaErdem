package day10forloops;

import java.util.Scanner;

public class WhileLoop02 {

	public static void main(String[] args) {
		/*
		 Type java code by using while loop,
		 Write a program that prompts the user to input a positive integer.
		 It should then print the multiplication table of that number.
		 */
		multiplicationTable();
	}
	public static void multiplicationTable() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to see multiplication table");
		double d = scan.nextDouble();
		double i = 1;
		while ( i <= 10) {
			System.out.println(d + " x " + i + " = " + (d*i));
			i++;
		}
		scan.close();
	}

}
