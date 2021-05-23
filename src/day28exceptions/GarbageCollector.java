package day28exceptions;

public class GarbageCollector {
	
	/*
	 
	 	1) Garbage collector destroys the "finalized" objects
	 	2) To finalize an object java uses finalize() method
	 	3) If you want you can call "finalize()" method among your code but 
	 		Java decides when and how to use finalize() method.
	 
	 */
	
	
	/*
	 	Explain "final", "finally" and "finalize" ?
	 	
	 	1) final --> keyword   ; finally --> code block   ; finally --> method
	 	2) final --> a) final variables:
	 					i) final variables must be initialized
	 					ii) final variables values cannot be modified
	 					iii) final variables should be named by using uppercases
	 				 b) final methods:
	 				  	i) final methods cannot be overriden
	 				  	ii) but can be overloaded
	 				 c) final classes:
	 				 	i) final classes cannot have child classes. No inheritance, no extends
	 	3) finally --> a) it is used with try block or try-catch block
	 				   b) it is executed when the exception is thrown or the exception is not thrown
	 				   c) it is used to end connection with database or cloud or it is used to close a file
	 	4) finalize --> a) it is executed before Garbage Collector destroys the objects 
	 	
	 */
	
	private static int i = 0;
	private static int j = 0;
	public static void main(String[] args) {
		int i = 2;
		int k = 3;
		{
		int j = 3; // } koyunca instance j'yi aliyor
		System.out.println("i + j is " + (i + j)); // bura her turlu "i+j is 5" yazdirdi
		}
		k = i + j;
		System.out.println("k is " + k);
		System.out.println("j is " + j); // } koyunca j'yi 0 aliyor
	}
		/*			{} cikarinca			{} aktiflestirince
		 			i + j is 5				i + j is 5
					k is 5					k is 2
					j is 3					j is 0

		 */
}
