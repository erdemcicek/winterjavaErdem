package day16multidimarrays;

public class MultiDimArrays02 {
	/*
	 	Find the sum of all elements in the multidimensional array
	 */

	public static void main(String[] args) {
		int arr[][]= {{3,4},{5},{6,8},{2,9}};
		int i = 0,j,sum=0;
		while ( i < arr.length) {
			for ( j= 0; j<arr[i].length; j++) {
				sum += arr[i][j];
			}
			i++;
		}
		System.out.println(sum);

	}

}
