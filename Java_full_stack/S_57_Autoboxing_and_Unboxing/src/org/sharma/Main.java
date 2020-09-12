package org.sharma;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*
		 * So lets consider the below example of an ArrayList, where we want to create an ArrayList of student roll numbers. Now
		 * since the roll number of students is integer entitiy so we will try to create an ArrayList of integers as below
		 */
		
		// ArrayList<int> studentNumbers = new ArrayList<int>();
		/*
		 * Now if you will notice this above statement will start thowing errors, and this is becasue inside ArrayList we can only provide
		 * data type of class type, that means there should a class and since we aer trying to give "int" which is primitive data type, hence
		 * java is throwing back the compile time error.
		 * 
		 * So there are two ways to overcome this, 
		 * 1) Use the already existing wrapper classes for primitive data types like "Integer" for int, Float for float, Double for double and so 
		 * 		on
		 * 2) create our own wrapper class and then use it inside ArrayList
		 * 
		 * So lets first take a look at the first method
		 */
		
		ArrayList<Integer> studentNumber = new ArrayList<Integer>();
		
		// lets try to add an element to this ArrayList using build in method of this
		
		studentNumber.add(50); // Autoboxing
		System.out.println(studentNumber.get(0)); // Auto-unboxing
		
		/*
		 * So we are able to add the element of data type wrapper class Integer successfully and also able to retrieve is easily. but the same
		 * we are unable to do with primitive data type. 
		 * So this is working with "Integer" because Autoboxing and Unboxing is working in the background. 
		 * In order to understand this we will have to create our own wrapper class and then we will use it
		 * 
		 * So lets start with that.
		 * for that we will first create a wrapper class. Wrapper class is something which has only one attribute and for that attribute there is 
		 * a parameterized constructor and getters and setters method.
		 * So look at the class definition for wrapper class under same package org.sharma named as IntWrapper class
		 * 
		 *  Now once this wrapper class for integer is created we will again try to create an ArrayList but this time instead of passing Integer
		 * wrapper class we will pass in IntWrapper class which we have created
		 * check out the below statement
		 */
		ArrayList<IntWrapper> studentNumber1 = new ArrayList<IntWrapper>();
		// Now lets try to add element to this ArrayList of type Wrapper class IntWrapper using add method 
		// studentNumber1.add(50);
		/* 
		 * now if you will remove comments for above add method statement, it will start throwing error, by complaining that we are passing 
		 * unmatched argument to the add method, but when we were passing the Integer wrapper class to ArrayList this error was not there
		 * this is because in the background Autoboxing and unboxing is playing its part and it is implemented automatically
		 * 
		 * but when we are trying to make us of wrapper class for int which we have created, this is not the case and we have to implement 
		 * autoboxing and unboxing manually.
		 * 
		 * so lets first of all apply boxing in order to make use of wrapper class we have created. see the statement with the comment boxing
		 */

		studentNumber1.add(new IntWrapper(50)); // Boxing
		
		/*
		 * So if we see the complain by java in above add method statement for studenNumber1,it was said that we are providing wrong argument 
		 * and there was type mis match error, so what was expected there was the the conversion of primitive data type value 50 to object
		 * of that wrapper class and we did the same thing in above statement and java has stopped complining, and this is called as boxing
		 * where we are boxing the primitive data type value into the object/class of that type.
		 * 
		 * So here we are doing thie boxing manually, wherease when we were using "Integer" class boxing was happening automatically, which is
		 * called as Autoboxing
		 */
		
		/*
		 * Now lets see what is called as Auto unboxing, unboxing means converting the object type into primitive data type. So when we will try
		 * to print the value in ArrayList we have added above we have to make use of get() method, but that get() method of ArrayList is going
		 * to return the object type for IntWrapper as we have added the object type using manual boxing, so here we will have to unbox that object
		 * type to primitive type manually getter method of class IntWrapper as below
		 */
		
		System.out.println(studentNumber1.get(0)); // This will just print the address location of an object of that IntWrapper class we we boxed
													// manually and passed as an argument to add() method. so we will put getter method in front
													// of it and it will return primitive type value at index 0
		
		System.out.println(studentNumber1.get(0).getIntValue()); // Unboxing
		/*
		 * Now this was happening automatically when we were using Integer wrapper class and at that place is called as aut unboxing.
		 */
		
		/*
		 * Now lets consider another ArrayList, here we will checkout the actual thing happen in the backgroud when auto boxing and unboxing 
		 * takes place. means we will check out the ways how java in the backgroud does this task
		 */
		
		ArrayList<Double> doubleList = new ArrayList<Double>();
		// To add the element to this ArrayList
		doubleList.add(50.45D); // This is normal method which a programmer will and in the backgroud Autoboxing will take place
		doubleList.add(new Double(40.56D)); // Manual Boxing
		doubleList.add(Double.valueOf(30.67D)); // This is what Java does in the background during auto boxing.
		
		// To print the elements from the ArrayList
		System.out.println(doubleList.get(0)); // Auto unboxing
		System.out.println(doubleList.get(0).doubleValue()); // This is java does in the background while doing auto unboxing.
		
		/*
		 * Notes
		 * =====
		 * While doing the actual programming, we never worry about the background process of boxing and unboxing and we take privilege
		 * of Java autoboxing and unboxing, and we simply code our stuff as below
		 * consider the two example, one for int, and one for float
		 */
		
		ArrayList<Integer> newIntList = new ArrayList<Integer>();
		newIntList.add(10);
		System.out.println(newIntList.get(0));
		
		ArrayList<Float> newFloatList = new ArrayList<Float>();
		newFloatList.add(23.6F);
		System.out.println(newFloatList.get(0));
		
	}
	
	

}
