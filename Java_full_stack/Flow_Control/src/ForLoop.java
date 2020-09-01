public class ForLoop {
	public static void main(String[] args) {
		// for loop

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		/*
		 * This loop will print values starting from 1 and all the way up to 10 1 2 3 4
		 * 5 6 7 8 9 10
		 */
		// similarly we could even print the numbers starting from 10 or any other
		// number in reverse manner like below

		for (int j = 10; j >= 1; j--) {
			System.out.println(j);
		}

		// Notice in the above for loop it is not necessary to keep all the
		// initialization, condition check and incrementation inside the
		// for loop we can even do it in the following manner

		int k = 1;
		for (;;) {
			System.out.println(k);
			if (k >= 10)
				break;
			k++;
		}

		/*
		 * infinite loop
		 * 
		 * for(;;){ System.out.println("something wrong"); } So in this case for loop
		 * will go on and on forever as the conditions we will never become false as we
		 * haven' given any condition so its never going to turn false.
		 */

		// to check whether the given number is prime or not

		int isprime = 12;
		boolean flag = true;
		for (int num = 2; num < isprime; num++) {
			if (isprime % num == 0) {
				flag = false;
				break;
			}

		}
		if (flag == true) {
			System.out.println("Number " + isprime + " is prime");
		} else {
			System.out.println("Number " + isprime + " is not prime");
		}
		
		/*
		 * Lets consider another example of having for loop based on two variables i and j instead of 1.
		 * Also notice that these i and j variables which we define in for loop, are local to the for loop and there scope is just
		 * inside the for loop only
		 */
		for (int i=0, j=0; i<=10 && j<=10; i++,j++) {
			System.out.println("i is : "+i+" and j is "+j);
		}
		
		for (int i=0, j=0; i<=10 && j<=10; i++,j++) {
			j++;
			System.out.println("i is : "+i+" and j is "+j);
		}
		
		for (int i=0, j=0; i<=10 || j<=10; i++,j++) {
			j++;
			System.out.println("i is : "+i+" and j is "+j);
		}
		
		/*
		 * So are basically all sorts of variations we can do with for loop.
		 * 
		 */
	}
}
