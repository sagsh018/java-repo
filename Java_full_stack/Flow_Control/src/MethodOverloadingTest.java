public class MethodOverloadingTest {
	public static void main(String[] args) {
		/*
		 * So here we are going to create two methods for checking whether the given number is prime or not.
		 * notice these two functions will be under separate class and that class will present in separate .java file 
		 * file name => PrimeTest.java
		 * class name => PrimeCheck
		 * So we will create first the instance of this class and with the help of that we will call the methods for checking 
		 * whether number is prime or not.
		 * Also notice we have taken help of method overloading here. we have written two methods 
		 * 1) its going to return the boolean result for integer number 
		 * 2) its going to return the boolean result for decimal number.
		 * for clarification take a look at the PrimeCheck.java file
		 */
		
		PrimeCheck PC = new PrimeCheck();
		System.out.println("Entered number 13 is primt : "+ PC.isPrime(13));
		System.out.println("Entered number 3.4 is primt : "+ PC.isPrime(3.4));
		// So here when we have passed parameter of type double then its getting type cast to integer so the decimal digit will be removed
		// and left over number 3 will be prime.
		System.out.println("Entered number 29 is primt : "+ PC.isPrime(29));
	}
}
