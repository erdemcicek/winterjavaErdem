package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class Ternary01 {
	/*
	  Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even,
	the output will be �The integer is even�. If the integer is odd, the output will be �The integer is odd�.
	 */
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer...");
		int a = scan.nextInt();
		
		// Condition , Question Mark , Code will be executed if cond� is true , Colon ,  Code will be executed if cond� false
		// a % 2 == 0        ?                 "The integer is even"              :            "The integer is odd";
		
		String result1 = a % 2 == 0?"even":"odd";
		System.out.println(result1);
		
		/*
		  Type java code by using ternary.
		 Ask user to enter two integers. 
		 Write a program to print the minimum one on the console.
		 */
		
		// Second Question
		System.out.println("Enter 2 integers");
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int result2 = b > c ? c : b;
		System.out.println(result2);
		scan.close();
		
		
		
		
		
		
		
		
		
	}

}
