package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class HomeworkNestedIfElse {
	/*
	 * Type java code by using nested if statement,
If the number is even then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
“Perfect even number” otherwise, the output will be “Good even number.”
If the number is odd then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
“Perfect odd number” otherwise, the output will be “Good odd number.”

	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scan.nextInt();
		
		// 1.Way : nested if-else
//		if ( a % 2 == 0) {
//			if ( a % 3 == 0) {
//				System.out.println("Perfect even number");
//			}else {
//				System.out.println("Good even number");
//			}
//		}else {
//			if ( a % 3 == 0) {
//				System.out.println("Perfect odd number");
//			}else {
//				System.out.println("Good odd number");
//			}
//		}
		//2.Way : Nested Ternary
		String result = ( a % 2 == 0) ? ( a % 3 == 0  ? "Perfect even number"  : "Good even number"  ) 
									: ( a % 3 == 0  ? "Perfect odd number"    :  "Good odd number"   );
		System.out.println(result);
		scan.close();
		

	}

}
