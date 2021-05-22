package day17lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists02 {

	public static void main(String[] args) {
		
		List<Integer> digits = new ArrayList<>();
		
		digits.add(3);
		digits.add(7);
		digits.add(8);
		digits.add(2);
		digits.add(1);
		digits.add(4);
		System.out.println(digits);
		
		Collections.sort(digits);
		System.out.println(digits);
		
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(7);
		list2.add(0);
		list2.add(34);
		list2.add(15);
		list2.add(78);
		list2.add(9);
		
	// Type a code to find the minimum and max elements of the list2
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for ( int i = 0 ; i < list2.size() ; i++) {
			if ( list2.get(i) > max)
				max = list2.get(i);
		}
		for ( int i = 0 ; i < list2.size() ; i++) {
			if ( list2.get(i) < min)
				min = list2.get(i);
		}
		System.out.println("max: " + max + " min: " + min);

		
		
		
		
		
		
		
		
		
		
	}

}
