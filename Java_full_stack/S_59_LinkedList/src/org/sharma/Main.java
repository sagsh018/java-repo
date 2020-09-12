package org.sharma;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		/*
		 * Here we are going to study about the LinkedList. LinkedList is a data structure, in which every node has two parts, one is the element
		 * and second part contain the address to the next node
		 * 
		 * and in LinkedList nodes are independent memory chunks and are non continuous memory allocation which contain data and reference to
		 * the next node,
		 * 
		 * In LinkedList, the first node contain only the address to the next node and after that everynode contain the data and address to the
		 * next node untill the last node  of linked list which contain only data and no address, this is called as end of the LinkedList.
		 * 
		 *  With the help of LinkedList data can be stored in more efficient manner and all sorts of operations like adding the element
		 * in a linked list and removing the element from the linked list and updating the element in a linked list can be done in efficient 
		 * but kind of tricky way.
		 * 
		 * Also note that unlike ArrayLists where ever operation creates a new ArrayList, here operations can be performed within the linkedlist 
		 * as a inplace manner, hence it is even more memory efficient
		 * 
		 * but there is dis advantage of a linked list which is, for accessing the element of a linkedlist we will have to traverse through 
		 * the entire Linked list untill find that element, becuase LinkedList is not continuous block of memory allocation so we don't have 
		 * indexing here and we won;t be able to access the element directly.
		 * 
		 * Now lets consider the LinkedList operations, so lets get started and create a linkedllist
		 */
		
		LinkedList<String> countries = new LinkedList<String>();
		// Now lets add some countries to this linked list
		countries.add("India");
		countries.add("US");
		countries.add("Italy");
		countries.add("France");
		countries.add("Sri Lanka");
		countries.add("UK");
		countries.add("Spain");
		countries.add("Russia");
		
		// Now lets try to print the linked list by passing the LinkedList object itself, which is possible in collection framework
		
		System.out.println(countries);
		// So this will display the entire LinkedList in special format, now whatever operations we have performed in the ArrayList we can
		// Also perform the same operations with the Linked list as well
		// So lets get started
		
		/*
		 * So first lets create a method that will print every element of a LinkedList individually. consider the method call and its definition
		 * outside the main method
		 */
		new Main().displayCountries(countries);
		
		/*
		 * Now suppose we want to add a new countary between India and US in our LinkedList. So this could be accomplished with the help of our 
		 * add() method but this time along with the element we want to insert, we will pass in the index location as well.
		 * Now since in LinkedList there is no concept of index as LinkedList is not a continuous allocation of memory to us, but then also
		 * giving index value in the add() method adds our element between two element in a LinkedList, this is possible only because the 
		 * complexity behind the LinkedList is already taken care by the collection framework of java
		 * 
		 * So lets create a another method to insert the countary Canada between India and US. please consider the method call and method
		 * definition. notice in here we are going to make use of specific form of add method of LinkedList and it is going to take 
		 * two arguments, one is the index and another is the element to be inserted
		 */
		
		new Main().insertCountries(1, "Canada", countries);
		// Notice that we have to pass the object of LinkedList as well as it is defined inside the main method over here and not globally in the 
		// class.
		// Now lets display the list again using display method
		new Main().displayCountries(countries); // and this will show us Canada
		
		// Lets add one more countary at the end of a LinkedList, that can be done by simple add method,
		countries.add("Brazil");
		new Main().displayCountries(countries);
		
		/*
		 * Now suppose i want to modify the name of countary Brazil and change it to poland. So this can be done with the help of set() method
		 * see the below example
		 */
		countries.set(9, "Poland");
		new Main().displayCountries(countries);
		
		/*
		 * Now suppose we want to remove an element from the list, we could do that by using remove method and if the remove method is called 
		 * without giving any index location, then it removes the first element from the LinkedList and if we want to get specific element 
		 * removed, then we can give the index location for that
		 */
		countries.remove();
		new Main().displayCountries(countries); // So this will show first element is removed
		
		countries.remove(4);
		new Main().displayCountries(countries);
	}
	
	public void displayCountries(LinkedList<String> countries) {
		System.out.println("*********************************************************");
		for(String name: countries) {
			System.out.println(name);
		}
	}
	
	public void insertCountries(int pos, String newCountary, LinkedList<String> countries) {
		countries.add(pos, newCountary);
	}

}
