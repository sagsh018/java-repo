package org.sharma;

import org.sharma.testrun.*;

public class Main {
	public static void main(String[] args) {
		/*
		 * So here we are going to study about the logic behind the static keyword.
		 * To under stand this first we need two classes
		 * 1) Main class having main method and its in package org.sharma
		 * 2) TestStatic which is going to have the static variable defined inside that and it will beunder package org.sharma.testrun
		 * 
		 * but first lets create the required classes and perform the test on a variable without using static
		 * 
		 * So if you check the class TestStatic, there is one provate variable and its value is initialized with locally and its going to 
		 * get initialized at the time of calling the default constructor
		 * after that we have one getter method to get the value, and one setter method to change the value of it
		 * lets go ahead and create an object of class TestStatic class
		 */
		
		System.out.println("Value of obj1 is : " + TestStatic.getTestVariable());
		// Now lets also try to modify the value of v with the help of setter method
		TestStatic.setTestVariable(1);
		// again printing the value of testvariable
		System.out.println("Value of obj1 is : " + TestStatic.getTestVariable());
		
		/*
		 * Now lets create another object of this StaticTest class as below and checkout the value of it
		 */
		
		// Notice that as soon as we are creating the object of this class as in above statement, the default constructor is initializing
		// the value of testvariable to 0
		System.out.println("Value of obj2 is : " + TestStatic.getTestVariable());
		// So this will print value of testvariable back to 0.
		// again lets set the value of it with setter method
		TestStatic.setTestVariable(24);
		// and again printing the
		System.out.println("Value of obj2 is : " + TestStatic.getTestVariable());
		// and this will print value as 24.
		
		/*
		 * Now this functionality which we have shared above, in this everytime we are creating instance of class StaticTest, the fresh copy of 
		 * variable is getting created, and everytime that fresh copy is getting initiated with the help of default constructor. so here
		 * every instance of the class has its own copy of a testvariable
		 */
		
		/*
		 * Now suppose if in the TestStatic class if we change the normal private variable testvariab as a static variable. Now as soon as we 
		 * mark the testvariable as static, there will be only one copy of testvariable now, and every instance is going to share the same copy
		 * of that varaible in the memory
		 * 
		 * So after changeing the testvariable to static if we try to create another instance of TestStatic and try to get the value, then you
		 * won't get 0 because that will not be a new copy its going to be smae old copy from previous. 
		 * Note that static variable, always have one copy of a variable in memory in java
		 */
		
		System.out.println("Value of obj3 is : " + TestStatic.getTestVariable());
		// This will not print value as 0 instead this will print the value as 24, which is from the previous copy only. so there is only one copy
		
		/*
		 * Now there are couple of things to notice about the static variable
		 * 1) static variable must be accessed inside the static method, so inside our class StaticTest we will change the mehtods to static
		 * 2) Also as soon as you will change the methods to static, there will be a warning, to access the static variable in a static way
		 * 		and that is using the Classname.static variable. check out the setter method of class TestStatic.
		 * 3) similarly in our main class we are trying to access and set the value of testvariable using objects of class TestStatic and
		 * 		its getters and setters. so here couple of changes required
		 * 		a) since now both the getters and setters mehtods are static as they are using static variable inside TestStatic class, hence
		 * 			these need to be accessed in a static way, that is instead calling the with the help of instance name, we will call them
		 * 			using the class name only. see the above the way they are called now
		 * 		b) Now since they all are called with the class name directly so there is no need to have instance created here, so we can remove 
		 * 			instance creation from the file.
		 * 4) Notice that since we are not making multiple copy of a static variable or a static mehtod, so there is no need to creating the 
		 * 		instance of that class, we can directly access the static variales and methods of a class with the classname itself.
		 * 
		 * 5) Now here we have dealt with the static variable and static method, but if we try to make our class TestStatic as static, it won't
		 * 		work
		 * 		we will later how to mark a class as static.
		 */
	}
}
