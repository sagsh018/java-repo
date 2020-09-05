package org.sharma;

import org.sharma.phone.Iphone10;
import org.sharma.phone.OnePlus5;
import org.sharma.phone.Phone;

public class Main {
	public static void main(String[] args) {
		/*
		 * So here we are going to understand the concept of interfaces, interfaces helps us in standardising our applications.
		 * So basically with the help of interfaces we can apply some rules and regulations to our classes and those rules and regulations helps
		 * us in standardizing our application
		 * 
		 * Also interfaces also helps us in implementing the concept of polymorphism
		 * So lets get started and see the concept of interfaces.
		 * 
		 * class 1 : Main class having main method under package "org.sharma"
		 * class 2 : OnePlus5 class, having only one method returning the name of the processor of one plus 5. see the class for details
		 * 				package name for this => org.sharma.phone
		 * 
		 * Now with this lets first create the object for class OnePlus5 in our main class and try to call processor method for that
		 *
		 */
		
		/*
		OnePlus5 phone = new OnePlus5();
		System.out.println("Processor of phone is : " + phone.processor());
		*/
		
		/*
		 * So in above example we just have once class named OnePlus5 and one method inside that class named processor and we are easily 
		 * creating the object of the class and accessing the value
		 * now consider the senario where there are multiple classes for multiple phones and there are different developers developing those 
		 * classes and every developer will have different way of developing the class and method name and method signature
		 * now this could lead to a risk of application brokage.
		 * 
		 * Suppose our method which is returning the int value, and suddenly someone comes in and change the return type of that method and
		 * method start returning string value, the moment this will happen our application will start working because our object will become
		 * wrong.
		 * 
		 * So to avoid these kind of senarios, there should be some kind of rules that must be followed in order to decide the signature of a
		 * method and return type of that and name of that.
		 * So this is doen with the help if interfaces in Java.
		 * So lets go ahead and define the interface named Phone in our example under the same package "org.sharma.phone"
		 * 
		 * Notice that in interfaces we only have the declarations and not the definitions, check out the interface Phone
		 * So we have declared total 3 methods inside our interface, and whenever we would be implementing this phone interface in any of the 
		 * class, then implementing this methods will beccome mendatory with same method signature.
		 * 
		 * Now lets get back to our OnePlus5 class and implements the interface Phone to our class . notice we can implement the interface
		 * using a keyword named implements and once this is implemented we will have to define the methods inside this interface into our class
		 * as it will become mendatory. and we will define them with the same method signature that we have in interface declared
		 */
		
		/*
		 * once the OnePlus5 class is updated lets have another class for one more phone and this class will also implements the interface
		 * and name of this class will be Iphone10. and this class will also be there inside org.sharma.phone package. look at the class to have
		 * better details
		 * 
		 * Now if you will notice both the classes OnePlus5 and Iphone10 have restrictions that method names should be according to what is 
		 * declared inside the interface they are implementing. this is a use of interface 
		 */
		
		/*
		 * now lets go ahead and create the objects of interface Phone and initialize them with the classes Iphone10 and OnePlus5 as below
		 */
		
		Phone phone = new OnePlus5();
		System.out.println("**********************************");
		System.out.println("processor : " + phone.processor());
		System.out.println("OS : " + phone.OS());
		System.out.println("Memory : " + phone.spaceInGB());
		System.out.println("**********************************");
		
		Phone phone1 = new Iphone10();
		System.out.println("Processor : " + phone1.processor());
		System.out.println("OS : " + phone1.OS());
		System.out.println("Memory : " + phone1.spaceInGB());
		
		/*
		 * So if we see above we have created the object of interface and initialized those objects with the help of classes and whatever
		 * class we have initialized the object with we are able to get the details on the basis of that.
		 * 
		 * So advantage of using interfaces is that they help us in implementing the polymorphism easily. so here we have created the 
		 * object of only interface Phone and we are just initializing it with the different classes objects and based on that the same 
		 * method names are returning different values based on the classes. So is one of the advantage of itterfaces and another advantage of 
		 * interfaces as we know is the restrictions we applied on the methods and there signatures.
		 */
		
		/*
		 * Now there is one more point to notice is that in interface method declarations access specifiers are not important and can be skipped
		 * and we can change them inside classed we are implementing the interface in, based on our own needs.
		 */
	}
}
