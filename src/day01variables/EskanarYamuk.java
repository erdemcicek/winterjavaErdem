package day01variables;

import java.util.Scanner;

public class EskanarYamuk {
	/*
	 		    ***   3  2 3-1 0 1
	 		   *****  5  1 3-2 2 2
	 		  ******* 7  0 3-3 4 3
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int r = scan.nextInt();
		for ( int i = 1 ; i <= r ; i++) {
			for ( int j = r-i ; j > 0 ; j--) {
				System.out.print(" ");
			}
			for ( int j = 1 ; j <= r ; j++) {  // en ust sirada yazdirtacagim yildiz sayisi da r'ye odakli
				System.out.print("*");		   // yani illa 3 olmak zorunda degil artik
			}
			for ( int k = 2*i-2 ; k > 0 ; k-- ) { // son kisimdaki desen de i'ye odakli ve i 1 arttiginda
				System.out.print("*");			  // k 2 artiyor. i=1 iken bu dongu hic calismicak sonrasinda 2'ser articak
			}
			System.out.println();
		scan.close();
		}
			

	}

}
