package day16multidimarrays;

public class MultiDimArrays03 {

	public static void main(String[] args) {
//		String arr[][] = {{"s","A","D","B"},{"R","t","e"},{"u","o","Y","e"}};
//		for ( int i = 0 ; i < arr.length; i++) {
//			System.out.print(arr[i][arr[i].length-1]);
//		}
		
		// Find the multiplication of the first elements in each array
		int brr[][] = {{2,4,5},{1,5,7,8,9},{5},{8,5}};
		int a = 1,j;
		for ( j = 0 ; j < brr.length ; j++) {
			a *= brr[j][0];
		}
		System.out.println(a);
	}

}
