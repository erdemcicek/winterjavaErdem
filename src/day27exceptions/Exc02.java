package day27exceptions;

import java.util.Scanner;

public class Exc02 {

	public static void main(String[] args) {
//		Get a String from user
//	 	Convert it to an integer
//	 	Return the integer after multiplying by 2
//	 	Your code should not be blocked for any String

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scan.next();
		System.out.println(returnInteger(s));
		
		scan.close();	
	}
	public static int returnInteger(String s) {
		
		int a = 0;
		try {
			a = Integer.parseInt(s);
			return 2*a;
		}catch(NumberFormatException e) {
			System.out.println(s + " cannot be converted to integer");
		}
		return 2*a;
	}

}
