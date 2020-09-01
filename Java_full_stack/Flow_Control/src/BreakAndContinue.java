public class BreakAndContinue {
	public static void main(String[] args) {
		/*
		 * break statement
		 * ================
		 * break statement breaks the immediate current loop of which break statement is direct scope of
		 * example
		 */
		for (int i =0; i<=10; i++) {
			System.out.println(i);
			if(i == 5)
				break;
		}
		/*
		 * output
		 * ======
		 * 	0
			1
			2
			3
			4
			5
			So as soon as i because equal to 5 it is printed first due to print statement and after that break statement has terminated the 
			loop and control came out of for loop
		 */
		
		/*
		 * continue statement
		 * ==================
		 * This is statement is used to terminate the current iteration of a loop and transfer back the control to the start of immediate 
		 * enclosing loop
		 * 
		 * example
		 * 
		 */
		
		for (int i = 1; i <= 10; i++) {
			if (i == 5) 
				continue;
			
			System.out.println(i);
		}
		
		/*
		 * output
		 * ======
		 * 1
			2
			3
			4
			6
			7
			8
			9
			10
			So we can see as soon as i became 5, further loop is terminated and 5 is not printed and loop continued further.
		 */
	}
}
