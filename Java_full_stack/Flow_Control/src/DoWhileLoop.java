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
		
		int j = 1, k = 1;
		do {
			System.out.println("i = "+i+" "+"j = "+j);
			j++;
			k++;
		}while(j<=10 && k<=10);
		
		int m=0, n=0;
		while(m<=10 && n<=10) {
			System.out.println("m is : "+m+" "+"n is : "+n);
			m++;
			n++;
		}
	}
}
