package org.sharma;

public class Main {

	public static void main(String[] args) {
		/*
		 * So now here we will take a look at how we can have multiple catch blocks with single try block
		 * note that we can have only try block and multiple catch blocks
		 * So now we will first have the try and catch block to understand the concepts. look below
		 * 
		 */
		int x = 10;
		try {
			System.out.println("The result is : " + x/0);
			System.out.println("This statement will not execute");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Inside exception block");
		}
		
		/*
		 * So what happened here is that as soon as the division happened there is going to be an exception because we are dividing by 0.
		 * so we are catching the exception inside the catch block with the help of passing the object of exception inside the catch block
		 * also we are using the built in method of parent class Throwable and trying to print the entire stack trace, means we will get the 
		 * entire tree where exactly the exception arrised from and till where we are going.
		 */
		
		/*
		 * Hierarchy of all the classes for Exception Handling 
		 * java.lang.Object
		 * 		java.lang.Throwable
		 * 			java.lang.Exception
		 * 				java.lang.RuntimeException
		 * 
		 * and inside RuntimeException we have tons of subclasses, and it extends class Exception
		 * RuntimeException is a superclass of those exceptions that can be thrown during the normal operations of java virtual machine.
		 * Also note that RuntimException and its subclasses are all unchecked exceptions. and they do not need to be declared in the method and
		 * constructor's throws clause.
		 * 
		 * and all the exceptions other than those coming under RuntimeException class, are called as unchecked exceptions and they all come 
		 * directly under the Exception class and these need to be mentioned in the method and constructor declaration.
		 * 
		 * Also if we want to create our own class for exception related to our own application, then we need to extend Exception class to make
		 * it as supper class for our own exception class.
		 */
		
		/*
		 * Now if you will notice the try block in the above program, the you will see the print statement, it will not get executed, because
		 * before that statement the exception took place and because of that the control passed on to the catch block where it is caught and 
		 * appropriate action taken for it. and after execution of this try catch block the next line in the program will execute
		 * 
		 * Also notice the print statement in the above program before the statement where exception is encountered. that will be printed
		 * completely with no issues.
		 * 
		 * and finally check out the statement where exactly the exception is encountered. if we notice, the exception occured at the point when
		 * division happened and not before that, that means the text inside the print statement must get printed before the exception
		 * but it will not happen, either the statement will completely execute or will not be execute at all in these type of cases in
		 * exception handling
		 * 
		 * Now consider another example below
		 *  
		 */
		
		int p = 0, y = 10;
		
		try {
			System.out.println("This statement will execute");
			p = (y = 10*10) / 0;
			System.out.println("This statement will not execute");
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println(p);
		System.out.println(y);
		
		/*
		 * So here if we notice the arithmetic expression we are executing has two parts, one is enclosed inside the pair of braces and other one
		 * is the division of first one by 0. So the first part is a complete statement in itself and that part will execute fully before the 
		 * division with 0 will take place due to pair of braces, so even though the exception will be encountered on that line then also one part
		 * will be executed completely and hence the value of y will be printed as 100 instead of 10 at the end of program.
		 * 
		 * So the bottom line is there will not a partial execution of a statement, it will either full execution or no execution at all.
		 */
		
		/*
		 * Now finally in this video we will look at the fat of having multiple catch block with try block. Note there could be multiple catch 
		 * blocks with try blocks but only one catch block will be executed, based on the best suited encountered first.
		 * 
		 * look at the below example
		 */
		int s =20;
		try {
			s = s/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(s);
		
		/*
		 * so in above example we have 2 catch blocks with try, and if you will notice the most relevant one for divide by 0 is arithmetic 
		 * exception and also it came first to the program flow, hence it will  be executed.
		 * 
		 * alsways make sure that you insert the sub class exception before the superclass exception, otherwise super class exception will take
		 * all the exceptions on to him and you will never reach to the sub class exception at all. and you will also get the compile time
		 * error stating that subclass catch block is unreachable code and never going to be executed.
		 */
	}

}
