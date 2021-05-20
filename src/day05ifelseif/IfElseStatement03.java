package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement03 {
	/*
	 * Ask user to enter any name of the days, then get second ,fourth,
         and sixth letter of the day name and print them on the console,
         in the same line.
         For example; if the user enters “Monday” output will be “ody”
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of a day");
		String dayName = scan.next();
		
		if ( (dayName.equalsIgnoreCase("Monday")) || (dayName.equalsIgnoreCase("Tuesday")) || (dayName.equalsIgnoreCase("Wednesday")) ||
				(dayName.equalsIgnoreCase("Thursday")) || (dayName.equalsIgnoreCase("Friday")) || 
				(dayName.equalsIgnoreCase("Saturday")) || (dayName.equalsIgnoreCase("Sunday"))) {
			System.out.print(dayName.charAt(1));
			System.out.print(dayName.charAt(3));
			System.out.print(dayName.charAt(5));
		}
		else
			System.out.println("Please enter a valid day name");
		scan.close();
			
		
		//System.out.println( "" + dayName.charAt(1) + dayName.charAt(3) + dayName.charAt(5) ) ; // This is not recommended
		// instead of the way shown above use this one :
		//System.out.print(dayName.charAt(1));
		//System.out.print(dayName.charAt(3));
		//System.out.print(dayName.charAt(5));
		

	}

}
