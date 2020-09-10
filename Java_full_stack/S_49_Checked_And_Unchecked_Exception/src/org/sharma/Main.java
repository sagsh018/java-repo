package org.sharma;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		/*
		 * Here we are going to have a look at what is checked and what is unchecked exception.
		 * 
		 * Checked Exception:
		 * ==================
		 * These are type of exception which are checked by Java before proceeding further in the program, and as soon as this kind of exception
		 * is encountered in java program, java will immediately start complaining about that exception and it will force you to either handle it
		 * there and then using try and catch block or throw it to be handled somewhere else. example of checked exception could be : 
		 * FileNotFoundException
		 * 
		 * UnChecked Exception
		 * ===================
		 * These are the rype of exceptions which are not checked by java immediately and if they will be encountered, java will not start
		 * complaining them immediately and its programmer's responsibility to handle those exceptions. example : ArithmeticException
		 * 
		 * Let see the example for both
		 * 
		 * So if we see method someMethod1(), it has unchecked exception which is Arithmetic exception, but java didin't complained about it and 
		 * is no need to specify it in the function signature with the help of throws clause. So lets catch the exception of this method using
		 * try and catch block
		 * 
		 */
		try {
			// new Main().someMethod1();
			new Main().someMethod2();
		}
		catch(ArithmeticException e) {
			System.out.println("Exception : " + e);
		}
		catch(FileNotFoundException e) {
			System.out.println("Checked Exception : " + e);
		}
	}
	
	public void someMethod1() {
		int x = 10, y;
		y = x/0;
	}
	
	public void someMethod2() throws FileNotFoundException {
		FileReader f1 = new FileReader("file.txt");
	}

}
