package org.composition;

import org.composition.laptop.*;
import org.composition.laptop.components.*;

public class Demo {
	public static void main(String[] args) {
		/*
		 * So here we are going to study the concept of composition.
		 * consider the below scenerio about laptop, which is made up of multiple components/attributes
		 * 
		 * Class : Laptop
		 * ===============
		 * screen : simple attribute/property
		 * processor : it is going to be of data type of class type and inturn will have attributes inside of it. So this is complex property
		 * Ram : simple property
		 * Hard drive : simple property
		 * Graphic card : again this is a complex property, as it will contain its own features and attributes.
		 * optical drive : simple property
		 * keyboard : simple property
		 * 
		 * So above type of scenerio is called as an example of composition
		 * 
		 * So to implement this laptop class we will have to have other two attributes of class type.
		 * So lets create this kind of scenerio and start working on it
		 * 
		 * package 1 : org.composition
		 * ==========================
		 * class : Demo.java ==> main class
		 * 
		 * package 2 : org.composition.laptop
		 * ==================================
		 * class: Laptop.java ==> this is going to be a child class which is going to inherit two more classes for processor and graphic card.
		 * 
		 * package 3 : org.composition.laptop.components
		 * ==============================================
		 * classes :
		 * 		1) GraphicsCard.java => parent class for graphic card attribute of Laptop class
		 * 		2) Processor.java => parent class for processor atribute in Laptop class
		 */
		
		/*
		 * now once the classes are created and kept under packages as above we are going to define the attributes of alptop class
		 * notice that it will have two attributes of type class and those will be of GraphicsCard and Processor
		 * please check out the Laptop.java class for details
		 * Also notice that for using the attributes of type GraphicsCard and Processor we will have to import those classes first
		 * this is done by importing the entire package.
		 * 
		 * similarly we are also going to define the attributes of the GraphicsCard and Processor class attributes
		 */
		
		/*
		 * once the attributes are defined, we are then going to define the constructor of all the classes, both default and 
		 * parameterized as well.
		 * see the classes again for details
		 * 
		 * notice the class Laptop where we have two of the attributes as of type class Processor and GraphicsCard. look the default constructor
		 * where we have created instance of component classes to initialize the class type attributes of Laptop class with the help of default
		 * constructor of Processor and GraphicsCard.
		 */
		
		/*
		 * Now lets create an object of class Laptop with the help of default constructor which will initialize the attributes of laptop class
		 * Notice that when we call the Laptop class constructor, it is going to initialize the simple attributes of Laptop class and alson with 
		 * that its going to call default constructors of Processor and GraphicsCard class as well and initialize there attributes with the help 
		 * of default constructor again
		 * 
		 * so lets create an instance of Laptop class
		 */
		
		Laptop lappy = new Laptop();
		
		// Now lets print this instance and try to check out the initialized values of laptop class simple attributes and complex attributes
		
		// System.out.println(lappy);
		// So currently the above statement will just give is the memory location for this lappy instance. to have string version of this we will
		// have to have a special method inside Laptop, Processor and GraphicsCard as well
		// please check out the classes for toString() configuration and print the instance of Laptop class again.
		
		System.out.println(lappy);
		// this time we will get the attributes and there values for all three classes as they are called.
		
		/*
		 * Now suppose if we would like to access the attribute of Processor class, we can do that with the help of instance of class Laptop.
		 * since we have Processor class attribute defined inside the Laptop class
		 * 
		 * so first lets create the getter method in Laptop class on processor attribute named as getProcessor(), and then try to access it using
		 * Laptop class instance as below
		 */
		System.out.println("*****************************************");
		System.out.println(lappy.getProcessor());
		
		// so with the help above statement, we are trying to access the Processor class attribute defined inside Laptop class, and which is 
		// nothing but the object of class Processor, so with the help of toString() method entire Processor class attributes will get printed.
		
		/*
		 * Now our next task is to print the specific attribute of class Process with the help pf Laptop class instance "lapy"
		 * for that first of all we will have to create getters inside Processor class which we will call in above statement.
		 */
		
		System.out.println("*****************************************");
		System.out.println(lappy.getProcessor().getBrand());
		// This sill help to grab a single attribute of Processor class object.
		
		/*
		 * So till now we have used default constructors for Laptop class, Processor and GraphicsCard classes. 
		 * Next we will try to initialize the Laptop class attributes with the help of Parameterized constructor.
		 * but notice that Laptop class consist of complex attributes of class Processor and GraphicsCard. So first we will have to create
		 * object of Processor and GraphicsCard class
		 */
		
		Processor processor = new Processor("Intel", "i 5", 9, 10, 5, "200GB", "6 GHz", "2 GHz", "7 GHz");
		
		GraphicsCard graphicscard = new GraphicsCard("nvidia2", 340, "50 GB");
		
		// Now lets create object of class Laptop and pass in these processor and graphicscard object to that call of parameterized construcor
		// of Laptop class.
		
		Laptop lappy1 = new Laptop(18.6f, processor, "20GB" , "5TB", graphicscard, "FLT layer", "frontlit");
		System.out.println("*****************************************");
		System.out.println(lappy1);
		
		/*
		 * Now suppose i want to convert our laptop to gaming lap and we want to switch on gaming mode of our laptop. 
		 * So for this we are going to add in the functionality/method() in our laptop class in order to switch on gaming mode of our laptop
		 * and note that we can switch on the gaming mode of our laptop by increasing the frequency of our processor to maximum frequeny and 
		 * also increasing graphicscard memory.
		 */
		
		// so for that first create the new instance of laptop class
		
		// Laptop gaminglaptop = new Laptop(18.6f, new Processor("Intel", "i 5", 9, 10, 5, "200GB", "7 GHz", "2 GHz", "7 GHz"), "20GB" , "5TB", 
		//							new GraphicsCard("nvidia2", 340, "100 GB"), "FLT layer", "frontlit");
		
		// So one way is as above to initiate the frequency and graphicscard memory again with the required values and printing the object as 
		// System.out.println("*****************************************");
		
		// System.out.println(gaminglaptop);
		
		/*
		 * Now lets look at other way of doing the same using method/functionality inside laptop class to conver the laptop to gaming laptop
		 * see laptop class having the method convertGaming()
		 */
		
		System.out.println("*****************************************");
		Laptop gaminglaptop = new Laptop(18.6f, new Processor("Intel", "i 5", 9, 10, 5, "200GB", "3 GHz", "2 GHz", "7 GHz"), "20GB" , "5TB", 
											new GraphicsCard("nvidia2", 340, "100 GB"), "FLT layer", "frontlit");
		// now we will first change the value of freq to max freq for a processor using method of Laptop class
		gaminglaptop.convertGaming();
		// now lets check the freq part of laptop only
		System.out.println(gaminglaptop.getProcessor().getFrequency());
	}
}
