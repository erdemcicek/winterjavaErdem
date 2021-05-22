package day11whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop02 {
	/*
	 	Type java code by using while loop,
         Write a program to count the factors of an integer which is entered by user.
         Factors of 12 = 1, 2, 3, 4, 6, 12
         
        Suppose user entered 3000. If we use ( i <= num ) , our code will have to check the numbers between 1500 and 3000 . 
        I think it'd be enough to check until half of the number. 
	 */

	public static void main(String[] args) {
		countFactor();

	}
	public static void countFactor() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = scan.nextInt();
		System.out.print("Factors of " + a + " :");
		int i = 1;
		while ( i <= a/2) {
			if ( a % i == 0) {
				System.out.print(i + ", ");
			}
			i++;
		}
		System.out.print(a);
		scan.close();
	}

}
