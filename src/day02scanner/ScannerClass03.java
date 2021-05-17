package day02scanner;

import java.util.Scanner;

public class ScannerClass03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of ");
		double length = scan.nextDouble();
		
		System.out.println("Please enter the width of ");
		double width = scan.nextDouble();
		
		System.out.println("The area of the rectangle is " + length * width);
		System.out.println("The perimeter of the rectangle is " + (length + width) * 2);
		scan.close();
		

	}

}
