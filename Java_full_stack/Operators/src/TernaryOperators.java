
public class TernaryOperators {
	public static void main(String[] args) {
		// So here we are going to study about the ternary operator which is going to operate on 3 operands
		// Lets first consider the example of unary and binary operators
		
		int x = 5, y = 5;
		int z = x + 5;
		System.out.println("Sum is : " + x);
		// op : Sum is : 5
		// So here '+' is a binary operator and operating on two operands x and y.
		
		// Now lets consider the example of unary operator
		boolean b = true;
		
		boolean c = !b;
		System.out.println(c);
		// op: false
		// So here ! operator is a unary operator and is applied only on one operand. in this case it is applied
		// on a boolean variable b.
		
		// Now lets learn about the ternary operator and in java there is only one ternary operator
		// "?:". Lets consider the example of this operator
		
		boolean r;
		
		r = (5>6)?true:false;
		System.out.println(r);
		// So basically ternary operator is applied using three operands, the first one is the conditional test,
		// Which is either true or false. then followed by that, based on the condition, if true then second
		// operand will be returned and if it is false then 3rd operand will be returned.
		// notice that on the left hand side of equal to in the above ternary operator statement, we should be 
		// having a variable of same data type as that of operand 2 and 3 in ternary operation statement on right 
		// side of equal
		// another thing to notice here is that, the second and third operands should be something that could be assigned to the 
		// the variable which is on the left side of equal to
		
		
		// lets consider another example of ternary operator for data type int
		
		int p;
		int q = 10;
		p = (q == 10)?1:0;
		System.out.println(p);
		
		
		
		
	}
}
