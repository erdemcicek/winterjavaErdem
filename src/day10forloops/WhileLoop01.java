package day10forloops;

public class WhileLoop01 {

	public static void main(String[] args) {
		/*
		 	Type a program to print odd integers from 4 to 25 on the console
		 	1 ) Use for-loop
		 	2 ) Use while-loop
		 */
//		oddForLoop();
//		oddWhileLoop();
		first50Prime();
	}
	public static void oddForLoop() {
		for ( int i = 5 ; i < 26 ; i+=2)
			System.out.print(i + " ");
	}
	public static void oddWhileLoop() {
		int i = 5;
		while ( i < 26) {
			System.out.print(i + " ");
			i+=2;
		}
	}
	public static void first50Prime() {
		int count = 0,num=2;
		
		while ( count < 50) {
			boolean isPrime = true;
			for ( int div = 2 ; div <= num/2  ; div++) {
				if ( num % div == 0 ) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
				if ( count % 10 == 0)
					System.out.println(num);
				else
					System.out.print(num + " ");
			}
			
			num++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
