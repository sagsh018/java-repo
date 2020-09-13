package org.sharma;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> countries = new LinkedList<String>();
		
		// Then lets add some country names as well
		
		countries.add("India");
		countries.add("USA");
		countries.add("Canada");
		countries.add("Poland");
		countries.add("UK");
		countries.add("spain");
		countries.add("Italy");
		/*
		 * Now lets move further and study how to sort the List. for that we can make use of method called as sort. please see the example below
		 */
		System.out.println("****************************************");
		System.out.println("Sorted List");
		countries.sort(null);
		new Main().displayUsingIterator(countries);
		/*
		 * So here the method we have used which is sort takes one argument which is comparator, and we will study about this in forthcoming 
		 * lectures, but for now we have mentioned null as the argument and becuase of this the list will be sorted in a natural order of
		 * aplphabetical order.
		 */
		
		/* another thing that we want to see here is, how to reverse the List, for that we will make use of one of the static method of super class
		 * Collection named as reverse. Please see the example below
		 * 
		 */
		System.out.println("****************************************");
		System.out.println("Reversed List");
		Collections.reverse(countries);
		new Main().displayUsingIterator(countries);
		/*
		 * Notice here we have called one of the static method of class Collections and inside that method we have passed out list as an argument
		 * This Collections class is a parent class for List class, ArrayList class, LinkedList class so we are easily able to make use of method
		 * of Collections class over the LinkedList object, because LinkedList is extending the Collections parent class.
		 */
	}
	
	public void displayUsingIterator(List<String> list) {
		Iterator<String> iterator = list.iterator(); // so this iterator method over the List has returned the itrator over the list in proper
														// sequence and we have assigned it to the object of interface iterator
		// Then we will make use of while loop as below
		while(iterator.hasNext()) {
			System.out.println("Elements of LinkedList are : " + iterator.next());
		}
		System.out.println("*******************************************");
	}

}
