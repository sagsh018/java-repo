package org.sharma;

public class EncapsulationConcepts {

	public static void main(String[] args) {
		/*
		 * So here we are going to study the basic concept behind the encapsulation.
		 * So Encapsulation says that the attributes of a class should be there inside a kind of shell. means they should be encapsulated and
		 * direct access to outside world should not be allowed to those attributes.
		 * 
		 * if someone need to access those than there are different ways of initializing and getting and setting the values of the attributes
		 * 1) constructor ==> this could be default or paramaterized, these should be used if someone wants to initialize the attributes
		 * 		of the class
		 * 2) getters and setters ==> these are the methods inside the class, and used for setting up the values and getting the same values
		 * 		as and when required.
		 * 
		 * notice at any cost direct access should not be allowed to private attributes of class and they should be encapsulated.
		 * 
		 * Also if we want to make sure that attributes of the class should be initialized with some value at the time o creation of instance 
		 * of that class, then in that we remove the default constructor and only place parameterized constructor, so that user has to pass in the
		 * parameters to constructor at the time of creation of instance.
		 * 
		 * Also Encapsulation make sure sure that as soon as you define the attributes inside the class, they are initialized with some null
		 * value for integer variables and with 0 for integer or floating poing numbers.
		 * 
		 * let see the example below in order to understand the encapsulation
		 */
		
		Friend f1 = new Friend("sagar", 28);
		System.out.println(f1.getAge());
		f1.setAge(30);
		// notice any modifictation should be done using only setters and not directly.
		System.out.println(f1.getAge());
		
		// So we can also put in the condition while setting up the values using setters to that value remains in a range, see the setter method in Friend.java class.
		
		// So this is whole and sole idea behind the encapsulation
	}

}
