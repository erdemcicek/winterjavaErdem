package day18lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists01 {

	public static void main(String[] args) {
		// Working with lists is easier than working with arrays
		//Because of that sometimes we want to convert arrays to lists
		
		Integer arr[] = {3,5,7,1,5};
		// We can use asList() from Arrays class
		List<Integer> list1 = Arrays.asList(arr);
		System.out.println(list1);
		
		// Use some list methods:
		list1.set(1, 10);  // list1.set(index, new_value)
		System.out.println(list1);
		System.out.println(list1.subList(2, 4)); // 2 is inclusive, 4 is exclusive
		
		// with asList() method we cannot use remove(index) and add(index)
		// because at first it was an array, which is immutable so we cannot use method that change length
		// we cannot use clear() method either
		
		
		// Instead of using asList() we can use for loop and take elements from array and add them to list
		
		int[] brr = {7,5,3,9,0};
		List<Integer> list5 = new ArrayList<>();
		for ( int i = 0 ; i < brr.length ; i++) {
			list5.add(brr[i]);
		}
		System.out.println(list5);
		
		list5.remove(2);
		System.out.println(list5);
		
		// removeIf() : We will learn in Lambda; it removes elements according to condition
		// and it returns boolean
		list5.removeIf(t->t%2==0);
		System.out.println(list5);
		
		// How can we convert lists to array?  (Not recommended)
		Object[] arrayFromList = list5.toArray();
		System.out.println(Arrays.toString(arrayFromList));
		
		
		
		
		
		
		
	}

}
