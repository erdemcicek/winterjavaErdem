package day08stringmethodcreation;

public class MethodCreation01 {
	
	public static void main(String[] args) {
		// 		* to make our code more readable , 
		// 		* dividing our code makes things easier to us
		// 		* there may be many duty to perform
		// 		* more dynamic , you may want to just change the data for example
		/*
		  	1)We create methods other than main method and use them in main method to make main method simpler 
		  	We need to connect methods we created to the main method to be able to use those methods , then we call methods
		  		in the main method.
		  	2)static methods can use just static class members because of that we have to make our methods to be able to call 
		  		them from main method
		  	3)The variables created in method parenthesis are called parameters ==> num1 and num2
		  	4)The values used in main method are called as arguments
		  	5)For number parameters you can use "chars" but do not use "String" or "boolean" , otherwise you'll get 
		  		CompileTimeError
		  	
		  	Method Overloading
		  	If you create methods whose names are same, paramters are different in a class it is called "method overloading"
		  	When you use the same name for methods in a class, Java complains. 
		  	To stop complaining we have to change parameters
		  	Changing access modifier will not stop complaining
		  	Removing static keyword will not stop complaining
		 */
//		System.out.println(add(3.4 , 5.9));
		add(3.4 , 5.9); // in this case nothing has printed , because we need to print . Unlike Python, despite having "return"
	}
	public static double add(double num1, double num2) {
		return num1 + num2;
		}
	public static float add(byte num3, int num4, char num5) {
		return num3 + num4 + num5;
		
	}
	

}
