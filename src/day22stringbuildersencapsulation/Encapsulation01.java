package day22stringbuildersencapsulation;

public class Encapsulation01 {
	/*
	 	1) Encapsulation is "data hiding"
	 	2) How to achieve "encapsulation"?
	 			a) Make the variables private
	 			b) To read private variables create get methods
	 			c) To update private variables create set methods ( setter ) 
	 */
	
	private String collegeName = "Colombia";
	private int age = 23;
	private boolean old = true;
	private String ssn = "123456789";
	
	
	public String getCollegeName() {
		return collegeName;
	}
	public int getAge() {
		return age;
	}
	public boolean isOld() {
		return old;
	}
	public String getSsn() {
		return ssn;
	}
	
	
	
	
	
	
}
