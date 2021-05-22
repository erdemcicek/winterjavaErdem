package day17lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists03 {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		
		list1.add("A");
		list1.add("K");
		list1.add("N");
		list1.add("Y");
		list1.add("W");
		
		
		List<String> list2 = new ArrayList<>();
		
		list2.add("A");
		list2.add("K");
		list2.add("N");
		list2.add("Y");
		list2.add("W");
		
		// How to check if two lists are equal or not?
		System.out.println(list1.equals(list2)); // we do not need class as we need in Arrays
		
		// How to check if a list has a specific element?
		System.out.println(list1.contains("A"));
		System.out.println(list1.contains("P"));
		
		List<String> list3 = new ArrayList<>();
		
		list3.add("A");
		list3.add("K");
		list3.add("N");
		System.out.println(list1.containsAll(list3));
		
		
		/*Ask user to enter a letter
	 	If the letter exists in list1 convert it to "Got it"
	 	otherwise add the element which user entered into the list1
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character");
		String s = scan.next().substring(0, 1);
		if ( list1.contains(s) )
			list1.set(list1.indexOf(s),"Got it");
		else
			list1.add(s);
		System.out.println(list1);
		scan.close();
		
		
		
		
	}

}
