package org.sharma;

public class Main {

	public static void main(String[] args) {
		/*
		 * So here we will see how to apply for and foreach loop in order to access the elements of an array
		 * lets define a array of type string, which will contain some names inside it
		 */
		
		String stringArray[] = {"Ravi", "Rahul", "kamal", "Rakhi", "Khushi"};
		// So the string array is of size 5 and index will start from 0 to 4.
		
		// Using for loop to print the elements of an arrya
		
		for (int i=0; i<=stringArray.length-1; i++) {
			System.out.println(stringArray[i]);
		}
		
		// using for each loop to print the values of an array
		
		System.out.println("************************");
		for(String name: stringArray) {
			System.out.println(name);
		}
	}

}
