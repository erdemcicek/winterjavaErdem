package day19foreachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(13);
		list1.add(15);
		list1.add(12);
		list1.add(14);
		System.out.println(list1);
		//Use for loop to print all elements on the console in the same line with a space between the elements
		for ( int i = 0 ; i < list1.size() ; i++) {
			System.out.print(list1.get(i) + " ");
		}
		System.out.println();
		//Use foreach loop to print all elements on the console in the same line with a space between the elements
		for ( Integer w : list1) { // We may type anything instead of "w", up to us
			System.out.print(w + " ");
		}
		System.out.println();
		// foreach can be done for Collections and Arrays
		
		// Print even elements
		// 1. way
		for ( Integer w2 : list1) {
			if ( w2 % 2 == 0) {
				System.out.print(w2 + " ");
			}
		}
		System.out.println();
		
		// 2. way
		for ( int w3 : list1) {		// Autoboxing : if you assign a primitive int to a wrapper , Java accepts automatically
			if ( w3 % 2 == 0) {
				System.out.print(w3 + " ");
			}
		}
		System.out.println();
		
		//Use for-each loop to print last 3 elements in the list
		for ( int w4 : list1) {
//			if ( list1.indexOf(w4) >= list1.size() - 3) {
//				System.out.print(w4 + " ");
//			}
			if ( list1.indexOf(w4) < list1.size() - 3) {
				continue;
			}
			System.out.print(w4 + " ");
		}
		System.out.println();
		
		// 3.way
		for ( int w5 : list1.subList(list1.size()-3, list1.size())) {
			System.out.print(w5 + " ");
		}
		System.out.println();
		
		// Use for-each loop to print the first elements of list
		// 1.way
		for ( int w6 : list1) {
			if ( list1.indexOf(w6) < 3) {
				System.out.print(w6 + " ");
			}
		}
		System.out.println();
		
		// 2.way
		for ( int w7 : list1.subList(0, 3)) {
			System.out.print(w7 + " ");
		}
		System.out.println();
		
		// 3.way
		for ( int w8 : list1) {
			if ( list1.indexOf(w8) > 2) break;
			System.out.print(w8 + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
