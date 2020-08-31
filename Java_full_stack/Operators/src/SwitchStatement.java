public class SwitchStatement {
	public static void main(String[] args) {
		// Switch statement
		
		int x = 2;
		
		switch(x) {
		case 1: 
			System.out.println("Value of x is 1");
			break;
		case 2: 
			System.out.println("Value of x is 2");
			break;
		case 3: 
			System.out.println("Value of x is 3");
			break;
		default: 
			System.out.println("Value of x is something other than 1, 2 and 3");
		}
		/*
		 * So couple of things here to note about switch statement.
		 * 1) break statement is mandatory to be applied with every case and its always a good practice to apply it with default as well
		 * 2) the order of cases does not matter as long as they are written correctly, they will execute and gives correct output
		 */
		
		// Lets do one more example of switch case
		
		String animal = "dog";
		
		switch(animal.toLowerCase()) {
		case "dog":
			System.out.println("The Animal is Dog");
			break;
			
		case "cat":
			System.out.println("The Animal is Cat");
			break;
			
		case "cow":
			System.out.println("The Animal is Cow");
			break;
			
		default:
			System.out.println("Human");
			break;
		}
		/*
		 * Notice that to take care of the case sensitivity, what we have done in case of switch cases of strings, is we have defined
		 * all the cases as small case and then added a special function call while defining the switch statement, so that
		 * whatever string entered by user, it will be converted into smaller case by using toLowerCase() function
		 */
		
		
		// Notice main role of break statement is to break the switch statement as soon as particular case becomes true and discards
		// any further checks of cases.
		
		/*
		 * Notice that like we used the switch case with integer type and string type data types, we are not allowed to use switch with 
		 * float type data type and if we try to make use of switch with respect to float, java complain about it with the below comment
		 * "Cannot switch on a value of type float. Only convertible int values, strings or enum variables are permitted"
		 *
		 * So below kind of switch is not possible
		 * float r = 10.0f;
		
			switch(r) {
		
			}
		 */
		
		// Now lets check out if switch possible for character or not
		
		char ch = 'A';
		
		switch(ch) {
		case 'a':
		case 'A':
			System.out.println("The character is a");
			break;
			
		case 'b':
		case 'B':
			System.out.println("The character is b");
			
		case 'c':
		case 'C':
			System.out.println("The character is c");
			
		default:
			System.out.println("The character is something other than a, b and c");
		}
		
		/*
		 * So notice in above switch statement which we have used for character, we have taken care of capitalization of characters with the
		 * help of extra case as we don't have any function for character to convert them into lower case first.
		 */
	}
}
