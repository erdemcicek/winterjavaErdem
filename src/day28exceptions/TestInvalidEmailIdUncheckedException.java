package day28exceptions;

public class TestInvalidEmailIdUncheckedException {

	public static void main(String[] args) {
		
		validateEmailId("abc@gmail.com");
		
	}
	public static void validateEmailId(String emailId) {
		
		if ( emailId.contains("@gmail.com") || emailId.contains("@yahoo.com")) {
			System.out.println(emailId);
		}
		else {
			throw new InvalidEmailIdUncheckedException("Email id is invalid");
		}
	}
	
}
