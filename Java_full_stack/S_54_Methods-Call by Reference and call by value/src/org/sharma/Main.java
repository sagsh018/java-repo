package org.sharma;

public class Main {

	public static void main(String[] args) {
		/*
		 * we will see the concept of Call by Value and Call by reference
		 */
		
		// Call By Value
		int value = 10;
		System.out.println("Value before any method call : " + value);
		new Main().callByValue(value);
		System.out.println("Value after calling the method : " + value);
		/*
		 * So over here we are passing the value to the method callByValue by the means of Call by Value, in which he copy of the variable
		 * is passed, instead of actual value itself, that means over here only the value of the variable is passed onto the method and inside
		 * method, new variable is assinged that value and modification are made to that variable, and not the actual variable inside main
		 * method.
		 */
		
		// Call By Reference
		String stringArray[] = {"a1", "a2", "a3", "a4", "a5"};
		System.out.println("****************************************************");
		System.out.println("Memory location for arraya is : " + stringArray);// Notice that this statement is going to print the address of the array in memory location
		// Now lets print the array before calling the method
		System.out.println("Elements of Array before method call");
		for(String name: stringArray) {
			System.out.println(name);
		}
		new Main().callByReference(stringArray);
		// So if you will notice we are not passing any perticular array element to the method we are passing the memory location we have displayed
		// above and this is called as call by reference because now the method is going to change the elements in the same array of that original
		// so instead of copy of an array the reference to the array is passed.
		System.out.println("*****************************************************");
		System.out.println("Elements of an array after the method call");
		for(String name: stringArray) {
			System.out.println(name);
		}
		// So from the output of above loop we will see that element at location 0 which was modified in method is reflected in the original
		// array in main method.
	}
	
	public void callByValue(int value) {
		System.out.println("Value inside the method before updating : " + value);
		value = 20;
		System.out.println("Value inside the method after updating : " + value);
	}
	
	public void callByReference(String stringArray[]) {
		System.out.println("Element inside the methods");
		for(String name: stringArray) {
			System.out.println(name);
		}
		//Now lets modify the element of an arrya
		stringArray[0] = "new_name";
	}

}