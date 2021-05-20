package day07stringmanipulations;

public class Substring01 {

	public static void main(String[] args) {
		/*
		 	A part of a String is called substring
		 	substring() method of String class is used for getting a substring from the String
		 	We use substring() to get a part of a String by using indexes
		 */
		// 			 0123 56 89--
		String s1 = "Java is Java";
		System.out.println(s1.substring(5)); // 5. index is inclusive  ==> prints "is Java"
		System.out.println(s1.substring(8)); // prints "Java"
		System.out.println(s1.substring(3, 9)); // prints "a is J" ==> 3. index is inclusive ***BUT 9. is NOT inclusive***
		System.out.println(s1.replaceAll("\\w", "*")); // prints "**** ** ****"
		System.out.println(s1.substring(s1.length()-1)); // to get the last character use length() - 1 
		System.out.println(s1.length()); // length is 12
		System.out.println(s1.substring(12)); // prints nothing but does not give error at the same time
											  // despite being out of index number in this String
											  // it seems a bit strange to me 
		/*
		 	We have two type of error messages:
		 	1) While we type our codes we get "red underline" this is called "Compile Time Error"
		 	2) While we type our codes we don't get any red underline , but after running our codes we get red messages on the 
		 		console , it is "Run Time Error" 
		 */
//		System.out.println(s1.substring(13)); // We get StringIndexOutOfBoundsException
		

	}

}
