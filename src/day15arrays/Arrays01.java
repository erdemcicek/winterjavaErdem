package day15arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		//======sort(), binarySearch()======
		// int a[] = new int[4];
//		int a[] = {4,2,1,5};
		
		int num [] = {9,5,1,8,7};
		// How can we sort the elements in an array?
		
		
		
		int reverse[] = new int[num.length];
		
		int idx = 0;
		for ( int i = num.length - 1 ; i > 0 ; i--) {
			reverse[idx] = num[i];
			idx++;
		}
		System.out.println(Arrays.toString(reverse));
		
		// How to check if a specific element exists in an array? 
		// 1) Sort the array elements 
		// 2) Use binarySearch() , it 
		// We can use binarySearch() for all data types
		
		int num2[] = {3,12,8,7};
		Arrays.sort(num2);
		System.out.println(Arrays.binarySearch(num2, 3));
		System.out.println(Arrays.binarySearch(num2, 8));
		// What if I look for non-existing element?
		// It will return negative number and the number will be the ORDER
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
