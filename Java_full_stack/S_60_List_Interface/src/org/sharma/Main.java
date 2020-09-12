package org.sharma;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*
		 * So here we are going to discuss about the List, which is interface in java. and the classes we have studied so far, that is ArrayList
		 * LinkedList, Stack, Vector, etc all implements this interface, so this is super interface for all those classes
		 * 
		 * Also this interface List has two super interfaces which are : Collection and Iterable
		 * 
		 * So to understand the concept, we will create ArrayList and LinkedList, but this time we will create an object of interface List
		 * and initiate thos objects with the ArrayList and Linkedlist
		 * See the below example 
		 */
		
		List<String> countries = new LinkedList<String>();
		/*
		 * So in this above LinkedList declaration we have created the reference of interface List and initiate it with the LinkedList class.
		 * So this type of configuration with only restriction for the data type, so data type of interface should also be of type String, if the
		 * LinkedList is haveing type String.
		 * 
		 * Now lets add some countary names to this LinkedList
		 */
		
		countries.add("India");
		countries.add("Poland");
		countries.add("USA");
		countries.add("UK");
		countries.add("Italy");
		countries.add("Spain");
		countries.add("Brazil");
		
		/*
		 * Similarly lets create ArrayList, with similar kind of concept where we will create the reference of interface List and initialize
		 * it with the ArrayList class
		 */
		
		List<String> numbers = new ArrayList<String>();
		// Adding few numbers
		
		numbers.add("One");
		numbers.add("Two");
		numbers.add("Three");
		numbers.add("Four");
		numbers.add("Five");
		numbers.add("Six");
		numbers.add("Seven");
		
		/*
		 * Now suppose we want to have a method that can display the elements of these LinkedList and ArrayList indiviually.
		 * so without this interface we might have to create two separate methods for passing objects of ArrayList and LinkedList, but with the
		 * use of List interface we can simply pass any of the object and in the method we could just keep the reference of type List interface 
		 * and it will be fine with single method
		 * see the method call and definition below
		 */
		
		new Main().displayList(countries);
		new Main().displayList(numbers);
		/*
		 * So this is how with the help of interface we are able to call same method to display the ArrayList as well as LinkedList
		 */
	}
	
	public void displayList(List<String> list) {
		System.out.println("****************************************");
		for(String item: list) {
			System.out.println(item);
		}
	}

}
