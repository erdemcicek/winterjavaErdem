package day04ifelse;
import java.util.Scanner;
public class IfStatement01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer to check if it is even or odd");
		int num = scan.nextInt();
		
		if ( num % 2 == 0)
			System.out.println("The integer you've put is even");
		else
			System.out.println("The integer you've put is odd");
		scan.close();
		

	}

}
