package day11whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
	/*
	 	Type java code by using while loop,
         Write a program that prompts the user to input an integer.
         It should then find sum of the digits of that number.
         	123 ==> 1+2+3 = 6
         	// x = abc
		int c = x % 10;
		int b = (int)((x / 10)) % 10;
		int a = (int)((x / 100)) % 10;
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = scan.nextInt();
		int sum = 0;
		while ( a != 0) {
			sum += a % 10;
			a = a/10;
		}
		System.out.println(sum);
		scan.close();
	}
	

}
