package day09methodoverloadingloops;

public class ForLoop01 {

	public static void main(String[] args) {
//		System.out.println("Hello World");
		// Type code to print "Hello World!" 10 times on the console...
		
// 			  initial action	loop-continuation-condition		action-after-each-iteration
//		for ( int i = 1 	; 		i <= 10 	 			;			 i++				) {  
//			System.out.println("Hello World");
//		}  // all decisions are made in second part which means the "loop-continuation-condition"
		
		
	twelveToFive();	
	}
//	public static void fiveToTwelve() {
//		for ( int i = 5 ; i <= 12 ; i++ ) {
//			System.out.print(i + " ");
//		}
//	}
	public static void twelveToFive() {
		for ( int j = 12 ; j >= 5 ; j--) {
			System.out.print(j + " ");
		}
	}
	

}
