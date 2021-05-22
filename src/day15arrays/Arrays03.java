package day15arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// ===== split() ======
		/*
		 	split() is used to split a String by using specific character/s
		 	split() puts the elements in an array
		 */
		
		String s = "I like Java but Java requires you to study hard to learn so I will study hard";
		
		String part1[] = s.split("Java");
		System.out.println(Arrays.toString(part1));
		
		// How can I split String as words?
		String part2[] = s.split(" ");
		System.out.println(Arrays.toString(part2));
		// How can I find the number of words?
		System.out.println(part2.length);//17
		
		// How many characters that are used in String s?
		
		// Count how many times "a" is used in this String?
		
		
		
		

	}

}
