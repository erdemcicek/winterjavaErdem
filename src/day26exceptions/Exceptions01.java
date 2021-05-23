package day26exceptions;

public class Exceptions01 {
	
	/*
	 	Exception is an abnormal situation. In Java, exception is an event that disrupts
	 	the normal flow of the program
	 	
	 	There are two types of Exceptions:
	 	1) Compile Time Exceptions ( Checked Exceptions ) : Occur before click on the run button
	 	2) Run Time Exceptions ( Unchecked Exceptions ) : Occur after click on the run button
	 	
	 	e.getMessage() ==> every exception has their own messages
	 	
	 	// In try-catch block if 
	 	
	 */
	
	/*
	 		What is the meaning of "platform independant"?
	 		JVM is platform dependant, but Java programming language is platform independant
	 		
	 */
	
	

	public static void main(String[] args) {

		divide(6,3);
//		divide(6,0); // java.lan.ArithmeticException / by zero
		
		System.out.println("Can you print this"); // This sentence is not going to be printed due to the previous line
												  // We need to first fix the previous line
		
		try {
			divide(6,0);
			
		}catch(ArithmeticException e) {
			e.printStackTrace(); // it gives detailed messages about exceptions // n°1 // this is the most detailed one
			System.out.println("You cannot divide by zero"); // n°2
			System.out.println("You cannot divede by zero " + e.getMessage()); // n°3 // this is better than n°2, it gives brief message about exception
		}
		System.out.println("Can you print me?");
		
	}
	
	public static void divide(int a, int  b) {
		System.out.println(a/b);
	}

}
