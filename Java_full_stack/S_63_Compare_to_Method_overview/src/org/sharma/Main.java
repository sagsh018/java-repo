package org.sharma;

import java.util.*;;

public class Main {

	public static void main(String[] args) {
		/*
		 * Here we will take a look at compareTo() method, This method is used to compare the element of any List to the argument given inside 
		 * this method. Please see the example below
		 */
		List<String> countries = new LinkedList<String>();
		
		// Lets add the element inside a LinkedList using addToList()
		
		new Main().addToList(countries, "abc");
		
		// Lets print the elements of list
		
		new Main().displayList(countries);
		
		int result = new Main().usingCompareTo(countries, "abc", 0);
		System.out.println(result);
		
		if(result == 0){
			System.out.println("The String has matched");
		}
		else {
			System.out.println("Unmached String");
		}
		
		/*
		 * This is how compareTo() method of String class works
		 * This method has two parts :
		 * 	part1 : which is on the left side of the compareTo() method 
		 * 	part2 : which is on the right hand side of compareTo() method
		 * so compareTo() method compare the part1 and part2 and return any one of the below values
		 * 	a) return 0 : if both part1 and part2 are same
		 * 	b) return 1 : if part 1 is greater than part2
		 * 	c) return -1 : if part1 is smaller than part2
		 */
	}
	
	
	public int usingCompareTo(List<String> list, String compareString, int pos) {
		return list.get(pos).compareTo(compareString);
	}
	
	public void addToList(List<String> list, String toAdd) {
		list.add(toAdd);
	}
	
	public void displayList(List<String> list) {
		System.out.println("******************************");
		for(String name: list) {
			System.out.println("Element : " + name);
		}
	}

}
