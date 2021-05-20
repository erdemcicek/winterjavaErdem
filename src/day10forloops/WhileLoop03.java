package day10forloops;

import java.util.Scanner;

public class WhileLoop03 {

	public static void main(String[] args) {
		/*
		 	Get an integer from user and calculate the factorial
		 	Use while loop
		 */
	factorial();
	}
	public static void factorial() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to calculate factorial");
		int a = scan.nextInt();
		int x = 1;
		int result = 1;
		while ( x <= a ) {
			result *= x;
			x++;
		}
		System.out.println(result);
		scan.close();
	}

}
