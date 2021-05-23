package day28exceptions;

public class Test01 {
	
	public static void main(String[] args) {
		
		// IOException complains if there is not FileInputStream fis = new FileInputStream("path")
		// IOException is a Compile Time Exception
		// If there is not parent-child relationship, order does not matter
		// If we type a fis object and 1. is Runtime and 2. is IOException there is no problem; because there is no child-parent relationship
		// IllegalArgument is a Runtime Exception
		
		try {
			
			System.out.println("Work real hard");
			
			
		}catch(IllegalArgumentException e){
			
		}catch(RuntimeException e) {
			
		}
	}
}
