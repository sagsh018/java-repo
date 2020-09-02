package org.sharma;

public class ConstructorTheory {
	public static void main(String[] args) {
		/*
		 * So here we are going to take a look at constructor in java
		 * So constructor is nothing but a special type of method inside the class:
		 * 1) which has same name as that of a class
		 * 2) Which does not have any return type
		 * 3) which is called automatically at time of creation of object of a class
		 * 4) which is usually used to assign the values to the attributes of the class at the time of object creation
		 * 5) like any other method overloading of constructor is allowed.
		 * 
		 * So here we will take a look at the example of a car, where we have included getters and setters to populate the values of 
		 * attributes of the class
		 * 
		 * but here we will see two ways to populate the attributes of the class using constructor
		 * 1) static way
		 * 2) dynamic way
		 * 
		 * lets create a copy of Car.java class as Car1.java and we will play with that file here.
		 */
		
		// Now lets create an object of class Car1 and as soon as we will create an object of this class it will call the constructor 
		// and some default values will be assigned to the atributes of the class
		
		Car1 car = new Car1();
		
		// and then we can directly call the run method and see whats going to be an output
		System.out.println("Car is : " +car.run());
		
		/*
		 * Now lets create another instance of class Car1 and this time we will be passing parameters which will be recieved by constructor with 
		 * argument.
		 */
		
		Car1 car_new = new Car1("closed", "on", "present", 30);
		
		// and now call the run method of this class with this new object
		System.out.println("Car is : "+car_new.run());
	}
}
