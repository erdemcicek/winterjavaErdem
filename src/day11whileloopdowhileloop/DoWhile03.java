package day11whileloopdowhileloop;

import java.util.Scanner;

public class DoWhile03 {
	/*
	 	For the String "1234_?!abcdef", type a code to count the number of letters,
	 the number of digits and the number of others by using do-while loop
	 */

	public static void main(String[] args) {
		
		countChars();
	}
	public static void countChars() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to see the numbers of letters , digits and other characters");
		String s = scan.nextLine();
//		String letters = "", numbers = "", others = "";
		int i = 0, countLetter = 0, countDigit = 0, countOther = 0;
		
		do {
			char c = s.charAt(i);
			if ( (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') ) {
//				letters += c;
				countLetter++;
				i++;
			}else if ( c >= '0' && c <= '9') {
//				numbers += c;
				countDigit++;
				i++;
			}else {
				countOther++;
//				others += c;
				i++;
			}
			
		}while( i < s.length());
//		System.out.println("The number of letters is : " + letters.length());
//		System.out.println("The number of digits is : " + numbers.length());
//		System.out.println("The number of other characters is : " + others.length());
		System.out.println("The number of letters is : " + countLetter);
		System.out.println("The number of digits is : " + countDigit);
		System.out.println("The number of other characters is : " + countOther);
		scan.close();

	}

}
