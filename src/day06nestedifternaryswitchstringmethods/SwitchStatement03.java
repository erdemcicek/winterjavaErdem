package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class SwitchStatement03 {
	/*
	 * Ask user to enter one of the ‘U’, ‘S’, and ‘A’.
Then type a program by using “switch statement” to print “United” for ‘U’
“States” for ‘S’, and “America” for ‘A’
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter one of 'U', 'S' and 'A' ");
		char ch = scan.next().charAt(0);
		switch(ch) {
			case 'U':
			case 'u': System.out.println("United");break;
			case 'S':
			case 's':System.out.println("States");break;
			case 'a':
			case 'A': System.out.println("America");break;
			default: System.out.println("Unvalid character");
		}
		scan.close();
	}

}
