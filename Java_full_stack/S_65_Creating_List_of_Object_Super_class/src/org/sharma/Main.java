package org.sharma;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/*
		 * So till now have seen the List created for Strings, Custom objects. but all these lists which we have created in previous examples 
		 * can store only objects of one type. That the LinkedList or ArrayList we have created for String type can store only elements of 
		 * type String.
		 * 
		 * Suppose if we want to create a LinkedList of such a type which can store Custom type, String type, primitive type or anything.
		 * The answer is yes and we can do this with the help of super class of every class in Java which is Object class.
		 * 
		 * Note that every class in Java is child of Object class.
		 * So lets go ahead and create a List
		 */
		
		List<Object> element = new LinkedList<Object>();
		
		// Now lets add elements to the list
		
		element.add("Sagar");
		element.add("sharma");
		element.add(new Names("Hello"));
		element.add(1);
		element.add(3.4F);
		element.add('c');
		
		// So if we notice above we have added all sorts of elements, of every type
		// Now lets create a method that will print these leements
		
		new Main().displayObjectList(element);

	}
	
	public void displayObjectList(List<Object> list) {
		for(Object element: list) {
			System.out.println("Element: " + element);
		}
	}

}
