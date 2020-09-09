package org.sharma;

public class Main {

	public static void main(String[] args) {
		/*
		 * So in here we are going to study about the exception handling.
		 * to study the basic concept to exception handling we will first create two more methods inside our Main class along with the main
		 * method, named as case1 and case2.
		 * see the definition of case1 and case2
		 * 
		 * case1
		 * =====
		 * In this method we are dividing two numbers x by y and we are taking care of the fact that y(denominator) should not be 
		 * 0, otherwise it will lead to an infinite number and which is nothing in mathematics. note that we will take care of this in case1 method
		 * manually by using if condition. take a look at it below
		 * 
		 * case2
		 * =====
		 * In this case we are not taking care of the divide by zero fact and we are leaving it to java on how to handle this. Note that divide
		 * by 0 is not a compile time error or a syntax error thats a logical error and in java there is a special way of handle these, which is
		 * called as exception handling. see the case2 below
		 * 
		 * Now lets try to access these two methods in our main methods. note that since we are going to reference the non static elements inside
		 * the static main method, we could only do this with the help of instance of the class, so lets create the instance of main class
		 */
		
		new Main().case1(10, 2);
		new Main().case1(10, 0);
		
		// So case1 has taken case of this type of issue, now lets give same to case2 and see what happens
		
		new Main().case2(10, 0);
		
		// This will result into a application crash and we got a run time error and our code is no more working
		// error : Exception in thread "main" java.lang.ArithmeticException: / by zero
		// So to handle such kind of scenarios we have something called as try catch block, we put any such code which may result into a run
		// time error inside the try-catch block and try to catch the exception and take some appropriate action so that even after issue,
		// our application should not stop working.
		
		// see the example of this in case2
		/*
		 * So if you will notice case2 we see that in catch statement we are creating the instance of parent class of exception named as
		 * Exception with the instance name e, which could be anything.
		 * So this is how we dealt with the issue and our program is still working.
		 */
	}
	
	public void case1(int x, int y) {
		if (y != 0) {
			System.out.println("Result : " + x/y);
		}
		else {
			System.out.println("You have wrong value of y");
		}
	}
	
	public void case2(int x, int y) {
		
		try {
			System.out.println("Result : " + x/y);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		
	}

}
