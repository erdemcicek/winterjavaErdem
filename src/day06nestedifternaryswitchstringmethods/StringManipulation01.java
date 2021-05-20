package day06nestedifternaryswitchstringmethods;

//import java.util.Scanner;

public class StringManipulation01 {
	/*
		String Methods:
		1)toUpperCase() 2)toLowerCase() 3)charAt() 4)equals() 5)equalsIgnoreCase() 6)length() 
		7)next() 8)nextLine() 9)index0f() 10)lastIndexOf() 11)contains()
	 */

	public static void main(String[] args) {
//		String str = "Java is easy if you study";
//		// index0f() returns the index of first occurrence of the character
//		System.out.println(str.indexOf("i"));
//		System.out.println(str.indexOf('i')); // indexOf accepts char as parameter as well
//		// if the character does not exist in the String, it returns "-1"
//		System.out.println(str.indexOf("x"));
//		
//		System.out.println(str.indexOf("easy")); // if you use multiple characters in indexOf, it returns the index of first character
//		System.out.println(str.indexOf('j',8)); // after index 8 , there is no 'j' . So it returns "-1"
//					// If you use indexOf with 2 parameters, Java looks for the character after the given index
//					// But that index is inclusive: for example
//		System.out.println(str.indexOf('e',8)); // it does not return "-1" but "8" . So it's inclusive
		
		/*
		 	Ask user to enter a String and a character, then check if the String has the character or not
		 */
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a String then enter a character");
//		String s = scan.nextLine();
//		char ch = scan.next().charAt(0);
//		String result = s.indexOf(ch) == -1 ? "There is no the character" : "The String has the character";
//		System.out.println(result);
//		scan.close();
		
		//System.out.println(s.indexOf(ch) == -1 ? "There is no the character" : "The String has the character");
		
		// 10) lastIndex0f() returns the index of last occurrence of the character
		// in lastIndexOf you can use char and String. Both are acceptable
		// lastIndexOf method returns -1 if the character doesn't exist in the String
		// lastIndexOf returns the index of first character of last occurrence of "Java"
		//String t = "Java ah Java!";
		// If you use lastIndexOf with 2 parameters, get the character starting with the index and to the beginning of the String
		// In the following example we are using "Java a" 
		//System.out.println(t.lastIndexOf('a',4));
		//System.out.println(t.lastIndexOf("Java a"));
		
		// Ask user to give you a String and a character.
		// If the character does not exist in the String or exist just once print "Not good!"
		// If the character is used multiple times print "Wooow!"
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a String then enter a character");
//		String s = scan.nextLine();
//		char ch = scan.next().charAt(0);
//		
//		if ( (s.indexOf(ch) == -1) || (s.indexOf(ch) == s.lastIndexOf(ch)))
//			System.out.println("Not good");
//		if ( s.indexOf(ch) != s.lastIndexOf(ch))
//			System.out.println("Woow");
		
		// 11) contains() is used to check if a single character or multiple characters exist in a String
		// contains() method returns boolean
		// contains() method cannot be used with chars, you have to use Strings *** IMPORTANT
		String r = "Learn Java, earn money";
		System.out.println(r.contains("e"));// true if the character exist in the String
		System.out.println(r.contains("x")); // false
		System.out.println(r.contains("earn")); // true
		// System.out.println(r.contains('a')); it gives error , char cannot be used with contains method
		
		
		
		
		
		
		
	}

}
