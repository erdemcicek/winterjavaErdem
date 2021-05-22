package day16multidimarrays;

import java.util.Arrays;

public class MultiDimArrays01 {

	public static void main(String[] args) {
		// You can put primitives in arrays 
		// You can put references of non-primitives in arrays
		// Arrays are objects, so we can put arrays in an array
		
		int arr[][] = new int[3][2];
		// to print multidimensional arrays:
		System.out.println(Arrays.deepToString(arr));
		arr[0][0] = 1;
//		System.out.println(arr); it prints [[I@5d22bbb7
		System.out.println(Arrays.deepToString(arr));
		
		// it is possible to create inner arrays which has different sizes??? But not first way, just write
		
		int brr[][] = {{2,4,1,},{7,9},{10,11}};
		System.out.println(Arrays.deepToString(brr));
		
		// update 1 to 5
		brr[0][2] = 5;
		
		// How to print first array
		System.out.println(Arrays.toString(brr[0])); // we use toString , because we want to get first element and not the elements
													 // inside the inner array
		
		// How to find the sum of the elements in second array?
		int sum = 0,i;
		for (i = 0; i<brr[1].length; i++) {
			sum += brr[1][i];
		}
		System.out.println(sum);
		

	}

}
