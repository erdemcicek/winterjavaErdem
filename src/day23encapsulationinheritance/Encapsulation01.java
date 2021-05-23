package day23encapsulationinheritance;

public class Encapsulation01 {
	
	private String name = "Ali Can";
	private int age = 21;
	private boolean isRetired = false;
	
	private char initial = 'A';
	private String address = "Miami Florida";
	
	
	// everytime getter method should be "public"
	// return type must be the same as variable 
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName ( String name) {
		this.name = name; // without "this" keyword it works I think
	}
	public void setAge(int newAge) {
		this.age = newAge;
	}
//	public boolean getStatusOfRet() {
//		return isRetired;
//	}
//	public void setStatusOfRet(boolean newStatusOfRet) {
//		this.isRetired = newStatusOfRet;
//	}
	public boolean isRetired() { // naming convention for getters methods
		return isRetired;  		 // if data type is boolean
	}							 // starts with "is" not "get"
	public void setRetired(boolean isRetired) {
		this.isRetired = isRetired;
	}
	
	// Make "initial" variable just readable ( just readable, not updateable ) 
	// to do it, you should not create "setter" ; create just "getter" 
	
	public char getInitial() {
		return initial;
	}
	
	// Make "address" just updateable
	// to do it, you should not create "getter" ; create just "setter"
	
	public void setAdress(String address) {
		this.address = address;
	}
	
	/*
	 	1) If you want not to update any value, do not create any setter method
	 		If you do not create any setter method, it means no value can be updated, and the class
	 		is called "immutable class"
	 		Question: How can you make a class immutable
	 		Answer : Make all variables private then do not create any setter method, you may create getter methods no problem
	 		
	 		
	 */
	
	
	
	
}
