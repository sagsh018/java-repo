package org.sharma;

import org.sharma.demo.Outer;

public class Main {
	public static void main(String[] args) {
		/*
		 * So here we are going to study about the static inner class
		 * for this we need
		 * 1) Main class :: org.sharma
		 * 2) Outer class :: org,sharma.demo. This class is going to contain one more class "Inner"  which will be static  and everything inside 
		 * 	 	this  Inner class will also be static.
		 * 
		 * Lets see it in example
		 * if you notice inside the class Outer, the Inner class is marked as static and this will be allowed
		 * 
		 * 
		 * 		
		 */
		System.out.println(Outer.Inner.x);
		// So we are directly able to print the value of x as this is a static variable inside the static class so no need to have a instance
		Outer.Inner.innerStaticMethod();
		
		/*
		 * Note
		 * 1) outer clas cannot be marked as static, we will get error, because in the outer class we can only have public, abstract and final
		 * 2) from the Inner class we can't mark is as private, otherwise nothing inside the Inner class will be accessible in main class
		 * 3) we can't remove Static from Inner class, otherwise we won;t be able to use static variables or static method inside the non static 
		 * 		class. notice this is only allowed to have static method inside non static class for top level main class, see our main class
		 * 		which is non static still has static main method but since this is top level hence allowed
		 * 4) we can't mark variables as private otherwise they won;t be accesible
		 * 5) we can't mark variables as non static, otherwise we won't be able to access thos variables in a static way
		 */
		
		/*
		 * Now suppose inside Outer class there is one variable testvariable1 and one method outerMehtod1(), and both are of non static type
		 * So if we would like to access these non static variables and methods inside the static inner class, we will have to create and object
		 * of the outer class inside the static Inner class and then only its going to be possible
		 * 
		 * but we change the outer class variable testvariable1 and outerMethod1 as a static type than we can access these inside the 
		 * static inner class in a static way
		 * for this we are defining another variable and method as testvariable2 and outerMethod2()
		 */
		
		/*
		 * one final point to discuss about is to access the Inner class static variable and static method in outer class method
		 * so lets have another method named as outerMethod3() in Outer class and we will try to access the Inner static class variable and 
		 * method inside this outer class method
		 * if you will notice the outer class method outerMethod3(), we are able to access the inner class static variables with static way
		 * and if we put static with the outerMethod3() method od outer class then we would be able to access that in our main method again
		 * in a static way instead of access it with the help instance
		 */
		
		Outer.outerMethod3();
		
		/*
		 * take aways
		 * 1) inside non static class or method we can;t have static variable or method
		 * 2) inside static class or method we can have non static variables or method declared.
		 * 3) inside non static class or method we can access static variables or method by using class name, if its in different class or with
		 * 		even using class neme if its in same class.
		 */
	}
}
