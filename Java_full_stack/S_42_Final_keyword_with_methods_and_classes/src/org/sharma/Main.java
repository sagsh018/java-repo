package org.sharma;

public class Main {

	public static void main(String[] args) {
		/*
		 * So here we are going to understand the oncept of final leyword when applied over method and class
		 * Suppose we have below mentioned classes
		 * 1) Main class :: org.sharma
		 * 2) A class :: parent class having two methods and it is extended by class B and class C
		 * 3) B and C class:: which are child classes and going to extends the class A and also override class methods
		 * 
		 * Now go and check out the class A and B first 
		 * 
		 * So if you will notice, in class A we have two methods india and USA, and class B has overriden only one of the method USA.
		 * lets create object of class B and try to access both the methods india() and USA().
		 */
		
		B b1 = new B();
		b1.india();
		b1.USA();
		/*
		 * so we can see that for method india() value from parent class A is printed and for method USA() value from child class B is printed
		 * so we are successfully able to override the method in this case.
		 * So this is a normal senerio
		 */
		
		/*
		 * Now lets consider another class C with two methods and out of that one method is marked as final and other one is normal
		 * check out the class C
		 * then there is class D which extends class C, and if you will notice, as soon as we try to override the method india() in class D which
		 * is marked as final in class C, we will get error.
		 * because final method is not allowed to be overridden. so in this case we can only override method USA of class C in child class D.
		 * 
		 * Now suppose if we want to mark all the methods of class C as final, so instead of marking all the methods as final we can directly
		 * mark the entire class as final. but this create an impact on the Class D, that class D won't be able to extend class C anymore.
		 * So final class can't be extended foe inheritance
		 * 
		 * So as a result, we won;t be able to extend class C to class D anymore as class C is now marked as final
		 * 
		 */
	}

}
