package org.sharma;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*
		 * consider the below example for LinkedList created and elements added into it and then they are displayed using display method 
		 * 
		 */
		
		List<String> countries = new LinkedList<String>();
		// lets add the countries to this LinkedList
		
		countries.add("India");
		countries.add("Poland");
		countries.add("USA");
		countries.add("UK");
		countries.add("Italy");
		countries.add("Spain");
		countries.add("Russia");
		// Now lets display the elements of this list individually one by one, but for this we will have to first define the method outside 
		// main which we can call inside main() method
		
		System.out.println("Normal List");
		new Main().displayList(countries);
		
		// Now lets try to sort the List using Sort() method from Collections class
		Collections.sort(countries);
		new Main().displayList(countries);
		/*
		 * Now this sort method from Collections class sort the specified List, which is passed in as argument into an ascending order, 
		 * according to the natural ordering of the elements of that List class which is predefined, like ArrayList, LinkedList, etc
		 * All element of these Lists must implement comparable interface, and this comparable interface imposes a total ordering on 
		 * the objects of each class that implements it. and it is this ordering which is defined in the implemented comparable interface's
		 * compareTo() method in each of these class definitions, called as natural ordering and this method compareTo() is refered as natural 
		 * comparison method.
		 * 
		 * Now if we look at the above example of sort() method where we have passed in the LinkedList class object(countries), This class 
		 * LinkedList, must have implement the Comparable interface and then overriden compareTo() method, in which it would be defined, what will
		 * happen when sor method is called for this LinkedList class. which in this case is sorting the names of countries in ascending order
		 * of Alphabetical order.
		 * 
		 * Now this methodology is good, but java only implement natural ordering for known objects types, for example in above case we have
		 * list of String type which is known object type. but what if we want to create a list of some custom objects?
		 * Also if someone wants to change the natural ordering from alphabetical ordering to something else than in that case what will happen
		 * so this is the reason we need to know the functionality of comparable interface, so that we can create a custom class/object which
		 * can implement this comparable interface and then override compareTo() method according to there own need.
		 * 
		 * So to understand this we will create a separate class of custom objects and it will implement comparable interface and override
		 * compareTo() method and change the natural ordering.
		 * so lets start and define a class named as Names(notice custom type and not any predefined type class). This class Names will again be
		 * in same package org.sharma
		 * 
		 * So once our custom class is ready lets create a LinkedList of that cutom type here in our main method
		 */
		
		List<Names> name = new LinkedList<Names>();
		
		// Now lets add in the elements into this list. but notice this time we will be adding element of custom object so it will be different 
		// this time
		
		name.add(new Names("a")); // So we have created and object of class Names and with the help of parameterized constructor we have added element
		name.add(new Names("abcde"));
		name.add(new Names("abc"));
		name.add(new Names("abcd"));
		name.add(new Names("ab"));
		name.add(new Names("abcdef"));
		
		/*
		 * Now we once the elemets are added into the LinkedList of custom type Names. now we will try to print those element individually
		 * lets create the method for that and call it in our main method
		 */
		
		new Main().displayCustomList(name);
		
		/*
		 * Now this display method is goint to print some memory location for all the objects of type Names we are going to pass to display
		 * method. to correct this we will have to create toSring method in Names class so lets do that and our problem will be solved
		 */
		
		/*
		 * Now once this is done, we have to do the same sorting which we did with the LinkedList of type String, but thus time we will do the 
		 * sorting of LinkedList of custom type that too on the basis of length of the name.
		 * So we will again call method sort() from Collections, but this time we will pass object of class Names this time.
		 */
		
		Collections.sort(name);
		// Now lets print this again
		
		new Main().displayCustomList(name);
		/*
		 * one more thing, if we want to sort the LinkedList of type Names, in descending order, that is in revese order, then we can just
		 * change the return values in the compareTo() method of class Names from -1 to 1 and from 1 to -1
		 */
	}
	
	public void displayList(List<String> list) {
		System.out.println("***************************************");
		for(String name: list) {
			System.out.println("Element : " + name);
		}
	}
	
	public void displayCustomList(List<Names> list) {
		System.out.println("****************************************");
		for(Names name: list) {
			System.out.println("Element : " + name);
		}
	}

}
