package day28exceptions;

/*
 		1) Name the class by using "Exception" word at the end.
 			Using "Exception" word at the end is not must but it is naming convention
 		2) To create a "checked exception", you should extend to "Exception" class
 		3) Create constructor with a "String" parameter, and inside the constructor use super()
 */

public class InvalidIdEmailCheckedException extends Exception {
	
	private static final long serialVersionUID = 1L;

	// set of properities that will be applied to things inside of it , it's like a template
	
	public InvalidIdEmailCheckedException(String message) {
		super(message);
	}

}
