package day01variables;

import java.util.Scanner;
/*
 	
E			69 5
D D			68 4
C C C		67 3
B B B B		66 2
A A A A A   65 1
 */

public class Erdem {
	public static void main(String[] args) {
		System.out.println("Erdem");  // 65 - 90
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character"); 				
		char c = scan.next().toUpperCase().charAt(0); 
		if ( c < 'A' || c > 'Z')
			System.out.println("Please enter an alphabet");
		else {
			int x = c - 64;						 
			for ( int i = 0 ; i < x ; i++) { 
				for ( int j = 0 ; j <= i ; j++) {
					System.out.print(((char)(c - i)) + " ");
				}
				System.out.println();
			}
			
		}
		scan.close();
		

	}
}
