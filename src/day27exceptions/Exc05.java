package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exc05 {
	
	/*
	 	1) "throws" keyword is used for "checked exceptions"
	 	2) "throws" keyword is used when we do not want to handle exception
	 	3) After "throws" keyword, you can use multiple Exception classes by putting comma between them
	 	4) "throws" keyword cannot be used in method body. It must be used in method name line
	 	
	 	5) After "throws" keyword, if you use child and parent Exception Classes together, it works but not recommended
	 		because when you just parent it will cover the child. The order of exceptions does not matter.
	 	 IOException covers FileNotFoundException
	 */
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Pc\\Desktop\\myworkspace\\winterjava\\src\\day26exceptions\\Exception");
		
		int k = 0;
	
		while((k = fis.read()) != -1) {
			
			System.out.print((char)k);
			
		}
	}
	
	/*
	 	ArithmeticException is RunTimeException 
	 	If there are 2 exceptions and we type them in catch blocks, we have to type child first
	 	Otherwise it gives compile time error, because child would be unreachable
	 	
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
