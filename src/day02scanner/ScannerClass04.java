package day02scanner;

import java.util.Scanner;

public class ScannerClass04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the length of the prism");
		double length = scan.nextDouble();
		
		System.out.println("Please enter the width of the prism");
		double width = scan.nextDouble();
		
		System.out.println("Please enter the height of the prism");
		double height = scan.nextDouble();
		System.out.println("The volume of the prism is " + (length*width*height));
		scan.close();
		


	}

}
