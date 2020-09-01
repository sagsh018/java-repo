public class NestedLoop {
	public static void main(String[] args) {
		/*
		 * Nested loops
		 * So in nested loop the inner loop get executed for every iteration of outer loop.
		 */
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				System.out.println("i : "+i+" and j : "+j);
			}
		}
		
		/*
		 * Assignment 
		 * ==========
		 * @
		 * @@
		 * @@@
		 * @@@@
		 * @@@@@
		 *
		 */
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
}
