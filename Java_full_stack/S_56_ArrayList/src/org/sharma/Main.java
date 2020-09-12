package org.sharma;

import java.util.ArrayList;

public class Main {
	
	static ArrayList<String> listNames = new ArrayList<String>();
	
	public static void main(String[] args) {
		/*
		 * So here we are going to learn about the collection type "ArrayList"
		 * So to get started we are going to first create a static ArrayList, see above the main method
		 * Notice that an ArrayList can contain elements of any data type and the one we have defined above the main method contains the elemets
		 * of type String. 
		 * Also notice that we have defined this ArrayList as static, so that we can access this inside our main() method easily.
		 * Now notice another thing, that is this ArrayList object is created and at the end of statement we have pair of parenthesis for
		 * ArrayList, this is because ArrayList in Java is implemented as a class adn we are calling the default constructor of the ArrayList 
		 * while creating the object/instance of ArrayList in above statement.
		 * 
		 * Now lets try to add in some elements inside this ArrayList and also lets display thos elements using methods of ArrayList, and we will
		 * so this inside our main method
		 */
		
		listNames.add("Sagar");
		listNames.add("Sharma");
		listNames.add("Rahul");
		listNames.add("Rakul");
		listNames.add("Kamal");
		listNames.add("karthik");
		listNames.add("Khushi");
		listNames.add("Ravi");
		System.out.println("First element of ArrayList : " + listNames.get(0));
		System.out.println("Second Element of ArrayList : " + listNames.get(1));
		// So elements in ArrayList also starts from index location 0
		/*
		 * we can also print the entire ArrayList by passing the name of an ArrayList to the get method of it like below
		 */
		System.out.println("Entire Array list looks like thus : " + listNames);
		/*
		 * So now we will se couple of more operations/methods of ArrayList like removal of elements from the ArrayList.
		 * Now removal of elemets from the ArrayList happen in two ways:
		 * 1) with the help of the position of an element in the ArrayList
		 * 2) by the string/name of an element
		 * So we will see both the ways over here and we will create separate methods for the same
		 * see below
		 */
		
		// We will also see one method to display the ArrayList and we will pass the entire ArrayList as an argument to this method
		// Notice when we used to pass the Array name as an argument, the reference to that array was passed to the method, but here, Entire
		// ArrayList will be passed, and this ArrayList which we will pass will be assign to the local ArrayList paramater of the methods
		// See below the method call and the method definition out side the main method
		new Main().displayArrayList(listNames);
		
		/*
		 * Now we will take a look at two more methods, that will be used to remove the elements from the list based on the position of an
		 * element inside the ArrayList or based on the name of an element in the ArrayList
		 * consider the below method calls and there definitions outside the main method
		 */
		try {
			System.out.println("Poping the element at index location 0 from the ArrayList and the element is : " + new Main().removeByPosition(0));
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("You have entered the non available index location, check and retry again");
		}
		/*
		 * Now couple of things to notce here:
		 * 1) Since there might be the possibility that user might give the index location which does not have any element inside the ArrayList
		 * 		then it will throw an exception called as IndexOutOfBoundException thus it is neccessary to catch it.
		 * 2) When we called the method removeByPosition and passed in the integer position in that method, it has removed the element at
		 * 		position given by us and also promoted rest the elements one step left so that that position can be aquired by other elements in
		 * 		an ArrayList, so ArrayList is quite smart and it does not waste the space inside it.
		 * 		So to check the element at index location 0 which we have passed to removeByPosition method and let see which element is placed 
		 * 		by ArrayList over there
		 */
		new Main().displayArrayList(listNames);
		// So this will show that "sagar" element not there in ArrayList and all the elements are promoted to one step ahead and at 0th location
		// we have sharma.
		
		/*
		 * Now lets see another method of removing the element from ArrayList which is remove by name of an element.
		 * Please see the method called below and its definition as well.
		 */
		new Main().removeByString("Kamal");
		// So this will remove Kamal from the ArrayList and promote all the element after that to one step ahead and the postion of Kamal will 
		// taken by the element next to it.
		new Main().displayArrayList(listNames);
		
		/*
		 * Now we will take a look at one more method to modify the element of an ArrayList with the help of postion given and replace it with the
		 * New name give by us as well. So checkout the method call below and its definition as well after main method. and we will replace
		 * Karthik with new name ramesh
		 */
		new Main().modifyByPosition(3, "Ramesh");
		// and lets print the ArrayList after updation
		new Main().displayArrayList(listNames);
		// So you will see Karthik is replaced by Ramesh
		
		/*
		 * Now the position of any element can be obtained by using another method of ArrayList named as indexOf()
		 * So lets define a method which will return us the position of an element and we will use that position and give it to modifyByPosition
		 * method. please see below
		 */
		int pos = new Main().search("Rakul");
		// and now we will call the modify method with this position we got
		new Main().modifyByPosition(pos, "Rima");
		// and then we can display the ArrayList again
		new Main().displayArrayList(listNames);
	}
	
	public void displayArrayList(ArrayList<String> listNames) {
		System.out.println("ArrayList : " + listNames);
		System.out.println("************************");
		// If we want to show all the elements line by line individually then we can make use of foreach loop to iterate through the ArrayList
		for(String name: listNames) {
			System.out.println(name);
		}
	}
	
	public String removeByPosition(int pos) {
		return listNames.remove(pos);
	}
	
	public void removeByString(String name) {
		listNames.remove(name);
	}
	
	public void modifyByPosition(int pos, String newName) {
		listNames.set(pos, newName);
	}
	
	public int search(String name) {
		return listNames.indexOf(name);
	}

}
