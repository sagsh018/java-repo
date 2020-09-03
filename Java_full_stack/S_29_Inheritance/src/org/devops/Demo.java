package org.devops;

import org.devops.vehicles.*;

public class Demo {
	public static void main(String[] args) {
		/*
		 * This project is for understanding inheritance.
		 * This is a main class where all the classes and methods will be called.
		 * 
		 * Notice the architecture which we are going to implement for this inheritance example:
		 * 
		 * => package 1 :: org.devops
		 * 	  ========================
		 * 	  Class : Demo (Main class)
		 * 
		 * => package 2 :: org.devops.parent
		 *    ==============================
		 *    class : Vehicle (Parent class)
		 *    
		 *    Attributes (common attributes for all type of vehicles)
		 *    =======================================================
		 *    a) engine
		 *    b) wheels
		 *    c) seats
		 *    d) fuel tank
		 *    e) lights
		 *    
		 * => package 3 :: org.devops.vehicles
		 *    ================================
		 *    classes 
		 *    	(Specific attributes for bike car and truck are kept inside those classes)
		 *    	A) Bike (child class)
		 *    		i) handle
		 *    	B) Car (child class)
		 *    		i) steering
		 *    		ii) music system
		 *    		iii) seat belt
		 *    		iv) air conditioner
		 *    		v) fridge
		 *    		vi) entertainment system
		 *    	C) Truck (child class)
		 *    		i) steering
		 *    		ii) music system
		 *    		iii) seat belt
		 *    		iv) air conditioner
		 *    		v) container
		 *    
		 * So lets go ahead and populate the above classes with there respective attribute. note that initially for explanation we are going to
		 * keep the attributes as public, and later change them to private.
		 */
		
		
		/*
		 * Now lets go ahead and create our first object for Bike class, and try to assign some value to the handle attribute, which is specific
		 * to the bike. and notice, as we will try to assign some value to the handle attribute of class manually here, hence we have kept the
		 * attribute inside the class as public for now and we will change it later according to our need.
		 * 
		 * Also notice that, since Bike() class is in separate package "org.devops.vehicles", so we will have to import this class or entire
		 * package in this class by using below import statement
		 * import org.devops.vehicles.*;
		 */
		Bike bike = new Bike();
		// Now lets try to assign some value to the specific attribute of a bike
		bike.handle = "straight";
		// To access the common attributes of bike, which are there in parent class we will have to extend the class in child class Bike 
		// by using "extends" keyword and by using "import" to import vehicle class in Bike class. see Bike class for more details
		// after importing the Vehicle class in Bike class, we can access common attributes as well
		bike.engine = "petrol";
		bike.wheels = 2;
		bike.seats = 2;
		bike.fueltank = 1;
		
		System.out.println("Bike has "+bike.engine+" engine");
		
		// similarly we can extend Vehicle class from parant package to Car and Truck classes so that there object have access to common 
		// attributes as well.
		
		/*
		 * notice that one of the common attribute for Bike class which is lights is not yet initialized with other in above statements,
		 * So if we try to access that variable before initializing it, we will get the null value
		 */
		System.out.println(bike.lights); // o/p: null
		//Since have not initialized the lights attribute here.
		
		/*
		 * another thing to notice here is that if all the attributes are made private, which actually should be the case, we won't be able to 
		 * initialize or access them as we are doing in above code.  in that case we would need wither the constructor to initialize them and
		 * getters to access them.
		 * 
		 * another thing to notice is that, if any attribute is private, then it won't be inherited from the parent class to child class
		 * 
		 * so lets go ahead and make all them private now. and see how constructor can help us in this
		 * 
		 * and we will see this part in the next project for inheritance named as Inheritance_part_2.
		 */
		
	}
	
}
