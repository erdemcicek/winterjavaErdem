package day10forloops;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
	sumOfAllInt();
	}
		// Find the sum of all integers from 10 to 200
	public static void sumOfAllInt(){
//		int sum = 0;
//		for ( int i = 10 ; i <= 200 ; i++) {
//			sum+=i;
//		}System.out.println(sum);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to see if it is prime");
		int a = scan.nextInt();
		boolean isPrime = true;
		for ( int i = 2 ; i < a ; i++) {
			if ( a % i == 0){
				isPrime = false;break;
			}
		}
		System.out.println(isPrime);
		scan.close();
	} // 10/3  1 reminder

	

}
