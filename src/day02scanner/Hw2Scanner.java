package day02scanner;

import java.util.Scanner;

public class Hw2Scanner {
	/*
	      Type a program which calculates the perimeter of a triangle whose
		Side lengths are entered by user. (Use byte)
		Hint 1: Perimeter of a triangle is a + b + c
		Hint 4: To get byte, use nextByte()

	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the side lengths of triangle");
		byte a = scan.nextByte();
		byte b = scan.nextByte();
		byte c = scan.nextByte();
		System.out.println("The perimeter of the triangle is " + ( a + b + c ));
		scan.close();

	}

}
