package day10forloops;

import java.util.Scanner;

public class ForLoop05 {

	public static void main(String[] args) {
	drawTriangle();	

	}
	public static void drawTriangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer ");
		int s = scan.nextInt();
		//To run the inner codes for every row
		for ( int j = 1 ; j <= s ; j++) { // 1,2,3,4,...s
			// To draw space
			for ( int i = s-j ; i >0 ; i--) { // ...4,3,2,1
				System.out.print(" ");
			}
			// To draw "* "
			for ( int k = 1 ; k <= j ; k++ ) { // 1,2,3,4,...
				System.out.print("* ");
			}
			// To move pointer to the next line
			System.out.println();
		}
		scan.close();
	}

}
