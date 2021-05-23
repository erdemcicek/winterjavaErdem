package day23encapsulationinheritance;

public class Animal {

	/*
	 1) Why do we need inheritance?
	 
	 2) What are the benefits of inheritance?
	 	a) Less coding
	 	b) No repetition
	 	c) Easy update
	 	d) Easy maintenance
	 	
	 3) We store common class members ( variables and methods)
	 into Parent Class
	 
	 4) We store specific class members into Child classes
	 
	 5) Private class members in Parent Class cannot be used
	 by Child Classes
	 
	 6) If Child Class and Parent Class are in the same package,
	 then Child Classes can use the default class members (variables and methods )
	 in Parent Class.
	 
	 7) Child Classes can use all protected class members in Parent Class
	 
	 8) For public and protected access modifiers inheritance works without any issue.
	 
	 9) For private access modifiers there is no inheritance
	 
	 10) For default access modifiers you should be careful. Because you cannot use other classes
	 which are in different packages.
	 
	 */
	
	// Parent Class ==> Super Class
	// Child Class  ==> Sub Class
	
	/*
	 	How can we make a class child of another class?
	 	==> with "extends" keyword
	 	classname before "extends" is child ; after "extends" is parent
	 	Dog class inherited drink method, Cat class inherited drink method
	 	Child inherited Parent
	 	
	 */

	/*
	 	Hierarchical inheritance: Situation in which a Parent Class have multiple Child Classes
	 	
	 	A class cannot have multiple Parent Classes for same Child Class ( for Java it's forbidden;
	 		for some other programming languages it is allowed)
	 	
	 	*** Why Java doesn't support multiple inheritance to stop confusion
	 	
	 */
	
	/*
	 	Multi-level inheritance: is valid in Java. Java supports it.
	 	Java doesn't like duplication
	 	
	 */
	
	public void eat() {
		System.out.println("They eat...");
	}
	public void drink() {
		System.out.println("They drink...");
	}
	
}
