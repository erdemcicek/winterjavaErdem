package day17lists;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		
		list1.add("x");
		list1.add("y");
		list1.add("z");
		list1.add("x");
		list1.add("z");
		list1.add("m");
		list1.add("k");
		System.out.println(list1);
		
		// How to remove repeated elements from a list
		
//		List<String> list2 = new ArrayList<>();
		
//		for ( int i = 0 ; i < list1.size() ; i++) {
//			if ( list1.indexOf(list1.get(i)) != list1.lastIndexOf(list1.get(i)) ) {
//				list1.remove(list1.get(i));
//			}
//		}
//		System.out.println(list1);
		
//		
//		List<Character> list02 = new ArrayList<>();
//		for(int i=0; i<list1.size(); i++) {	
//			if(!list02.contains(list1.get(i))) {	
//				list02.add(list1.get(i));	
//			}	
//		}
//		// .add(list1.get(i));
		
		
		
		
		
	}

}
