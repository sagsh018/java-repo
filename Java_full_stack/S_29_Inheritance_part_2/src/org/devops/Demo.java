package org.devops;

import org.devops.vehicles.*;

public class Demo {
	public static void main(String[] args) {
		/*
		 * So in this second part of inheritance we are going to make all the specific and common attributes as private and then try to 
		 * implement the inheritance.
		 * 
		 * Here we will make use of constructors to assign values to the attributes of the classes.
		 * 
		 * Now after making all the attributes private, we won;t be able to access or assign any values to them
		 */
		
		/*
		 * now lets add two constructor in Vehicle class 
		 * 1) default constructor which is going to assign some default values to the attributes of class Vehicle and
		 * 2) parameterized constructor, where we are going to pass in parameters to initialize the attributes of the class
		 * check out vehicle class for details
		 */
		
		/*
		 * Now lets go to the vehicles packages classes : Bike, Car, and Truck and create default and parameterized constructor for them
		 * Notice that these classes are extending the parent class Vehicle, so there should be something that should call default and parameterized
		 * constructor of parent class in child class, so that parent class attributes get initialized as well. because we are never going to call
		 * parent class constructor directly. So this can be achieved using the spcial method call named as super(), which basically call the
		 * parent class constructor in the the child class
		 * see the Bike, Car and Truck class for details
		 * 
		 * So once contructors of all three classes are defined, we will also defined getters for all three classes and also for Vehicle class
		 * so that child classes objects can access the common attribute as well
		 * go ahead and see all the classes details.
		 */
		
		/*
		 * once all the classes has constructor and getters set, lets create the object of first class as below 
		 */
		
		Bike bike = new Bike();
		// So here we have created the class object without passing any parameter, so default constructor of class Bike will be called, and because
		// of super() method inside the Bike class default constructor, the default constructor of class Vehicle will also be called and initialized
		// the common attributes. So this is how specific attributes of class Bike and common atributes in class Vehicle are initialized with the 
		// help of object of class Bike
		// Now lets try to access the attributes of Bike class as well its parent class,
		
		System.out.println("The handle of bike is " + bike.getHandle());
		// So in above statement we have accessed the specific attribute of class Bike. Now lets try to access the common attribute as well
		
		System.out.println("The engine of bike is " + bike.getEngine());
		System.out.println("The number if wheels in bike are " + bike.getWheels());
		
		/*
		 * So till now we have used the default constructor to assign values to specific and common attributes both. Lets move on how to use 
		 * parameterized constructor in this case.
		 * 
		 * so we need to take below steps 
		 * 1) we need to create object of classes like Bike, Car and Truck using parameterized constructor.
		 * 2) In parameterized constructor, we will pass in the parameter not only for specific attributes but also for the common attributes
		 * 3) These specific and common attributes parameters will be received by the parameterized constructor of respective class.
		 * 4) then from there the common paramters will be passed on to the supper method call in that constructor
		 * 5) and that super method while calling parent class constructor will pass thos parameter to the arguments of parameterized constructor
		 * 
		 * So lets go ahead and create the object of class bike but this time by passing the parameters for both specific attribute and common 
		 * attributes as well
		 */
		
		Bike bike1 = new Bike("short", "deisel", 2, 2, 35, "LED");
		System.out.println("Bike handle is " + bike1.getHandle());
		System.out.println("Bike engine is " + bike1.getEngine());
		System.out.println("Bike wheels are " + bike1.getWheels());
		System.out.println("Bike seats are " + bike1.getSeats());
		System.out.println("Bike fuel tank is of " + bike1.getFuelTank() + "L");
		System.out.println("Bike has " + bike1.getLights() + "Lights");
		// So this is how we can call the constructor of a parent class alsong with passing the parameters into it while creating the object of
		// child class.
		
		/*
		 * So we are able to assign the values to the parent and child class attributes with just one statement while creating the object of the class.
		 * but for printing the attributes we have to call in getters with differnt print statement.
		 * 
		 * but suppose if instead of printing the object references, if we try to print the object itself. lets try that
		 */
		     // System.out.println(bike1);
		/* 
		 * so the output for above print statement will be : org.devops.vehicles.Bike@3830f1c0
		 * So this is nothing but the name of class for this object and its memory location in string format.
		 * so to get what we want while printing object of this class, we will overload one method named a toString inside our vehicle classes
		 * see the vehicle classes to get the complete picture
		 * 
		 * Now after overloading the toString method inside the Bike class, lets try to print the instance of class Bike
		 */
		System.out.println("========================================");
		System.out.println(bike1);
		/* 
		 * So now with just one statement we are able to print all the attributes as well.
		 */
		
		/*
		 * So till now we have seen the stuff related to the attributes of the parent and child classes.
		 * Now suppose if there is some method in parent class, and is inherited in child class. So here we are going to study another concept 
		 * called as method overriding
		 * 
		 * Suppose you have a method named as run() inside Vehicle class and its simply returning the string "running vehicle", now since we are
		 * extending vehicle class inBike, Car and Truck class well, so we can actually override the run() method in child classes according to our
		 * need. and 
		 * 
		 * overriden method
		 * ================
		 * This is a method which has same signature as that of original method, that means it has same return type, same number of argument, 
		 * everything same, but in inheritance the child class method has more precedence than parent class one, that will be called when we will
		 * call the method after overriding it.
		 * see the vehicle and Bike class and try to under stand
		 */
		
		bike1.run();
		// Now this method will print whatever define inside the child class Bike and not what is written in parent class Vehicle
		// So this is how in inheritance the method is overridden and used accordingly in our child classes.
	}
}
