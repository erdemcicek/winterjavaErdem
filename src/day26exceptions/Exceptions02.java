package day26exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {
	
	// When you use multiple catch blocks, make the child one first
	
	/*
		1) Exceptions are unexpected errors in Java
		2) Exceptions can handle by using try-catch blocks
		3) ArithmeticException is thrown by Java is Runtime if there is any issue in Mathematical Operations
		4) FileNotFoundException occurs in Compile Time, if there is any issue in the Path of the file or in the 
			existence of the file
	 */

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("src\\day26exceptions\\Exception");
			
			int k;
			try {
				while( (k = fis.read()) != -1) {
					System.out.print((char) k);
				}
			}catch(IOException e) {
				
				e.printStackTrace();
			}
			
			
			
		} catch (FileNotFoundException e) {

			System.out.println("The path is wrong or file deleted");
		} catch (IOException e) {
			System.out.println("The file could not be read");
		}
		
		try {
			fis.close();
		}catch(IOException e) {
			System.out.println("The file could not be read");
		}
		

	}
	/*
		Note : IllegalArgumentException is an exception class
	in the Java API. In general, each exception class
	in the Java API has at least two constructors;
	a no-arg constructor and a constructor with a 
	String argument that describes the exception. This
	argument is called the exception message, which 
	can be obtained by invoking getMessage() from an 
	exception object.  
	
	
	
	 */
}
