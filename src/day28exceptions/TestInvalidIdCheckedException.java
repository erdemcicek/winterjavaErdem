package day28exceptions;


public class TestInvalidIdCheckedException {
	
	public static void main(String[] args) {
		
		try {
			validateEmailId("abc@gmail.com");
		} catch (InvalidIdEmailCheckedException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void validateEmailId(String emailId) throws InvalidIdEmailCheckedException {
		
		if ( emailId.contains("@gmail.com") || emailId.contains("@yahoo.com")) {
			System.out.println(emailId);
		}
		else {
			throw new InvalidIdEmailCheckedException("Eamil id is not valid");
		}
		
	}

}
