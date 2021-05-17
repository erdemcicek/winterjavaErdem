package day02scanner;

import java.util.Scanner;

public class Hw1Scanner {
	/*
	  Type a program which calculates the area and the perimeter of a circle
	whose radius is entered by user. (Use float)
	Hint 1: Take pi number as 3.14159
	Hint 2: Area of a circle is 3.14159 x radius x radius
	Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
	Hint 4: To get float, use nextFloat()

	 */

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the radius of the circle");
		float radius = scan.nextFloat();
		System.out.println("Area: " + (radius * radius * 3.14159) );
		System.out.println("Perimeter: " + ( radius * 2 * 3.14159));
		scan.close();
		
	}

}
