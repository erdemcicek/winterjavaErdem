package day20passbyvaluepassbyreferencedate;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("a");
		list.add("a");
		list.add("d");
		
		List<String> list2 = new ArrayList<>();
//		for ( String w : list) {
//			for ( String w2 : list2) {
//				if ( w != w2) {
//					list2.add(w2);
//				}
//			}
//		}
//		System.out.println(list2);
		
		for ( String w : list) {
			if ( list2.contains(w)) {
				continue;
			}
			list2.add(w);
		}
		System.out.println(list2);
		
		// 2.way
//		for ( String w : list) {
//			if ( !list2.contains(w)) {
//				list2.add(w);
//			}
//		}
//		System.out.println(list2);
		
		
		
		
		
		
		
		
		
		
	}

}
