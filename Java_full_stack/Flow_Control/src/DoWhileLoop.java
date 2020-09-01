public class DoWhileLoop {
	public static void main(String[] args) {
		/*
		 * do while loop
		 * =============
		 * There are two difference between do-while loop and for loop and while loop
		 * 1) Do while loop has semi-colon at the end of while statement
		 * 2) even if the condition is false for the very first time, the statements inside th loop will execute atleast once.
		 */
		
		int i = 1;
		do {
			System.out.println("Value of i : "+ i);
			i++;
		}while(i<=10);
	}
}
