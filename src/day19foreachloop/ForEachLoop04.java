package day19foreachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop04 {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add(15);
//		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(7);
		list2.add(14);
		list2.add(11);
		list2.add(14);
		list2.add(15);
		list2.add(17);
//		System.out.println(list2);
		
		List<Integer> commonEl = new ArrayList<>();
		
		for ( int w1 : list1) {
			for ( int w2 : list2) {
				if ( w1 == w2) {
//					System.out.println(w1);
					if ( !commonEl.contains(w1)) {
						commonEl.add(w1);
					}
				}
			}
		}
		System.out.println(commonEl);
		
	}

}
