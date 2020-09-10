package org.sharma;

public class Main {

	public static void main(String[] args) {
		/*
		 * So here we are going to talk about the user defined exception
		 * 
		 * So we can define our own exception class simply by extending the Exception class. Now your subclass need not to implement any thing 
		 * it is there existence in the type system that allows you to use them as exceptions.
		 * 
		 * Also notice that Exception class does not define any methods of its own. It does ofcourse, inherit those methods provided by Throwable.
		 * Thus, all exception, including those that you create, have the methods defined by Throwable available to them. and we can override 
		 * these methods provided by Throwable class in the exception classes we will create.
		 * 
		 * Exception class has 4 constructors. Two support chained exceptions, that we will see later and the other two are as below
		 * 
		 * 1) Exception()
		 * 2) Exception(String msg)
		 * 
		 * So the first form will create the exception that has no description. The second form lets you specify a description of the exception
		 * 
		 * Also note that Throwable class has defined its own version of toString(), according to which it first displays the name of the 
		 * exception followed by colen, which is then followed by the description of the exception we pass into the constructor of Exception
		 * class.
		 * so by overriding the toString() method in our own Exception class we can modify the output and then we can make the output even more
		 * cleaner and according to what we need.
		 * 
		 * Now lets create the required scenario to understand this concept
		 * Class 1 : Main ==> org.sharma ==> having our main method
		 * Class 2 : Excption class ==> org.sharma ==> having our user defined exception definition
		 * Class 3 : Demo class ==> having our demo method where we are going to call the method which will thorws our user defined exception.
		 */
		try {
			compute(9);
			compute(11);
		}
		catch(MyException e) {
			System.out.println(e);
		}
		
		
	}		
	public static void compute(int a) throws MyException{
		if (a > 10) {
			throw new MyException(a);
		}
		System.out.println("Normal Exit");
	}

}

//Exception class

