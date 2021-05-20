package day10forloops;

//import java.util.Scanner;

public class ForLoop01 {
	/*
	 	Print all even integer from 100 to 23 on the console in the same line with a space among them
	 */
	/*
	 	Print all integers which are divisible by 5 from 100 to 23 on the console in the same line with a space among them 
	 */

	public static void main(String[] args) {
//		printEvenInt1();
//		printEvenInt2();
//		printDivByFive();
		printStringInReverseOrder();
		
	}
	public static void printEvenInt1() {
		for (int i = 100 ; i > 23 ; i-=2) {
			System.out.print(i + " ");
		}
	}
	public static void printEvenInt2() {
		for ( int j = 100 ; j > 22 ; j--) {
			if ( j % 2 == 0) {
				System.out.print(j + " ");
			}
		}
	}
	public static void printDivByFive() {
		for ( int k = 100 ; k > 22 ; k-=5)
			System.out.print(k + " ");
	}
	/*
	 * 1)Ask user to enter a String
		 2)Print the String reverse
		 For example; Germany ===> ynamreG
	 */

	public static void printStringInReverseOrder() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a String to see it in reverse order");
//		String a = scan.nextLine();
//		
//		for ( int i = a.length()-1 ; i >=0 ; i--) {
//			System.out.print(a.charAt(i));
//		}
//		scan.close();
//		for ( int i = 0 ; i < 6 ;i++) {
//			System.out.println("Hello");
//		}
		String s = "Edward";
//		System.out.println(s.charAt(1));
		boolean isContain = false;
		for (int i = 0; i < s.length() ; i++) { // i = 0 , 1, 2, ...5
			if ( s.charAt(i) == 'a')
				isContain = true;
//			else if ( s.charAt(i) != 'a')
//				isContain = false;
		}
		
		System.out.println(isContain);
	}

	
}
