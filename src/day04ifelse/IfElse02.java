package day04ifelse;

import java.util.Scanner;

public class IfElse02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 65 - 90   A-Z
		// 97 - 122  a-z
		System.out.println("Please enter a character");
		char ch = scan.next().charAt(0);
		
		if ( (ch >= 'a' && ch <= 'z') || ( ch >= 'A' && ch <= 'Z'))
				System.out.println("It's in the alpabet");
		else
			System.out.println("It's not in the alpabet");
		scan.close();
		
		/* char ch = scan.next().toLowerCase().charAt(0) is also possible. In this case we wouldn't need to use 
		   || ( ch >= 'A' && ch <= 'Z' ) 
		 */
			
		
	}

}
