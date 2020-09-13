package org.sharma;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*
		 * So here we are going to learn about the iterators
		 * So tll now we have seen various Lists like ArrayList, LinkedList, Stack and we have also iterated over them using the foeeach loop and
		 * displayed there elements individually one by one.
		 * Now when we make use of foreach loop, behind the scene in Java, iterators are used. i.e. behind the scenes, the iterators will 
		 * iterate throught the list when we will use the foreach loop.
		 * So in this project we will try to implement iterators manually
		 * 
		 * Lets fist create an LinkedList as below
		 */
		
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
		 * So now we will create a method what will iterate through these LinkedList using iterators and print each element of this LinkedList
		 * individually.
		 * Notice that Iterator is an interface and it is implemented by the List interface. So lets start and create a method to print the
		 * element of LinkedList using the Iterator
		 */
		new Main().displayUsingIterator(countries);
		
		/*
		 * Now this interface iterator, which we have used to display the element of a List, has nothing extra then foreach loop, that means we
		 * can actually use foreach loop inplace of iterator and its fine.
		 * 
		 * but there is one more important sub interface of iterator which is s ListIterator, this can also be used in a same way to iterate 
		 * accross the List, but there are few things extra in here
		 * 1) ListIterator is specific to List only.
		 * 2) and with the help of this we can not only iterate and traverse in the forward direction but we can also move backward as well.
		 * 		So this is one functionality which we cannot achieve with the help of foreach loop
		 * 
		 * So lets create the method to iterate over the List using ListIterator. see the method definition and the calling of that below
		 */
		new Main().displayUsingListIterator(countries);
		/*
		 * So this method call is also going to give the same output as that with the help of iterator interface. but the additional thing which 
		 * we have here in ListIterator interface is the methods to traverse to the previous elements.
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
	
	public void displayUsingListIterator(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Elements : " + iterator.next());
		}
		System.out.println("********************************************");
	}

}
