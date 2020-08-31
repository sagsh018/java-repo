
public class DecisionWithIfElse {
	public static void main(String[] args) {
		// So here we are going to understand the if-else block 
		
		int x = 5;
		
		if(x==5) {
			System.out.println("The Value of x is correct");
		}
		else {
			System.out.println("The Value of x is not correcr");
		}
		
		// So this will show me the output as : The Value of x is correct
		// other thing to note is that if and else statements can be written without using braces, but in that case the scope of 
		// if and else would be only one statement. So its advisable to use braces with them to extend the scope of if and else statements
		
		/*
		 * Now we can also make use of if - else block inside the if statement itself. 
		 * lets see the code below
		 */
		
		int p = 4;
		
		if (p>5) {
			if(p == 10) {
				System.out.println("p is 10");
			}
			else {
				System.out.println("p is not 10");
			}
		}
		else {
			System.out.println("p is less than 5");
		}
		
		/*
		 * Now next we are going take a look at the if-else if-else block of code.
		 * Please see the code below
		 */
		
		int q = 5;
		
		if (q == 20) {
			System.out.println("q is 20");
		}
		else if (q > 20){
			System.out.println("q is greated than 20");
		}
		else {
			System.out.println("q is neither equal, nor greater than 20");
		}
		
		/*
		 * Exercise
		 */
		
		int a=3;
	    a=a++;
	    System.out.println("Post-Increment a: " +a);
	 
	    a=++a;
	    System.out.println("Pre-Increment a: "+a );
	 
	    a=a--;
	    System.out.println("Post-Decrement a: " +a);
	 
	    a=--a;
	    System.out.println("Pre-Decrement a: "+a );
	}
}
