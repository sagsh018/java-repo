package org.sharma;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*
		 * So here we will take a closer look at the stack methods, so lets get started and declare the stack as below
		 */
		
		Stack<Integer> demoStack = new Stack<Integer>();
		
		// Now lets push in the elements to this stack and we can use for or foreach loop for this
		
		for (int i = 1 ; i <= 5; i++) {
			demoStack.push(i);
		}
		
		// Now lets print the values of stack
		
		System.out.println(demoStack); // Way one
		
		System.out.println(demoStack.get(0)); // To get the specific value at specific index, index in stack also starts at 0 as this is also list
		
		for(int item: demoStack) {
			System.out.println(item); // This is another way to print all the items of a stack.
		}
		
		/*
		 * Now suppose you want to pop out the element, we have to use pop() method and it is going to pop out the element from the top
		 * of a stack as it is list-in-first-out
		 */
		
		System.out.println("Element poped out : " + demoStack.pop());
		for(int item: demoStack) {
			System.out.println(item);
		}
		// So this will show only 4 elements now in the stack
		
		/*
		 * Now suppose if we want to check what is the last element in the stack, for this we can make use of the method called as peek()
		 * note that this method just peeks in and return the value on the top of the stack but don't delete it
		 */
		
		System.out.println("***********************************");
		System.out.println("Last Element on the top of the stack is : " + demoStack.peek());
		
		/*
		 * Another method which we are going to check here is the one used to check whether the stack is empty or not. this can be done using 
		 * method named as isEmpty() this return the boolean true id stack is empty otherwise returns false
		 */
		
		if(demoStack.isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Stack is not empty");
		}
		
		/* 
		 * next is to search the element inside the stack
		 * So lets add some random element inside our stack
		 */
		
		demoStack.push(100);
		// once added lets check this perticular element present in the stack or not, we can use search() method for this and this method returns
		// 1 if the element is present in the stack and it returns -1 if element does not present in the stack
		
		System.out.println(demoStack.search(100)); // This will print 1
		System.out.println(demoStack.search(45)); // this will print -1
		
	}

}
