package org.sharma;

public class Main {

	public static void main(String[] args) {
		/*
		 * So here we are going to have a look at the final keyword
		 * This keyword final can be appied to a variable, a method or a class same as static can be applied to all these three as well
		 * When final is applied to a variable, it does not means that the variable become constant, its just that once the value is assigned to
		 * a final variable, it cannot be reassigned after that with new value. and reassignment in case of normal variable is allowed.
		 */
		
		/*
		 * 1) main class :: org.sharma
		 * 2) class A  :: org.sharma :: parent class
		 * 3) class B :: org.sharma :: child class, extends class A
		 * 4) class C :: org.sharma :: child class, extends class A
		 */
		
		/*
		 * Now notice class B, having some normal variable which is marked as private, this variable will have default constructor, parameterized
		 * consturctor, getter method, setter method to do all sorts of things. see class B
		 * lets create an object of class B and try to initialize the variable x with default and parameterized constructor and then try to
		 * get the value using getter values
		 */
		
		B b1 = new B();
		System.out.println(b1.getX());
		// This will print the value initialized by default constructor
		
		B b2 = new B(40);
		System.out.println(b2.getX());
		// This will print value assigned by parameterized constructor
		
		// Now lets also set the value of x with the help of setters
		
		b2.setX(60);
		System.out.println(b2.getX());

		/*
		 * So we can clearly see that variable x since is a normal variable we can assign it a value, and then reassign the new value as well to
		 * it. 
		 * 
		 * Now consider another variable y in class C, and with this we will make use of final keyword.
		 * Notice that we would be able to initialize the value of final attribute y with the help of either default constructor or with the
		 * help of parameterized constructor or by the setter method. notice only one can initialize the value that only once.
		 * after that we cannot reassign new value to variable y as it is final
		 */
		
		C c1 = new C();
		System.out.println(c1.getY());
		// So now for an instance c1 value of y s initialized and cannot be reassigned with new value
		// so for this variable y which is final there is no use of have a setter method as the value is already initialized by the default 
		// constructor 
		
		/*
		 * Notice that in class C y is final attribute but not static, so this final keyword restriction is there for perticlular copy of a 
		 * variable created for a instance of this class
		 * if we apply static as well here than there will be only one copy and even more restricted.
		 */
		
		/*
		 * So till now we have seen the final keyword with the attributes. Now we will proceed further and check out the working of final
		 * keyword with methods and classes. we will see this in next lecture
		 */
	}

}
