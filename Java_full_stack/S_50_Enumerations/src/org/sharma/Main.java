package org.sharma;

import java.util.Scanner;

public class Main {
	
	public static final int COREJAVA = 1;
	public static final int COLLECTIONS = 2;
	public static final int GENERICS = 3;
	public static final int JSPANDSERVLET = 4;
	public static final int MULTITHREADING = 5;

	public static void main(String[] args) {
		/*
		 * So here we are going to talk about the Enum's
		 * Enum's are nothing but the collection of pre defined constant, and since these are constants, certain values would be already assigned
		 * to them, or we can also say that constants are final variables, since they cannot change there values, so they can be refered as 
		 * constant 
		 * 
		 * another thing to note here is that constants/Final variables are all capital case, conside the below example first without using the 
		 * Enum
		 * 
		 * We can see 5 constants defined outside the main method above and they are defined as static so that we can access them easily inside 
		 * the main method, and also they are marked as final so there value won't change once assigned. Now lets have a switch statement which
		 * is going to use these cases and print the respective output
		 */
		
		
		int learning = 9;
		
		
		switch(learning) {
		case COREJAVA:
			System.out.println("Step 1 : Learning Core Java");
			break;
		case COLLECTIONS:
			System.out.println("Step 2 : Learning Collections");
			break;
		case GENERICS:
			System.out.println("Step 3 : Learning generics");
			break;
		case JSPANDSERVLET:
			System.out.println("Step 4 : Learning JSP and SERVLET");
			break;
		case MULTITHREADING:
			System.out.println("Step 5: Learning Multithreading");
			break;
		}
		
		/*
		 * Now as we can see above that uptill we keep on giving the value of learning as one of the constants we have defined, its going to 
		 * work fine and we will get the required output, but since learning is a int variable and suppose someone gives the input as 9, as above
		 * case, in that case the program will not display anything. Now this kind of thing can be understood by the programmer why is it
		 * happening, but laymen can't understand this, so there should be some kind of restrictions in choosing this constant value, it can be 
		 * done by taking help from Enum.
		 * 
		 * So to overcome this we are going to define an enum named as Learning in our same package.
		 * So basically enum is nothing but the list of constants, and inside the enum we have created, we will add all the constants we have defined in our main class
		 * please check out the enum "Learning"
		 * 
		 * Now here in our main method we can create an object of this enum and then we can pass that to our switch cases and do the similar task as above
		 */
		
		// in below statement, learn is a object of enum Learning and to this object we can assign one of the constant value inside the enum Learning in the following way
		Learning learn = Learning.COREJAVA;
		
		switch(learn) {
		case COREJAVA:
			System.out.println("Step 1 : learning java");
			break;
		case COLLECTIONS:
			System.out.println("Step 2 : learning collections");
			break;
		case GENERICS:
			System.out.println("Step 3 : learning generics");
			break;
		case JSPANDSERVLET:
			System.out.println("Step 4 : learning JSP and servlet");
			break;
		case MULTITHREADING:
			System.out.println("Step 5 : learning multithreading");
			break;
		default:
			break;
			
		}
		
		/*
		 * Now if you notice the above case implemented with the help of Enum's, we can't give any value to the learn variable of enum Learning, because java will start 
		 * complaining immediately. so this is how enum apply restriction in choosing the values on from inside the list of collected constants.
		 */
	}

}
