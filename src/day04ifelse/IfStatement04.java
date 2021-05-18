package day04ifelse;
import java.util.Scanner;
public class IfStatement04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length");
		double length = scan.nextDouble();
		System.out.println("Please enter the width");
		double width = scan.nextDouble();
		if ( length <= 0 || width <= 0)
			System.out.println("Please enter positive values");
		else if ( length == width)
			System.out.println("This is a square");
		else
			System.out.println("This is not a square");
		scan.close();
// It can be done also if ( width < 0 || length < 0 ) 
//						else ( if width == length , else) 	* it is more logical I think 
// Java comes from top to bottom. It executes first and third statement at the same time , which doesn't make sense. That's why
// we need to use 'else if' statement. 
// sensible = raisonable(fr)   -    sensitive = sensible(fr) 
	}

}
