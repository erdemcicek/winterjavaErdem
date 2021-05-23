package day28exceptions;

/*
 		To create an unchecked exception, extends to "RuntimeException" Class
 		To create a checked exception, extends to "Exception" Class
 		When it is unchecked , we do not get red underlines
 */

public class InvalidEmailIdUncheckedException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public InvalidEmailIdUncheckedException(String message) {
		super(message);
	}
}
