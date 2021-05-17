package day02scanner;

public class OrderOfOperation01 {
	/*
	 For mathematical operations we have some rules about order of operation
	 1) do exponential operations
	 2) do the operations inside the parenthesis
	 3) complete multiplication and division operations
	 4) complete addition and subtraction operations
	 */

	public static void main(String[] args) {
		int result1 = 5 + 2 * ( 16 - 2 * 5 );
		System.out.println(result1);
		
		int a = 8 + 2 * (24 / 3 - 2 * 3 ) + 1; // 13
		int b = 4 * 3 - 3 * ( 2 + 2 * 3);      // -12
		System.out.println(a + a * b);         // -143
		
		// Modulus operator (%) is used to find the reminder
		// Modulus is used to find the digit of a number
		int c = 2345678;
		// What is the last digit of number c?
		System.out.println( c % 10);
 
	}

}
