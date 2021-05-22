package day14constructorsstatickeywordarrays;

import java.util.Arrays;

public class Arrays01 {
	
	/*
	 	1) to store multiple values, we need "Arrays"
	 	2) an array can have just a single data type
	 		if you decide to store integer into an array, you can store just integers not the others.
	 	3) arrays accept just "primitive data types" as elements, when you put "String" in an array, Java stores their
	 		"references" inside the array, not the String itself.
	 */

	public static void main(String[] args) {
		
		/* How to create an array
		 1) Decide which data type will you store
		 2) Put a name for the array
		 3) After the name put "[]"
		 4) Use "new" keyword
		 5) Put the data type again with brackets ==> []
		 
		 */
		
		int array1[] = new int[5];
		// First way to create and assign values
		array1[1] = 11; array1[4] = 22;array1[2] = 27;array1[0] = -2;
//		array1[4] = 22;
		array1[3] = 33;
		System.out.println(Arrays.toString(array1));
		
		// Second way to create and assign values
		String array2[] = {"Ali","Can","Kemal","Mary"};
		System.out.println(Arrays.toString(array2));
		
		// How to update an element
		array2[1] = "Canan";
		System.out.println(Arrays.toString(array2));
		
		// How to add elements more than size
		// If you try to add elements more than the size of the array, you'll get run time error.
//		array2[4] = "Angie";
//		System.out.println(Arrays.toString(array2)); ArrayIndexOutOfBoundsException  ---> it is a RunTimeError
// 					which means we don't see red underline while typing but when we run it gives ArrayIndexOutOfBoundsException		
		// Update all elements to "Joe"
		// in Strings length method is used with parenthesis like "length()"
		// in Arrays length method is used without parenthesis like "length"
		for (int i = 0; i <array2.length; i++) {
			array2[i] = "Joe";
		}
		System.out.println(Arrays.toString(array2));
		// How to print array1 elements one by one on the console in different lines
		
		for ( int j = 0 ; j < array1.length; j++) {
			System.out.println(array1[j]);
		}
		
		// How to add array1 elements
		
		int sum = 0, k;
		
		for ( k = 0 ; k < array1.length ; k++) {
			sum += array1[k];
		}
		System.out.println(sum);
		
		// Replace "*" for the all 'J' characters in array2
		
		for ( int m = 0 ; m < array2.length ; m++) {
			array2[m] = array2[m].replaceAll("J", "*"); // if we don't make assignment we'll print the same array2
		}												// because replaceAll does not store values
		System.out.println(Arrays.toString(array2));
		
	}

}
