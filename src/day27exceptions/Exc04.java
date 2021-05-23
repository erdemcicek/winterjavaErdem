package day27exceptions;

import java.util.Scanner;

public class Exc04 {
	//

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age to see on the console");
		int age = scan.nextInt();
		
		System.out.println(getAge(age));
		
		scan.close();

	}
	public static int getAge(int age) {
		try {
			if ( age < 0 ) {
				// how to throw "explicit exception"
				// when we type a code, if we need to throw exception in anywhere, and any times you can throw
				// use "throw" keyword, then "new" keyword and the "constructor"
				throw new IllegalArgumentException(); // How to throw "explicit exception"
			}
		}catch(IllegalArgumentException e){
			System.out.println("Negative values cannot be used in ages...");
		}
		return age;
	}
	

}
