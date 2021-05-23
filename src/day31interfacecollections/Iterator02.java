package day31interfacecollections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {
	
	public static void main(String[] args) {
		
		List<String> list2 = new ArrayList<>();
		list2.add("AB");
		list2.add("CD");
		list2.add("EF");
		System.out.println(list2);
		
		// Let us add "!" at the end of every element
		
		ListIterator<String> it2 = list2.listIterator();
		
		while(it2.hasNext()) {
			
			String el = it2.next();
			it2.set(el+ "!");
		}
		System.out.println(list2);
		
		List<String> list3 = new ArrayList<>();
		list3.add("XY");
		list3.add("ZT");
		list3.add("UV");
		System.out.println(list3);
		
		// Let us print list elements one by one in reverse order by putting space between two elements
		
		
		ListIterator<String> it3 = list3.listIterator();
//		String s = "";         **** It worked, no worries
//		while(it3.hasNext()) {
//			s = it3.next() + " " + s ;
//		}
//		System.out.println(s);
		
		// Take the pointer to the end
		while(it3.hasNext()) {
			it3.next();
		}
		
		// By using hasPrevious() and previous
		while(it3.hasPrevious()) {
			String el = it3.previous();
			System.out.print(el + " ");
		}
		
		
		
		
		
		
		
	}

}
