package day16multidimarrays;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		/*
		 	ArrayLists are used to store multiple elements like arrays 
		 	ArrayLists are flexible in length but arrays are not
		 	ArrayLists accept just non-primitives as data types
		 */
		
		// How to create an ArrayList?
		// 1.way:
		ArrayList<Integer> list1 = new ArrayList<>();
		
		// 2.way:
//		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		// to print ArrayList we directly write the name of the list
		System.out.println(list1);
		
		
		list1.add(45); 	// add() adds elements according to insertion order
		list1.add(78);
		list1.add(34);
		
		System.out.println(list1);
		
		// How to add elements in a specific index?
		
		list1.add(1, 11);
		System.out.println(list1); // now our last index is 3
		list1.add(4, 234);	// when I write 4 for index it adds , but when I write 5 -> IndexOutOfBoundsException
							// So if length = 4 and lastIndex = 3 , we can add 4th element, which means( lastIndex + 1 = length)
		
		// How to get an element on the console from a list?
		System.out.println(list1.get(0)); // prints 45
		
		// How to get the number of elements in a list?
		System.out.println(list1.size()); // prints 5 
		
		// HW ==> Find the multiplication of all elements in the multidimensional array.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
