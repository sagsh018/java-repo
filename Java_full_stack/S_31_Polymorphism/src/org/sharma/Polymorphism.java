package org.sharma;

import org.sharma.phone.Nokia;
import org.sharma.phone.Phones;
import org.sharma.phone.Samsung;

public class Polymorphism {
	public static void main(String[] args) {
		/*
		 * So here we are going to study the concept of polymorphism
		 * so basically polymorphism means poly = many and morphism = forms.
		 * Polymorphism help us to provide multiple forms for an object 
		 * polymorphism is also called as late binding or dynamic binding
		 * 
		 * So lets have our main class as Polymorphism which has our main method
		 * 
		 * second class name is "Phones" under package org.sharma.phones, and this class won't contain main method. checkout the class for better
		 * idea
		 * 
		 * once class Phones is created, lets create an object of this class here in our main class
		 * 
		 */
		
		Phones phone = new Phones("Nokia");
		// now suppose if we try to print the model of a phone
		System.out.println(phone.getModel());
		// SO THIS FIRST TIME WILL PRINT FEATURE PHONE
		phone.features();
		
		
		/*
		 * Now polymorphism is something closely related to inheritance, so we will take help of inheritance as well in order to understand 
		 * polymorphism.
		 * 
		 * So lets define our third class named as SamsungNote20 under the same package org.sharma.phones but this class will extend the class
		 * Phones.
		 * So have a look at the SamsungNote20 class for better understanding. notice again this SamsungNote20 class should have a parametrized
		 * constructor that should be passing the parameters to the parameterized constructor of superclass Phones with the help of super keyword
		 * take a look at the class.
		 * 
		 * Also create the getter method and feature method for SamsungNote20 class as well.
		 * once all that is done, we will now create object of class SamsungNote20 here in mail class. See below
		 */
		
		Samsung note20 = new Samsung("Note20");
		// Now lets try to print the model of the phone using SamsungNote20 class object.
		
		System.out.println(note20.getModel());
		// So this time SamsungNote20 class object initialization has passed the paramter as "note20" to its super class Phones with the help
		// of super method, and with the help of SamsungNote20 class object, we are able to call the Phones class method getModel() as we are 
		// extending that class here. so Note20 is printed
		
		/*
		 * Also notice that we have overridden the method features() in our child class so whwn we will call that method with the SamsungNote20 
		 * class object, the feature that will be printed will be from child class because the preference will be given to the child class mehtod
		 */
		
		note20.features();
		// So this will print smart phone.
		
		/*
		 * So till now whatever we have seen above is a normal stuff. 
		 * The thing now to notice is that the relationship between class Phones and SamsungNote20 is a "is a" relation. that means
		 * note20 "is a" phone.
		 * So when there is this kind of relationship we can create the object of the classes as below as well
		 */
		
		Phones note20_1 = new Samsung("Note20");
		// Now lets try to access the model and features of the Note20 phone, with the above type of model of creating the object of the class
		System.out.println(note20_1.getModel());
		note20_1.features();
		// So this has also printed the same output as previous case, but this time we have used Phones class to create object of
		// SamsungNote20 class object.
		
		/*
		 * Now notice that class Phones is having one method called as features() and similarly class SamsungNote20 is having same method
		 * named as features(), and since we are creating the instance note20_1 of class Phones and initializing it with the class SamsungNote20
		 * class constructor, so this object here "note20_1" contains two versions of method features() and here based on the senario here
		 * the correct version is choosen and printing the value correspnding to that.
		 * like in above senario the features() method of SamsungNote20 class is called and hence the features is printed as smart phone.
		 */
		
		/*
		 * No to further understand this concept lets create another class named as Nokia under the same package org.sharma.phone, and this
		 * class will also extend the class Phones. so go to that class and have a look at that
		 * Notice that this class will also require a parametarized surely because it is extending class Phones and parameter need to be passed
		 * to the constructor of Phones from Nokia class with the help of super method. 
		 * This Nokia class will not have any features() method or any attribute with it
		 */
		
		// So now lets create the object again for Nokia class with same kind technique as there is again "is a" relationship
		Phones nokia = new Nokia("nokia");
		// Now lets try to print the model with this object
		System.out.println(nokia.getModel()); // So this will print nokia.
		// Now lets try to print the features() method 
		nokia.features();
		// Now since here Nokia class does not have any features() method and we have created the object "nokia" for class Phones and initialized it with the constructor 
		// of Nokia class so here there is only one copy of features() method with object nokia and that is from Phones class and we have not overriddn it in Nokia class
		// the value from features() method of class Phones will be printed.
		
		/*
		 * so outside thus Polymorphism class as we can see we have defined another non static method and it is returning the object of type
		 * Phones class, so now we will create object of class Phones from this mehtod and swithc base choice.
		 */
		System.out.println("************************");
		Phones nokia_1 = new Polymorphism().phone(1);
		System.out.println(nokia_1.getModel());
		nokia_1.features();
		
		Phones note20_2 = new Polymorphism().phone(2);
		System.out.println(note20_2.getModel());
		note20_2.features();
	}
	
	/*
	 * Now supoose outside this main() method in our main class lets have another method which will return the object of class type Phones
	 * based on the switch case 1 or 2.
	 */
	
	public Phones phone(int driver) {
		switch(driver) {
		case 1: return new Nokia("Nokia 3310");
		case 2: return new Samsung("Note 20");
		}
		return null;
	}
}
