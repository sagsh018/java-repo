package org.sharma;

import org.sharma.person.NonVagen;
import org.sharma.person.Person;
import org.sharma.person.Vagen;

public class Main {
	public static void main(String[] args) {
		/*
		 * So here we are going to look at the concept of abstract class and both abstract class and interfaces goes hand in hand.
		 * both interfaces and abstract classes provide abstraction 
		 * 
		 * Interfaces provide complete abstraction. becasue inside interface we are not defining any method at all, we are just declaring all
		 * of them and we are just mentioning over there what needs to be done and not how that needs to be done. and the definition part
		 * needs to be taken care inside the class which is going to implement that interface, so here we have complete abstraction.
		 *
		 * Now when it comes to abstract classes things differ a little. In abstract class, we can have function definition as well as only 
		 * declaration also. 
		 * 
		 * So lets go ahead and make a abstract class named as Person under the package org.sharma.person. notice that abstract class has a 
		 * keyword "abstract" in its signature, see the public class for more details.
		 * in this abstract class we can have methods, variables, method definitions, method declarations, abstract methods.
		 * 
		 * now lets go ahead and define some methods and some abstract method inside abstract class. see the class definition for more details
		 * So if you see the class you will find one normal method named as speak() and we have given the definition of that function over 
		 * there as well.
		 * there is another method which is abstract method(eat()) and only have declaration and whichever class is going to extends this abstract class 
		 * has to implemet this method according to there own need.
		 * 
		 * Now there is often a consfusion between interfaces and abstract as what to use when, so whenwe have a relation ship between parent and
		 * child class "is a" then we go for interfaces. and whenever there is a relationsip of type "can" then we go for abstract class
		 * for example here we have two methods, speak and eat, so the relationshipt here is "can", i.e. person can speak, person can eat
		 * but here we are not sure that what person wnats to eat, becasue he or she could be began, could be non vegan. so we made this
		 * method as abstract so that which ever class extends this class, can implement the functionality according to there own need
		 * notice that for making this method abstract we have used a keyword abstract here and also abstract method will only have declration and 
		 * not the definition.
		 * 
		 * Now once we are done with our abstract class, lets go on to the next class Vagen which is going to extends the Person class. see the class
		 * for details, we wii override eat() method in this class now
		 * similarly we will also have one more class NonVagen. lets define both classes and both extends the abstract class Person
		 * So in both the classes Vagen and NonVagen we have implement the method eat according to our own need.
		 * 
		 * Now lets create the objects of abstract class Person and initialize them with the objects of class Vagen and NonVagen
		 */
		
		Person john = new Vagen();
		john.speak();
		john.eat();
		
		// So these will print the eat method and shows that it is part of vagen class.
		
		System.out.println("***********************");
		
		// now lets create another object
		
		Person amit = new NonVagen();
		amit.speak();
		amit.eat();
		
		// So this is how on the basis of which class is used to initiate the class Person, we will get the information accordingly.
	}
}
