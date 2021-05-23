package day24inheritanceoverriding;

public class Honda extends Car {
	
	/*
 	1) If you changed the method body of a method which is in Parent 
 	Class before using in Child Class, it is "Method Overriding"
 	number of parameters, data types of parameters ==> in method overloading
 	2) You cannot change method parameters in Method Overriding
 	You cannot change the method name either.
 	3) In method overriding we do not create a new method;
 	We change the implementation and use it.
 		Note: Method name + Method parameter is called Method Signature
 		So, we do not change "method signature" in method overriding
 */
	
	public void factory() {
		System.out.println("Factory is in Japan");
	}
	
	/*
	 	Using "@Override" annotation is not must to achieve "overriding"
	 	but it has 2 benefits ;
	 		1) When you use this annotation, Java checks overriding for you if it's not correct
	 			it gives you CompileTimeError
	 		2) When you use "@Override" annotation, it's good for readibility
	 		
	 		Note: Access modifiers of "overriding methods(methods are in Child Class)"
	 				should be wider than or equal to the access modifiers of "overriden methods(Methods are in Parent Class)"
	 	Note: If return type is "primitive" in overriding, you cannot change the return type
	 	
	 	Note: If return type is "non-primitive" you should have IS-A relationship(from child to parent) 
	 */

	// Overriding Method
	@Override
	public void move() {
		System.out.println("Honda reaches 100 in  seconds");
	}

	@Override
	public void engine() {
		System.out.println("Honda has eco engine in every model");
	}

	@Override
	public int spend() {
		return 22;
	}

	@Override
	public String speak() { // it does not complain; between String-Object, there is IS-A relationship
		return "Honda can speak Japan";
	}

	@Override
	public String greet() { // when I write here Object, Java complain; Child method return type should be subclass
		return "Honda is greeting you sir";
	}
	
	

}
