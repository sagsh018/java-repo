package org.sharma;

public class ClassIntroduction {
	public static void main(String[] args) {
		/*
		 * So here we are going to start the introduction for class in java
		 * notice in java everything is inside the class, there is nothing without class in java
		 * thats why java is called as completely object oriented programming language.
		 * 
		 * As we are seeing this program we are having a class named as "ClassIntroduction".
		 * Class is nothing but a customized, user defined data type\
		 * Class is also called as a template of object, or plan of object. So by looking at class we can tell what would an object of this
		 * class will look like
		 * 
		 * We can easily relate the object in real life with the java objects.
		 * for example Laptop is an object and it has different attributes/properties, like its screen, its keypad, its color, its size, its ram size, etc
		 * and it also has some functions which is performs like typing, displaying, calutating, etc
		 * similarly we can have objects in java with the attributes/properties associted with that along with the methods that are going to define the 
		 * functionality of that object.
		 * 
		 * classes are also called as template or blue print of an object
		 * 
		 * Notice, 
		 * 1) properties/attributes/state of object ==> these are all same.
		 * 2) functions/methods/behaviuor ==> these are all same
		 */
		
		/*
		 * Now here we are going to see one example of car object, we will define a class named as Car, in other file named Car.java
		 * and we will create the object of that class here in this class and try to access its properties and methods
		 */
		
		/*
		 * Here we will create an object of class Car and try to set the speed and get the speed of it
		 */
		
		Car car = new Car();
		car.setSpeed(100);
	
		System.out.println("Current speed of a car is : "+ car.getSpeed());
	}
}
