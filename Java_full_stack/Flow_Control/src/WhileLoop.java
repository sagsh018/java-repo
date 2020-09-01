public class WhileLoop {
	public static void main(String[] args) {
		/*
		 * While loop ========== it is similar to for loop, and can do all sort of work
		 * done by for loop. there are some places where while loop is better suited We
		 * will take a look at those later
		 * 
		 * Lets see the simple example of while loop
		 */

		int i = 1;
		while (i <= 10) {
			System.out.println("Valie of i is : " + i);
			i++;
		}

		/*
		 * So as we have seen that we did the initialization outside the while loop then
		 * given the condition inside the while statement and then given the logic
		 * inside while loop braces and at the end incremented the i.
		 * 
		 * We can get the infinite loop if we remove the i++ statement from above while
		 * as it is never going to end
		 * 
		 * another way of having a infinite loop is:
		 */
		while (true) {
			System.out.println("Infinite Loop");
		}

		/*
		 * Here also we can make use of multiple variables for loop
		 */

	}
}
