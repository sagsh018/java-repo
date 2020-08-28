
public class LogicalOperators {
	public static void main(String[] args) {
		// So here we are going to study about decision making with the help of some of the operators
		// and if and else statement
		
		int x = 6;
		if (x == 5) {
			System.out.println("Value of x is 5");
		}
		else {
			System.out.println("value of x is not 5");
		}
		// So here we have seen a logical operator "==". like this there are other logical operators also:
		// !=
		// <
		// >
		// <=
		// >=
		
		// Now there are other type of variables as well named as conditional variables
		// && ==> AND operator, binary operator and result into true if only all operands are true
		// || ==> OR operator, binary operator and result into true if any one of the operand is true
		// ! ==> NOT operator, unary operator, and result into reverse of and operand.
		
		// lets see a program to use these variables
		
		int ageOfBoy = 20;
		int ageOfGirl = 18;
		
		if((ageOfBoy >= 21) && (ageOfGirl >= 18)) {
			System.out.println("The Boy and Girl can get married");
		}
		else {
			System.out.println("Boy and Girl cannot get married");
		}
	}
}
