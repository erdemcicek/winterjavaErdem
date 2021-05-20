package day07stringmanipulations;

import java.util.Scanner;

public class Question {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two String");
		String s1 = scan.next();
		String s2 = scan.next();
//		s1.substring(s1.length()-1);
		if ((s1.substring(0, 1).equals(s2.substring(0, 1))) && ( (s1.substring(s1.length()-1)).equals(s2.substring(s2.length()-1)))) 
			System.out.println("Woow");
		else
			System.out.println("Hmm");
//		System.out.println(((s1.substring(0, 1).equals(s2.substring(0, 1))) && ( (s1.substring(s1.length()-1)).equals(s2.substring(s2.length()-1))))?"Woow":"Hmm");
//		System.out.println((s1.substring(0, 1).equals(s2.substring(0, 1))));
//		System.out.println(s1.substring(s1.length()-1).equals(s2.substring(s2.length()-1)));
		scan.close();	
	}

}
