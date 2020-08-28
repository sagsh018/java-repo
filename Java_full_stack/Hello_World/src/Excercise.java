
public class Excercise {
	public static void main(String[] args) {
		// Suppose we want to find the solution of below equation
		// (a+b)**2 = a**2 + b**2 + 2*a*b
		// assumption:
		// the variable a should be integer and variable b should be float
		// What should be the type of result y - (a+b)**2 
		// Also we wish the final data type of a result should be integer
		
		int a = 25;
		float b = 42.159f;
		double result = a*a + b*b + 2*a*b;
		System.out.println(result);
		// 2720.561279296875
		int actual = (int) result;
		System.out.println(actual);
		// 4510
		
	} 
}
