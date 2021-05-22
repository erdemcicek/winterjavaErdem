package day19foreachloop;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class ForEachLoop03 {
/*
 	we will count vowels
 */
	public static void main(String[] args) {
		
		String[] vowels = {"a","e","i","o","u"};
		int[] count = new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to count how many vowel it has");
		String s = scan.nextLine().toLowerCase();
		String[] str = s.split("");
		
		for ( String w : str) {
			switch(w) {
				case "a": count[0]++;break;
				case "e": count[1]++;break;
				case "i": count[2]++;break;
				case "o": count[3]++;break;
				case "u": count[4]++;break;
			}
		}
		for ( int i = 0 ; i < vowels.length ; i++) {
			if ( count[i] != 0) {
				System.out.println(vowels[i] + " " + count[i]);
			}
		}
		scan.close();	
	}
}
