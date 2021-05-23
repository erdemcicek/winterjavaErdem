package day30interfaces;

/*
 	1) "interface" is not a class
 	2) "interface" can contain JUST "ABSTRACT" methods
 		"abstract" classes can contain both "concrete" and "abstract" methods
 	3) "abstract class" is a class, but interface is not a class
 	4) "interface" provides "fully abstraction" but "abstract classes" does not
 	5) Why do we need "interfaces" while we have "abstract classes"?
 		Java does not support "multiple inheritance".
 		It means a class cannot have multiple parents.
 		But sometimes we need multiple parents because of that Java created "interfaces"
 		Multiple inheritance is not the case for abstract/concreate classes.
 	6) When do we use "interfaces" ?
 		a) When we need to create multiple parent for a class we use interfaces
 		b) "interfaces" are "to-do list", if you want a child class to do sth,
 			put them into an interface
 	7) use "implements" keyword between concreate/abstract class and interface
 	   use "extends" keyword between interface-interface
 	
 	8) When a concreate class has multiple parent interfaces, the parent interfaces may have
 		methods whose signatures are the same and return types are the same. It is allowed.
 	
 	Note: If you use different return types with same signature, it causes problem,
 		  you"ll get Compile Time Error
 	
 	9) When you make an interface child of another interface, no need to override abstract methods
 	
 */

public interface I01 {

}
