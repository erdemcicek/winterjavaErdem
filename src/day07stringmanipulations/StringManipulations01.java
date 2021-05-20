package day07stringmanipulations;

public class StringManipulations01 {
	/*
	String Methods:
		1)toUpperCase() 2)toLowerCase()   3)charAt()     4)equals()        5)equalsIgnoreCase()    6)length() 
		7)next()        8)nextLine()      9)index0f()    10)lastIndexOf()  11)contains()           12)starsWith() 
		13)endsWith     14) isEmpty()     15) replace()  16)replaceAll()   17)substring()          18)parse...()
		19)trim()       20)concat()
		
	 */

	public static void main(String[] args) {
					// 01234 5678910
		String str1 = "Learn coding by typing";
		// 12) startsWith() is used to check if this String starts with the specific prefix. 
		// it can be used with *** ONLY STRING. We cannot use it with char
		// it returns boolean
		System.out.println(str1.startsWith("coding", 5)); // false
		System.out.println(str1.startsWith("coding", 6)); // true

		
		// 13) endsWith() is used to check if a String ends with a specific suffix
		// it can be used with *** ONLY STRING. We cannot use it with char
		// it returns boolean
		System.out.println(str1.endsWith("ping")); // true
		
		// 14) isEmpty() to check if a given String is empty or not
		String s = " ";
		System.out.println(s.isEmpty()); // true
		
		// 15) replace
		// to replace all occurrences of a specific character with another character
		// Alt + Shift + R ==> useful shortcut
		String str2 = "Java is easy";
		System.out.println(str2.replace("a", "e")); // prints "Jeve is eesy"
		System.out.println(str2);					// prints "Java is easy" ==> *** replace() does not change the original String ***
		System.out.println(str2.replace("a", str2));// prints "JJava is easyvJava is easy is eJava is easysy"
		System.out.println(str2.replace("a", ""));  // by replacing "a" with "" we can delete all "a" in the String
													// prints "Jv is esy"
		System.out.println(str2.replace("", "!"));  // replacing "!" before an after each character
													// prints "!J!a!v!a! !i!s! !e!a!s!y!"
		System.out.println(str2.replace('a', 'e')); // replace() accepts char data type as well ,
													// unlike startsWith and endsWith
		String str3 = "Teach_more, learn123 more!!! ..";
//		System.out.println(str3.indexOf('l'));  *** can be use both CHARs and STRINGs
//		System.out.println(str3.contains('h'));  *** it gives Compile Time Error. contains does not take char
		/*
		 	There are some methods that don't take chars :
		 	
		 	--> starsWith  --> it returns boolean
		 	--> endsWith   --> it returns boolean
		 	--> contains   --> it returns boolean
		 	
		 	Some , however take chars :
		 	
		 	--> replace    --> it returns another String
		 	--> indexOf    --> it returns the index as integer
		 	
		 */
		/*
		 	Regular Expressions
		 	1) //s : space character
		 	2) //S : all characters except space character
		 	3) //w : a -> z   A -> Z   _    0 -> 9
		 	4) //W : all characters except a -> z   A -> Z   _    0 -> 9
		 	5) //d : 0 -> 9
		 	6) //D : all characters except 0 -> 9
		 */
		
		// 16) replaceAll() and replace() do the same thing 
		// But there are some differences : 1) In replaceAll() you cannot use chars
		// 									2) In replaceAll() you can use regular expressions
		System.out.println(str3.replaceAll("\\s", "*")); // PAY ATTENTION TO SLASH SIGN *** IT IS " (Alt gr) + (_) " 
		System.out.println(str3.replaceAll("\\S", "*")); // and NOT Shift + :
		System.out.println(str3.replaceAll("\\w", "&"));
		System.out.println(str3.replaceAll("\\W", "%"));
		System.out.println(str3.replaceAll("\\d", "+"));
		
		// 16 replaceFirst()
		// replaceFirst() changes just the first occurrence of the character
		System.out.println(str3.replaceFirst("a", "e")); // prints "Teech_more, learn123 more!!! .."

	}

}
