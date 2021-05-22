package day17lists;

import java.util.List;  // I chose wrong import should be java.util.List
import java.util.ArrayList;

public class Lists01 {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("Ahmet");
		list1.add("Yavuz");
		list1.add("Cemal");
		list1.add("Sibel");
		list1.add(2, "Ali");
		list1.add("Veli");
//		System.out.println(list1); // it stores elements in insertion order
		// outofboundsexception is runtime error, when we write it does not give error, but when we run
		// we see the error
//		System.out.println(list1.indexOf("Ah")); // non-existing gives -1
		
		// How to remove an element from a list?
		list1.remove("Ali");
//		System.out.println(list1.remove("Ali"));
		System.out.println(list1);
		
		String s = "Strings are immutable";//if I write s.replace("are","") in a line and below it I print s, I'll see "are" not replaced
		System.out.println(s.replace("are", "")); // either write inside print statement or make an assignement 
												  // and print the new assigned String 
		
		// to update elements in lists:
		list1.set(2, "John");
		System.out.println(list1);
		
		System.out.println(list1.subList(1, 3));// to get a part of a list; first index is inclusive , second one is exclusive
		
		List<String> list2 = new ArrayList<>();
		list2.add("Ayse");
		list2.add("Serife");
		list2.add("Recep");
		
//		list1.addAll(list2);
//		System.out.println(list1);
		System.out.println(list2);
		
		list1.addAll(2, list2);
		System.out.println(list1);
		
		list1.removeAll(list2); // it removes all the list2; suppose I add list2 twice, if I use removeAll(list2) it removes 
		System.out.println(list1); // not one list2 but both
		
		list1.clear();
		System.out.println(list1); //[]
		
		System.out.println(list1.isEmpty()); // true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
