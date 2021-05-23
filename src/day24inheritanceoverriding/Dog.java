package day24inheritanceoverriding;

public class Dog extends Mammal {
	
	public boolean smellWell;
	
	public Dog() {
		
		// if you type "super()" it's fine;
		// if you do not type Java puts it automatically
		
		System.out.println("Dog construtctor without parameter...");
	}
	
	public Dog(boolean smellWell) {
		super(true);
		// If you do not type any parent constructor call inside the 
		// first line, java uses the parent constructor without 
		// parameter automatically
		
		/*
		 	"super()" is for parent constructor call
		 	"super" is for parent variable call
		 */
		
		super.haveBaby = true;
		super.height = 11;
		super.weight = 22;
		
		// super.height ==> returns the height value from parent classes
		// this.height  ==> returns the height value from the class itself (Dog)
		// If you have multiple variables whose names are same in different parent
		// 		classes, super keyword selects the closest one
		this.smellWell = smellWell;
	}
	/*
	 
	 	final keyword:
	 	1) for method     --> no update in method body, no overriding
	 	2) for class      --> no inheritance, no child classes
	 	3) for variables  --> the value of variable cannot be updated 
	 	
	 */
	

}
