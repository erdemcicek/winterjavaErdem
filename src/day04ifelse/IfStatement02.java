package day04ifelse;
import java.util.Scanner;
public class IfStatement02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next(); //  char input = scan.next()toUpperCase().charAt() we can escape case-sensitivity that way
		if ( input.charAt(0) == 'S') 
			System.out.println("Saturday, Sunday");
		if ( input.charAt(0) == 'M')
			System.out.println("Monday");
		if ( input.charAt(0) == 'T')
			System.out.println("Tuesday, Thursday");
		if ( input.charAt(0) == 'W')
			System.out.println("Wednesday");
		if ( input.charAt(0) == 'F')
			System.out.println("Friday");
		scan.close();

	}

}
