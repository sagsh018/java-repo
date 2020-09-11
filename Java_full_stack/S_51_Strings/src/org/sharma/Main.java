package org.sharma;

public class Main {

	public static void main(String[] args) {
		/*
		 * So here we are going to start studying about the Strings in java.
		 * but first lets consider the small sample example below
		 */
		
		String x = "Study";
		String y = "easy";
		String z = x+y;
		
		System.out.println("The String is : " + z);
		
		// if condition check
		
		if(z == "Studyeasy") {
			System.out.println("value in comparison is correct");
		}
		else {
			System.out.println("Value in comparison is not correct");
		}
		
		/*
		 * Now here the output of first print statement will show that we are successfully able to concatinate the string x and y and printed it
		 * but when we try to do the comparison using the == operator in the if condition we got the unexcpected out put as comparison is not 
		 * correct, so there is some kind of inconsistancy. So it is clear that its not a good idea to use == operator in order to perform 
		 * comparisons of string.
		 * 
		 * Since String is a class and it has a special method named as equals() that can be used to check the equality of two strings objects
		 * notice that x, y  are nothing but the String class objects.
		 */
		
		if(z.equals("Studyeasy")) {
			System.out.println("value in comparison is correct");
		}
		else {
			System.out.println("Value in comparison is not correct");
		}
		/*
		 * So we will see that this time comparison value will come out correctly.
		 * Now we could also replace the "+" operator used for concatination in the above program, with another method of String class called as
		 * concat(). See the below example
		 */
		
		String a = "Dev";
		String b = "Ops";
		String c = a.concat(b);
		System.out.println("I am preparing for : " + c);
		
		/*
		 * Similarly there is another method which we can use to replace the old text with the new text in a string. See the below example
		 */
		
		String l = "I am Studying Python";
		l = l.replace("Python", "Java"); // Notice that replace is not an inplace method, it is not replacing the old string in the original 
		// String.
		System.out.println(l);
	}
}
