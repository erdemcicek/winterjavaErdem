package day28exceptions;

import java.util.Arrays;

public class InterviewQuestion01 {
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(max(1,8,7,8)));
		// -100 - 1   2 55 
		
	}
	
	public static int[] max(int...a) {
		int product = Integer.MIN_VALUE, x = 0 , y = 0;
		for ( int i = 0 ; i < a.length ; i++) {
			for ( int j = 0 ; j < a.length ; j++) {
				if ( a[i] * a[j] > product && a[i] != a[j]) {
					product = a[i]*a[j];
					x = a[i];
					y = a[j];
				}
			}
		}
		int[] arr = {x,y};
		return arr;	
	}
}
