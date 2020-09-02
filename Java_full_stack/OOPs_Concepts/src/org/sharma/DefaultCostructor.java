package org.sharma;

public class DefaultCostructor {
	public static void main(String[] args) {
		/*
		 * So here we are going to study the oncept of default constructor.
		 * So Default constructor is a simple empty constructor injected by java if there is no consructor is created by the user
		 * note that this constructor is by default injected so every class has a constructor and this is invisible
		 * 
		 * Lets consider the example of new class named as SmartPhones and having one attribute named as brand and one method called
		 * as getBrand()
		 * So we will initialize the attribute with some static value and try to get the value of it using getBrand()
		 * 
		 */
		
		// Lets create the object of the class SmartPhones here and notice in the that class we have not created any constructor, only mentoned
		// it in comments, so java will inject the same default constructor 
		
		SmartPhones phone = new SmartPhones();
		System.out.println("Brand of the phone is : " +phone.getBrand());
	}
}
