package day04ifelse;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a name of day");
		String day = scan.next();
		/*if ( (day == "Monday") || (day == "Tuesday") || (day == "Wednesday") || (day == "Thursday") || (day == "Friday" ) )
			System.out.println("Weekday");
		if ( (day == "Saturday") || (day == "Sunday"))
			System.out.println("Weekend");
		else
			System.out.println("Please enter a valid input");*/
		if ( (day.equalsIgnoreCase("Monday")) || (day.equalsIgnoreCase("Tuesday")) || (day.equalsIgnoreCase("Wednesday")) || (day.equalsIgnoreCase("Thursday")) ||  (day.equalsIgnoreCase("Friday")) )
			System.out.println("Weekday");
		else if ( (day.equalsIgnoreCase("Saturday")) || (day.equalsIgnoreCase("Sunday")) )
			System.out.println("Weekend");
		else
			System.out.println("Please enter a valid input");
		scan.close();
// if ( !day.equals("Monday") ) which means if day is NOT equal to "Monday" 
			
			
// "==" checks values and references. If both are same then Java tells these Strings are same
// equals() checks just values. It doesn't check references. If the values are same Java tells two Strings are the same. 
		
// to compare Strings DO NOT use "==" sign. We use it for primitives
// Use equals() to compare Strings
// How do we use equals() ? "Ali".equals("Veli") == false
//							"Ali".equals("ali")  == false
		

				
			
		

	}

}
