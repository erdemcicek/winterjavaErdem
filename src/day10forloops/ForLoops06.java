package day10forloops;

import java.util.Scanner;

public class ForLoops06 {

	public static void main(String[] args) {
		/*
		               * * *
		                * *
		                 *
		 */
//	drawReverseTriange();
//	divSixEight();
	diamondShape();
	}
	public static void drawReverseTriange() {
		Scanner scan = new Scanner(System.in);   // 1,2,3,4
		System.out.println("Enter an integer");  // 4,3,2,1 stars
		int s = scan.nextInt();					 // 0,1,2,3 space
		for ( int i = s ; i > 0 ; i--) { // just how many times we have rows
			for ( int j = 0 ; j < s-i ; j++ ) { // for spaces 0,1,2,3
				System.out.print(" ");
			}
			for ( int k = s ; k > s-i ; k-- ) {		// for "* "
				System.out.print("* "); 
			}
			System.out.println();
		}
		scan.close();
		
		
		/*
		 	Create a method to print integers which are divisible by 6 and 8 from 500 to 25 on the console 
		 */
	}	
		
	public static void divSixEight() {
		int a = 500;
		while ( a >= 25) {
			if ( a % 6 == 0 && a % 8 == 0) {
				System.out.print(a + " ");
			}
			a--;
		}
		
		
	}
	public static void diamondShape() {
		
		Scanner scan2 = new Scanner(System.in); // 'f' does not change because I got it from user as an input
		System.out.println("Enter an integer");  // 'i' will be incremented in the main for loop,
		int f = scan2.nextInt();  // f = 4
		for ( int i = 1 ; i <= f ; i++) { // first 4 (equals to input)line with this for loop
			for ( int j = f-i; j>0; j--) { // this loop is to print spaces ; so should be descendant ; and 3 - 0
				System.out.print(" ");	    
			}
			for ( int k = 1 ; k <= i; k++) {  // this loop is to print * ; should be ascendant ; 1 -4 
				System.out.print("* ");
			}
			System.out.println(); // I entered 4 , so the first bottom row is  --> 1 space 3 stars
		}										//		  second bottom row is --> 2 space 2 stars
												//		  third bottom row is  --> 3 space 1 stars
		for ( int m = 1 ; m < f ; m++) { // last 3 ( input -1 ) line with this loop
			for ( int n = 1 ; n <= m ; n++) {  // to print spaces ; ascendant ; 1 - 3
				System.out.print(" ");
			}
			for ( int p = f-m ; p > 0 ; p--) {  // to print * ; descendant ; 3 -1
				System.out.print("* ");
			}
			System.out.println();
		}
		scan2.close();
		// input row sayisi
		// 
		
	}
		
	
		
		
		
		
		
		
	

}
