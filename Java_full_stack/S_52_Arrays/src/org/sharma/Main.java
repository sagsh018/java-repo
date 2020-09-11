package org.sharma;

public class Main {

	public static void main(String[] args) {
		/*
		 * So here we are going to take a look at the Arrays in Java
		 * What is an Array
		 * =================
		 * Array is a collection of elements of same data type. stored in adjuscent memory location and we can also make use of for each loop to
		 * traverse the array
		 * 
		 * 
		 * How to initialize and array
		 * ===========================
		 * To initialize an array we have to first give the data type, then the name of an array followed by [] which shows that it is a collection
		 * of element specific data type given by you
		 * see the example below
		 */
		
		int intVar[] = {1,2,3,4};
		// So this is how we can create an array of size 4 with the values initialized that array
		// Now if try to print the intVar variable then we will get some memory location address, so there is a specific way of accessing the 
		// elements of an array which we will see later.
		
		System.out.println(intVar); // This will not fetch the data inside this array, this will just give the starting memory location for this 
		// array.
		
		/*
		 * We can also simply just create the reference to an array first and then initialize it later. let see how we can actually define the
		 * array in Java and assign some specific size to it without initializing it
		 */
		
		int arrayvar[] = new int[10]; 
		// So here we have declared a new array named arrayvar of size 10, now in order to assign values to specific location of an array we can do:
		
		arrayvar[5] = 111;
		// And this can be printed as below
		System.out.println(arrayvar[5]);
		
		System.out.println(arrayvar[0]); // since we have not assigned anything to arrayvar[0] so this will print the values as 0.
		
		for (int i = 0; i <=9; i++) {
			System.out.println(arrayvar[i]);
		}
		
		// So this is how we can use for look to access all the elements of an array. similarly we can use another for of for loop called as
		// for each since array is continuous memory allocation.
		
		/*
		 * notice the size of an array is 10, so the index location for it is starting from 0 and go upto 9, and if we try to access the index
		 * location 10 or above we will get an exceptio named as ArrayIndexOutOfBoundException
		 * let see the below example
		 */
		
		try {
			System.out.println(arrayvar[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("accessed the wrong index of an array : " + e);
		}
		
		// Note: all elements of an array are initialized by 0 by default
		
		/*
		 * So above method if declaring an array and then initializing every index of an array separately is not efficient, so better way is as below
		 */
		
		int newArray[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		/*
		 * So with this way we are declaring the array as well as we are initializing it at the same time, also we need no to give size of array
		 * in this type of array declaration because java will count the number of elements given inside curly braces and decide the size of an array
		 */
		
		/*
		 * Array of floating point numbers
		 */
		
		float floatArray[] = {0.1f, 0.2f, 0.3f, 0.4f, 0.5f, 0.6f, 0.7f};
		System.out.println(floatArray[2]);
	}

}
