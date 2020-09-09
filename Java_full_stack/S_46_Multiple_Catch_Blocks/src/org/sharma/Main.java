package org.sharma;

import java.io.*;
import java.io.FileReader;

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
		
		/*
		 * finally
		 * =======
		 * 
		 * Now finally block is used at the end of try and catch block, if need to be used, it will never come before any catch statement.
		 * also if the finally block is used, then no matter if exception occured or not, if it occured, then whether it has been catched ot not
		 * or it raming un catched and taken care by java default exception handling, the finally block will execute at any cost.
		 * 
		 * Also note that even if there are mutliple catch blocks then also the finally block gets executed.
		 * 
		 * use of finally block
		 * ====================
		 * when there are statements that should execute before program ends or not, whether or not exeception occured or not, in those cases 
		 * finally block is very useful. for example if you have opened a file to work on, and before you could complete you task, exception
		 * encountered, and because of that control went to catch block then the fille will remain open in system memory. so in such a case
		 * it will be very helpful if we keep file closing statement in finally block which will execute no matter what.
		 */
		
		int z = 10;
		try {
			z = z/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(RuntimeException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("This statement will definitely execute.");
		}
		
		/*
		 * Now we will understand the use of throw and throws keyword. but for that we would need to have a method out side the main method. 
		 * so will declare a static method out side our main method and we will call that method inside our main method.
		 * when we call the method which is having throws in its declaration we have to have a try and catch block in the mehtod calling it
		 * otherwise this method should also throws the exception. but this is our main method so we will have to handle is over here.
		 */
		
		System.out.println("***************************************");
		try {
			someMethod();
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
		
		/*
		 * So this is how throws keyword is used to indicate that the mehtod you are calling might throw an exception and you need to handle it
		 * notice that this throws kwyword is only required in case of checked exceptions and not in case of unchecked exception whch comes 
		 * under RuntimeException class. see the method someMethod1() in which we are having RuntimeException divide by 0 but java is not 
		 * complaining to have a throws clause in our method declarion, there are two ways to handle this divide exception either in the mehtod
		 * itself or in our main block as we did in below try catch block
		 */
		
		try {
			someMethod1();
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		/*
		 * Now there is another concept of "throw" clause. this throw clause is used to explicitly throw and exception in java. suppose there
		 * is no unchecked and checked excption orccured, then also due to functionality in demand we want to throw and catch the exception
		 * we could do that with the help of throw class in the method. see the someMethod2() and then see how we are calling it in our mein method
		 * here
		 */
		
		try {
			new Main().someMethod2();
		}
		catch(RuntimeException e) {
			System.out.println(e);
		}
		
		/*
		 * Notice one more thing here, which is, since we are throwing RuntimeException from the method someMethod2(), if we try to catch that 
		 * exception  using the subclass of that exception then that case it will not be handled and java default exception handling comes into 
		 * picture. the reason is parent class can handle child class exception but not vice verse.
		 */
	}
	
	public static void someMethod() throws FileNotFoundException {
		/*
		 * lets say here we want to perform some file related stuff and for that we want to open up a file named as file.txt.
		 */
		System.out.println("This statement will execute");
		FileReader f1 = new FileReader("file.txt");
		//Now as soon as we make the instance of class FileReader in order to open up a file file.txt and try to read that file, we will
		// start getting an error and that error is because of the fact that the file file.txt is not there in the locaton where java is trying to
		// search it, so this is leading to an FileNotFoundException and this is being implicitely complained by java. For such kind of
		// scenarios where a java method is indicating implicit type of exception and the exception is of type checked type that means it is not
		// under RuntimeException then in that case method declaration has to have a special keyword to indicate that the method you are calling
		// might throw an exception and you have to handle it. so we will add the throws keyword for that. see the method signature
		System.out.println("This file will not execute");
	}
	
	public static void someMethod1() {
		int x = 10;
		x = x/0;
	}
	
	public void someMethod2() {
		System.out.println("Tis stetement is before explicitly throwing the exceptionusing throw clause");
		throw new RuntimeException();
		// Note that while throwing the exception using throw keyword we make use of exception class constructor.
	}

}
